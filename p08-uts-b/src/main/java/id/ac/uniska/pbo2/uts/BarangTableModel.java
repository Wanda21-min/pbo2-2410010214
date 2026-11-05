// Nama : Muhammad Ruwanda
// NPM  : 2410010214

package id.ac.uniska.pbo2.uts;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Menghubungkan daftar Barang dengan JTable.
 */
public class BarangTableModel extends AbstractTableModel {

    private static final String[] KOLOM = {"Nama Barang", "Kategori", "Harga", "Jumlah", "Subtotal"};
    private static final long DISKON_MINIMAL_TOTAL = 100_000;
    private static final long DISKON_PERSEN = 10;

    private final List<Barang> daftar = new ArrayList<>();

    @Override
    public int getRowCount() {
        return daftar.size();
    }

    @Override
    public int getColumnCount() {
        return KOLOM.length;
    }

    @Override
    public String getColumnName(int kolom) {
        return KOLOM[kolom];
    }

    @Override
    public Object getValueAt(int baris, int kolom) {
        Barang b = daftar.get(baris);
        return switch (kolom) {
            case 0 -> b.nama();
            case 1 -> b.kategori();
            case 2 -> Rupiah.format(b.harga());
            case 3 -> b.jumlah();
            default -> Rupiah.format(b.subtotal());
        };
    }

    public void tambah(Barang barang) {
        daftar.add(barang);
        int baris = daftar.size() - 1;
        fireTableRowsInserted(baris, baris); // tampilkan baris baru
    }

    /** Mencari barang dengan nama yang sama tanpa membedakan huruf besar dan kecil. */
    public Barang cari(String nama) {
        for (Barang b : daftar) {
            if (b.nama().equalsIgnoreCase(nama.trim())) {
                return b;
            }
        }
        return null;
    }

    /** Total = jumlah seluruh subtotal. */
    public long total() {
        long jumlah = 0;
        for (Barang b : daftar) {
            jumlah += b.subtotal();
        }
        return jumlah;
    }

    /** Diskon. */
    public long diskon() {
        long total = total();
        return total >= DISKON_MINIMAL_TOTAL ? total * DISKON_PERSEN / 100 : 0;
    }

    /** Bayar = total dikurangi diskon. */
    public long bayar() {
        return total() - diskon();
    }
}
