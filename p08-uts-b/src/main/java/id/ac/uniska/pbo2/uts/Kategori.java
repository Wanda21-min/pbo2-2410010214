// Nama : Muhammad Ruwanda
// NPM  : 2410010214

package id.ac.uniska.pbo2.uts;

/**
 * Kategori barang. Nilai dari toString() dipakai sebagai teks di JComboBox dan tabel.
 */
public enum Kategori {
    ALAT_TULIS("Alat Tulis"),
    MAKANAN("Makanan"),
    MINUMAN("Minuman"),
    LAINNYA("Lainnya");

    private final String label;

    Kategori(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
