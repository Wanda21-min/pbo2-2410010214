package id.ac.uniska.pbo2.p05;

import javax.swing.JOptionPane;
import com.formdev.flatlaf.FlatLightLaf;

/**
 * Form Anggota Perpustakaan
 */
public class FormAnggotaPerpustakaan extends javax.swing.JFrame {

    private static final int PANJANG_NPM = 10;
    
    /** Membuat form baru. */
    public FormAnggotaPerpustakaan() {
        initComponents();
        
        // gaya huruf FlatLaf, placeholder, dan tombol default
        judulLabel.putClientProperty("FlatLaf.styleClass", "h2");
        keteranganLabel.putClientProperty("FlatLaf.style", "foreground: $Label.disabledForeground");
        dataAnggotaLabel.putClientProperty("FlatLaf.styleClass", "h4");
        kontakLabel.putClientProperty("FlatLaf.styleClass", "h4");
        persetujuanLabel.putClientProperty("FlatLaf.styleClass", "h4");
        emailField.putClientProperty("JTextField.placeholderText", "nama@www.com");
        hpField.putClientProperty("JTextField.placeholderText", "08xxxxxxxxxx");
        getRootPane().setDefaultButton(daftarButton);
        perbaruiHitungDigit();
        pack(); // hitung ulang ukuran setelah gaya huruf berubah
        setMinimumSize(getSize()); // jendela tidak dapat dikecilkan melebihi ukuran awal
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jenisGroup = new javax.swing.ButtonGroup();
        headerPanel = new javax.swing.JPanel();
        judulLabel = new javax.swing.JLabel();
        keteranganLabel = new javax.swing.JLabel();
        isiPanel = new javax.swing.JPanel();
        formPanel = new javax.swing.JPanel();
        dataAnggotaLabel = new javax.swing.JLabel();
        npmLabel = new javax.swing.JLabel();
        npmField = new javax.swing.JTextField();
        namaLabel = new javax.swing.JLabel();
        namaField = new javax.swing.JTextField();
        prodiLabel = new javax.swing.JLabel();
        prodiCombo = new javax.swing.JComboBox<>();
        jenisLabel = new javax.swing.JLabel();
        jenisPanel = new javax.swing.JPanel();
        mahasiswaRadio = new javax.swing.JRadioButton();
        dosenRadio = new javax.swing.JRadioButton();
        umumRadio = new javax.swing.JRadioButton();
        kontakLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        hpLabel = new javax.swing.JLabel();
        hpField = new javax.swing.JTextField();
        alamatLabel = new javax.swing.JLabel();
        alamatScroll = new javax.swing.JScrollPane();
        alamatArea = new javax.swing.JTextArea();
        persetujuanLabel = new javax.swing.JLabel();
        setujuCheck = new javax.swing.JCheckBox();
        digitLabel = new javax.swing.JLabel();
        tombolPanel = new javax.swing.JPanel();
        batalButton = new javax.swing.JButton();
        daftarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Form Anggota Perpustakaan");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        headerPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 16, 8, 16));
        headerPanel.setLayout(new javax.swing.BoxLayout(headerPanel, javax.swing.BoxLayout.Y_AXIS));

        judulLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        judulLabel.setText("Form Anggota Perpustakaan");
        headerPanel.add(judulLabel);

        keteranganLabel.setText("Lengkapi data keanggotaan perpustakaan.");
        headerPanel.add(keteranganLabel);

        getContentPane().add(headerPanel, java.awt.BorderLayout.NORTH);

        isiPanel.setLayout(new java.awt.BorderLayout());

        formPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 16, 8, 16));
        formPanel.setLayout(new java.awt.GridBagLayout());

        dataAnggotaLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dataAnggotaLabel.setText("Data Anggota");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 6, 0);
        formPanel.add(dataAnggotaLabel, gridBagConstraints);

        npmLabel.setLabelFor(npmField);
        npmLabel.setText("NPM");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 12);
        formPanel.add(npmLabel, gridBagConstraints);

        npmField.setColumns(20);
        npmField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                npmFieldKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        formPanel.add(npmField, gridBagConstraints);

        namaLabel.setLabelFor(namaField);
        namaLabel.setText("Nama lengkap");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 12);
        formPanel.add(namaLabel, gridBagConstraints);

        namaField.setColumns(20);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        formPanel.add(namaField, gridBagConstraints);

        prodiLabel.setLabelFor(prodiCombo);
        prodiLabel.setText("Program studi");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 12);
        formPanel.add(prodiLabel, gridBagConstraints);

        prodiCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknik Informatika", "Sistem Informasi", "Teknik Elektro", "Teknik Mesin" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        formPanel.add(prodiCombo, gridBagConstraints);

        jenisLabel.setLabelFor(mahasiswaRadio);
        jenisLabel.setText("Jenis anggota");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 12);
        formPanel.add(jenisLabel, gridBagConstraints);

        jenisPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        jenisGroup.add(mahasiswaRadio);
        mahasiswaRadio.setSelected(true);
        mahasiswaRadio.setText("Mahasiswa");
        jenisPanel.add(mahasiswaRadio);

        jenisGroup.add(dosenRadio);
        dosenRadio.setText("Dosen");
        jenisPanel.add(dosenRadio);

        jenisGroup.add(umumRadio);
        umumRadio.setText("Umum");
        jenisPanel.add(umumRadio);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        formPanel.add(jenisPanel, gridBagConstraints);

        kontakLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        kontakLabel.setText("Kontak");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 0, 6, 0);
        formPanel.add(kontakLabel, gridBagConstraints);

        emailLabel.setLabelFor(emailField);
        emailLabel.setText("Email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 12);
        formPanel.add(emailLabel, gridBagConstraints);

        emailField.setColumns(20);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        formPanel.add(emailField, gridBagConstraints);

        hpLabel.setLabelFor(hpField);
        hpLabel.setText("Nomor HP");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 12);
        formPanel.add(hpLabel, gridBagConstraints);

        hpField.setColumns(20);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        formPanel.add(hpField, gridBagConstraints);

        alamatLabel.setLabelFor(alamatArea);
        alamatLabel.setText("Alamat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 12);
        formPanel.add(alamatLabel, gridBagConstraints);

        alamatArea.setColumns(20);
        alamatArea.setLineWrap(true);
        alamatArea.setRows(4);
        alamatArea.setWrapStyleWord(true);
        alamatScroll.setViewportView(alamatArea);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        formPanel.add(alamatScroll, gridBagConstraints);

        persetujuanLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        persetujuanLabel.setText("Persetujuan");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 0, 6, 0);
        formPanel.add(persetujuanLabel, gridBagConstraints);

        setujuCheck.setText("Setuju dengan tata tertib perpustakaan");
        setujuCheck.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                setujuCheckItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 0);
        formPanel.add(setujuCheck, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        formPanel.add(digitLabel, gridBagConstraints);

        isiPanel.add(formPanel, java.awt.BorderLayout.NORTH);

        getContentPane().add(isiPanel, java.awt.BorderLayout.CENTER);

        tombolPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 16, 16, 16));
        tombolPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 8, 0));

        batalButton.setText("Batal");
        batalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalButtonActionPerformed(evt);
            }
        });
        tombolPanel.add(batalButton);

        daftarButton.setText("Daftar");
        daftarButton.setEnabled(false);
        daftarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarButtonActionPerformed(evt);
            }
        });
        tombolPanel.add(daftarButton);

        getContentPane().add(tombolPanel, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setujuCheckItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_setujuCheckItemStateChanged
        daftarButton.setEnabled(setujuCheck.isSelected());
    }//GEN-LAST:event_setujuCheckItemStateChanged

    private void batalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalButtonActionPerformed
        kosongkan();
    }//GEN-LAST:event_batalButtonActionPerformed

    private void daftarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarButtonActionPerformed
        String npm = npmField.getText().trim();
        String nama = namaField.getText().trim();
        
        if (npm.isEmpty() || nama.isEmpty()) {
            JOptionPane.showMessageDialog(this, "NPM dan nama wajib diisi.", "Data belum lengkap", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String jenis = mahasiswaRadio.isSelected() ? "Mahasiswa" : dosenRadio.isSelected() ? "Dosen" : "Umum";
        String ringkasan = "NPM           : " + npm + "\n"
                     + "Nama          : " + nama + "\n"
                     + "Program studi : " + prodiCombo.getSelectedItem() + "\n"
                     + "Jenis anggota : " + jenis + "\n"
                     + "Email         : " + emailField.getText().trim() + "\n"
                     + "Nomor HP      : " + hpField.getText().trim() + "\n"
                     + "Alamat        : " + alamatArea.getText().trim();
        JOptionPane.showMessageDialog(this, ringkasan,"Ringkasan Pendaftaran", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_daftarButtonActionPerformed

    private void npmFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_npmFieldKeyReleased
        perbaruiHitungDigit();
    }//GEN-LAST:event_npmFieldKeyReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int jawab = JOptionPane.showConfirmDialog(this,"Keluar dari aplikasi?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (jawab == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    private void perbaruiHitungDigit() {
        int jumlah = 0;
        for (char c : npmField.getText().toCharArray()) {
            if (Character.isDigit(c)) {
                jumlah++;
            }
        }
        digitLabel.setText(jumlah + " dari " + PANJANG_NPM + " digit");
    }
 
    /** Mengosongkan semua isian dan mengembalikan fokus ke NPM. */
    private void kosongkan() {
        npmField.setText("");
        namaField.setText("");
        emailField.setText("");
        hpField.setText("");
        alamatArea.setText("");
        prodiCombo.setSelectedIndex(0);
        mahasiswaRadio.setSelected(true);
        setujuCheck.setSelected(false);   
        perbaruiHitungDigit();
        npmField.requestFocusInWindow();
    }
    public static void main(String args[]) {
        FlatLightLaf.setup();
        
        // Tampilkan form di Event Dispatch Thread
        java.awt.EventQueue.invokeLater(() -> new FormAnggotaPerpustakaan().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamatArea;
    private javax.swing.JLabel alamatLabel;
    private javax.swing.JScrollPane alamatScroll;
    private javax.swing.JButton batalButton;
    private javax.swing.JButton daftarButton;
    private javax.swing.JLabel dataAnggotaLabel;
    private javax.swing.JLabel digitLabel;
    private javax.swing.JRadioButton dosenRadio;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JPanel formPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JTextField hpField;
    private javax.swing.JLabel hpLabel;
    private javax.swing.JPanel isiPanel;
    private javax.swing.ButtonGroup jenisGroup;
    private javax.swing.JLabel jenisLabel;
    private javax.swing.JPanel jenisPanel;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JLabel keteranganLabel;
    private javax.swing.JLabel kontakLabel;
    private javax.swing.JRadioButton mahasiswaRadio;
    private javax.swing.JTextField namaField;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JTextField npmField;
    private javax.swing.JLabel npmLabel;
    private javax.swing.JLabel persetujuanLabel;
    private javax.swing.JComboBox<String> prodiCombo;
    private javax.swing.JLabel prodiLabel;
    private javax.swing.JCheckBox setujuCheck;
    private javax.swing.JPanel tombolPanel;
    private javax.swing.JRadioButton umumRadio;
    // End of variables declaration//GEN-END:variables
}
