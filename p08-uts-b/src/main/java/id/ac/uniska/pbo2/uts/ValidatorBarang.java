// Nama : Muhammad Ruwanda
// NPM  : 2410010214

package id.ac.uniska.pbo2.uts;

public final class ValidatorBarang {

    public static final long HARGA_MAKSIMAL = 10_000_000;

    private ValidatorBarang() {
    }

    /** Nama wajib diisi */
    public static String nama(String nama, BarangTableModel model) {
        if (nama == null || nama.isBlank()) {
            return "Nama barang wajib diisi";
        }
        Barang sama = model.cari(nama);
        if (sama != null) {
            return "Barang " + sama.nama() + " sudah ada di daftar";
        }
        return null;
    }

    /** Harga berupa angka bulat. */
    public static String harga(String teks) {
        String pesan = "Harga harus angka 1 sampai " + HARGA_MAKSIMAL;
        if (teks == null || !teks.trim().matches("\\d{1,8}")) {
            return pesan;
        }
        long nilai = Long.parseLong(teks.trim());
        if (nilai < 1 || nilai > HARGA_MAKSIMAL) {
            return pesan;
        }
        return null;
    }
}
