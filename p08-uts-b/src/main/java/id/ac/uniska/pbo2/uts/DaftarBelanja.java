// Nama : Muhammad Ruwanda
// NPM  : 2410010214

package id.ac.uniska.pbo2.uts;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;




/**
 * Jendela Daftar Belanja: form isian, tabel barang, dan ringkasan total, diskon, bayar.
 */
public class DaftarBelanja extends javax.swing.JFrame {

    // Dibuat sebelum initComponents() karena dipakai sebagai model JTable
    private final BarangTableModel model = new BarangTableModel();

    /** Membuat form baru. */
    public DaftarBelanja() {
        initComponents();

        // Kode tambahan yang tidak tersedia di jendela Properties
        hargaField.putClientProperty("JTextField.placeholderText", "Tanpa titik, contoh 15000");
        pesanLabel.setForeground(warnaKesalahan());
        getRootPane().setDefaultButton(tambahButton); // Enter sama dengan menekan Tambah

        // Harga, jumlah, dan subtotal rata kanan; judul kolom rata tengah
        DefaultTableCellRenderer kanan = new DefaultTableCellRenderer();
        kanan.setHorizontalAlignment(SwingConstants.RIGHT);
        for (int kolom = 2; kolom <= 4; kolom++) {
            barangTable.getColumnModel().getColumn(kolom).setCellRenderer(kanan);
        }
        if (barangTable.getTableHeader().getDefaultRenderer() instanceof DefaultTableCellRenderer judul) {
            judul.setHorizontalAlignment(SwingConstants.CENTER);
        }

        perbaruiRingkasan();
        pack();
        setMinimumSize(getSize());
        setSize(900, 520);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        kiriPanel = new javax.swing.JPanel();
        formPanel = new javax.swing.JPanel();
        namaLabel = new javax.swing.JLabel();
        namaField = new javax.swing.JTextField();
        kategoriLabel = new javax.swing.JLabel();
        kategoriCombo = new javax.swing.JComboBox<>();
        hargaLabel = new javax.swing.JLabel();
        hargaField = new javax.swing.JTextField();
        jumlahLabel = new javax.swing.JLabel();
        jumlahSpinner = new javax.swing.JSpinner();
        pesanLabel = new javax.swing.JLabel();
        tombolPanel = new javax.swing.JPanel();
        tambahButton = new javax.swing.JButton();
        bersihkanButton = new javax.swing.JButton();
        tabelPanel = new javax.swing.JPanel();
        tabelScroll = new javax.swing.JScrollPane();
        barangTable = new javax.swing.JTable();
        ringkasanLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Daftar Belanja");

        kiriPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 12, 12, 6));
        kiriPanel.setLayout(new java.awt.BorderLayout());

        formPanel.setLayout(new java.awt.GridBagLayout());

        namaLabel.setLabelFor(namaField);
        namaLabel.setText("Nama Barang");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 12);
        formPanel.add(namaLabel, gridBagConstraints);

        namaField.setColumns(18);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        formPanel.add(namaField, gridBagConstraints);

        kategoriLabel.setLabelFor(kategoriCombo);
        kategoriLabel.setText("Kategori");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 12);
        formPanel.add(kategoriLabel, gridBagConstraints);

        kategoriCombo.setModel(new javax.swing.DefaultComboBoxModel<>(Kategori.values()));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        formPanel.add(kategoriCombo, gridBagConstraints);

        hargaLabel.setLabelFor(hargaField);
        hargaLabel.setText("Harga (Rp)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 12);
        formPanel.add(hargaLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        formPanel.add(hargaField, gridBagConstraints);

        jumlahLabel.setLabelFor(jumlahSpinner);
        jumlahLabel.setText("Jumlah");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 12);
        formPanel.add(jumlahLabel, gridBagConstraints);

        jumlahSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        formPanel.add(jumlahSpinner, gridBagConstraints);

        pesanLabel.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 0, 0);
        formPanel.add(pesanLabel, gridBagConstraints);

        tombolPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 8, 0));

        tambahButton.setText("Tambah");
        tambahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahButtonActionPerformed(evt);
            }
        });
        tombolPanel.add(tambahButton);

        bersihkanButton.setText("Bersihkan");
        bersihkanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bersihkanButtonActionPerformed(evt);
            }
        });
        tombolPanel.add(bersihkanButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        formPanel.add(tombolPanel, gridBagConstraints);

        kiriPanel.add(formPanel, java.awt.BorderLayout.NORTH);

        getContentPane().add(kiriPanel, java.awt.BorderLayout.WEST);

        tabelPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 6, 10, 12));
        tabelPanel.setLayout(new java.awt.BorderLayout(0, 8));

        barangTable.setModel(model);
        tabelScroll.setViewportView(barangTable);

        tabelPanel.add(tabelScroll, java.awt.BorderLayout.CENTER);

        ringkasanLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ringkasanLabel.setText("Total Rp0, diskon Rp0, bayar Rp0");
        tabelPanel.add(ringkasanLabel, java.awt.BorderLayout.SOUTH);

        getContentPane().add(tabelPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tambahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahButtonActionPerformed
        tambah();
    }//GEN-LAST:event_tambahButtonActionPerformed

    private void bersihkanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bersihkanButtonActionPerformed
        kembalikanKeAwal();
    }//GEN-LAST:event_bersihkanButtonActionPerformed

    /** Memeriksa isian; jika valid, barang ditambahkan dan form dikembalikan ke keadaan awal. */
    private void tambah() {
        String nama = namaField.getText().trim();
        String teksHarga = hargaField.getText().trim();

        String kesalahan = ValidatorBarang.nama(nama, model);
        if (kesalahan != null) {
            tolak(kesalahan, namaField);
            return;
        }
        kesalahan = ValidatorBarang.harga(teksHarga);
        if (kesalahan != null) {
            tolak(kesalahan, hargaField);
            return;
        }

        Kategori kategori = (Kategori) kategoriCombo.getSelectedItem();
        int jumlah = (Integer) jumlahSpinner.getValue();
        model.tambah(new Barang(nama, kategori, Long.parseLong(teksHarga), jumlah));
        kembalikanKeAwal();
        perbaruiRingkasan();
    }

    /** Menampilkan pesan kesalahan dan memindahkan kursor ke isian yang salah; isian lain tidak diubah. */
    private void tolak(String pesan, JComponent isian) {
        pesanLabel.setText(pesan);
        isian.requestFocusInWindow();
    }

    /** Mengosongkan nama dan harga, memilih kategori pertama, jumlah 1, dan menghapus pesan. */
    private void kembalikanKeAwal() {
        namaField.setText("");
        hargaField.setText("");
        kategoriCombo.setSelectedIndex(0);
        jumlahSpinner.setValue(1);
        pesanLabel.setText(" ");
        namaField.requestFocusInWindow();
    }

    private void perbaruiRingkasan() {
        ringkasanLabel.setText("Total " + Rupiah.format(model.total())
                + ", diskon " + Rupiah.format(model.diskon())
                + ", bayar " + Rupiah.format(model.bayar()));
    }

    /** Merah yang mudah dibaca: lebih gelap di tema terang, lebih terang di tema gelap. */
    static Color warnaKesalahan() {
        return FlatLaf.isLafDark() ? new Color(0xFF8A80) : new Color(0xC62828);
    }

    public static void main(String args[]) {
        FlatLightLaf.setup();

        // Tampilkan form di Event Dispatch Thread
        java.awt.EventQueue.invokeLater(() -> new DaftarBelanja().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable barangTable;
    private javax.swing.JButton bersihkanButton;
    private javax.swing.JPanel formPanel;
    private javax.swing.JTextField hargaField;
    private javax.swing.JLabel hargaLabel;
    private javax.swing.JLabel jumlahLabel;
    private javax.swing.JSpinner jumlahSpinner;
    private javax.swing.JComboBox<Kategori> kategoriCombo;
    private javax.swing.JLabel kategoriLabel;
    private javax.swing.JPanel kiriPanel;
    private javax.swing.JTextField namaField;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JLabel pesanLabel;
    private javax.swing.JLabel ringkasanLabel;
    private javax.swing.JPanel tabelPanel;
    private javax.swing.JScrollPane tabelScroll;
    private javax.swing.JButton tambahButton;
    private javax.swing.JPanel tombolPanel;
    // End of variables declaration//GEN-END:variables
}
