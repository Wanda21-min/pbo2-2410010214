// Nama : Muhammad Ruwanda
// NPM  : 2410010214

package id.ac.uniska.pbo2.uts;

/**
 * Data satu barang belanja beserta perhitungan subtotalnya.
 * Nilai uang memakai long agar aman untuk jumlah yang besar.
 */
public record Barang(String nama, Kategori kategori, long harga, int jumlah) {

    /** Subtotal = harga dikali jumlah. */
    public long subtotal() {
        return harga * jumlah;
    }
}
