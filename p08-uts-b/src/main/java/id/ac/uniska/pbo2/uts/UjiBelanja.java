// Nama : Muhammad Ruwanda
// NPM  : 2410010214

package id.ac.uniska.pbo2.uts;

public class UjiBelanja {

    private static int gagal = 0;

    private static void cek(String nama, Object hasil, Object harapan) {
        boolean sesuai = String.valueOf(hasil).equals(String.valueOf(harapan));
        if (!sesuai) {
            gagal++;
        }
        System.out.println((sesuai ? "SESUAI " : "SALAH ") + nama + ": " + hasil
                + (sesuai ? "" : " (harapan " + harapan + ")"));
    }

    private static BarangTableModel modelDengan(long... harga) {
        BarangTableModel model = new BarangTableModel();
        for (int i = 0; i < harga.length; i++) {
            model.tambah(new Barang("Barang " + i, Kategori.LAINNYA, harga[i], 1));
        }
        return model;
    }

    public static void main(String[] args) {
        // Contoh
        BarangTableModel contoh = new BarangTableModel();
        contoh.tambah(new Barang("Pulpen", Kategori.ALAT_TULIS, 3500, 4));
        contoh.tambah(new Barang("Buku Tulis", Kategori.ALAT_TULIS, 6000, 10));
        contoh.tambah(new Barang("Tas Bekal", Kategori.LAINNYA, 26000, 1));
        contoh.tambah(new Barang("Spidol", Kategori.ALAT_TULIS, 12500, 2));
        cek("Subtotal Pulpen", Rupiah.format(contoh.cari("pulpen").subtotal()), "Rp14.000");
        cek("Total", Rupiah.format(contoh.total()), "Rp125.000");
        cek("Diskon", Rupiah.format(contoh.diskon()), "Rp12.500");
        cek("Bayar", Rupiah.format(contoh.bayar()), "Rp112.500");

        // Batas diskon
        cek("Total 99999 tanpa diskon", modelDengan(99_999).diskon(), 0);
        cek("Total 100000 diskon 10000", modelDengan(100_000).diskon(), 10_000);
        cek("Total 100009 dibulatkan ke bawah", modelDengan(100_009).diskon(), 10_000);
        cek("Total 0", Rupiah.format(modelDengan().bayar()), "Rp0");

        // Validasi nama
        cek("Nama kosong", ValidatorBarang.nama("", contoh), "Nama barang wajib diisi");
        cek("Nama hanya spasi", ValidatorBarang.nama("    ", contoh), "Nama barang wajib diisi");
        cek("Nama kembar huruf kecil", ValidatorBarang.nama("pulpen", contoh), "Barang Pulpen sudah ada di daftar");
        cek("Nama kembar huruf besar", ValidatorBarang.nama("SPIDOL", contoh), "Barang Spidol sudah ada di daftar");
        cek("Nama baru", ValidatorBarang.nama("Penggaris", contoh), null);

        // Validasi harga
        String pesan = "Harga harus angka 1 sampai 10000000";
        cek("Harga kosong", ValidatorBarang.harga(""), pesan);
        cek("Harga berisi titik", ValidatorBarang.harga("15.000"), pesan);
        cek("Harga berisi huruf", ValidatorBarang.harga("12ab"), pesan);
        cek("Harga nol", ValidatorBarang.harga("0"), pesan);
        cek("Harga melebihi batas", ValidatorBarang.harga("10000001"), pesan);
        cek("Harga sangat panjang", ValidatorBarang.harga("99999999999999999999"), pesan);
        cek("Harga batas bawah", ValidatorBarang.harga("1"), null);
        cek("Harga batas atas", ValidatorBarang.harga("10000000"), null);

        System.out.println();
        System.out.println(gagal == 0 ? "Semua aturan bekerja sesuai harapan" : gagal + " aturan belum sesuai");
    }
}
