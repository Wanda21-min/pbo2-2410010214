/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package id.ac.uniska.pbo2.p03;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

public class FormPendaftaran extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormPendaftaran.class.getName());

    /**
     * Creates new form FormPendaftaran
     */
    public FormPendaftaran() {
        initComponents();
        
        // Kode tambahan ditulis setelah initComponents(), di luar blok abu-abu buatan NetBeans
        namaField.putClientProperty("JTextField.placeholderText", "Nama lengkap");
        npmField.putClientProperty("JTextField.placeholderText", "Contoh: 2410010001");
        getRootPane().setDefaultButton(daftarButton);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jenisKelaminGroup = new javax.swing.ButtonGroup();
        namaLabel = new javax.swing.JLabel();
        npmLabel = new javax.swing.JLabel();
        prodiLabel = new javax.swing.JLabel();
        jenisKelaminLabel = new javax.swing.JLabel();
        minatLabel = new javax.swing.JLabel();
        namaField = new javax.swing.JTextField();
        npmField = new javax.swing.JTextField();
        prodiCombo = new javax.swing.JComboBox<>();
        lakiRadio = new javax.swing.JRadioButton();
        perempuanRadio = new javax.swing.JRadioButton();
        javaCheck = new javax.swing.JCheckBox();
        pythonCheck = new javax.swing.JCheckBox();
        webCheck = new javax.swing.JCheckBox();
        temaToggle = new javax.swing.JToggleButton();
        daftarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Pendaftaran Workshop");

        namaLabel.setText("Nama :");

        npmLabel.setText("NPM :");

        prodiLabel.setText("Program Studi :");

        jenisKelaminLabel.setText("Jenis Kelamin :");

        minatLabel.setText("Minat :");

        namaField.addActionListener(this::namaFieldActionPerformed);

        npmField.addActionListener(this::npmFieldActionPerformed);

        prodiCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknik Informatika", "Sistem Informasi", "Manajemen Informatika" }));
        prodiCombo.addActionListener(this::prodiComboActionPerformed);

        jenisKelaminGroup.add(lakiRadio);
        lakiRadio.setSelected(true);
        lakiRadio.setText("Laki-laki");

        jenisKelaminGroup.add(perempuanRadio);
        perempuanRadio.setText("Perempuan");

        javaCheck.setText("Java");
        javaCheck.addActionListener(this::javaCheckActionPerformed);

        pythonCheck.setText("Python");

        webCheck.setText("Web");

        temaToggle.setText("Mode Gelap");
        temaToggle.addActionListener(this::temaToggleActionPerformed);

        daftarButton.setText("Daftar");
        daftarButton.addActionListener(this::daftarButtonActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(minatLabel)
                    .addComponent(npmLabel)
                    .addComponent(namaLabel)
                    .addComponent(prodiLabel)
                    .addComponent(jenisKelaminLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lakiRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(perempuanRadio))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(javaCheck)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pythonCheck)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(webCheck)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prodiCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namaField)
                            .addComponent(npmField)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(daftarButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(temaToggle)
                                .addGap(0, 31, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(namaLabel)
                                            .addComponent(namaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(npmLabel))
                                    .addComponent(npmField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addComponent(prodiLabel))
                            .addComponent(prodiCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jenisKelaminLabel))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lakiRadio)
                        .addComponent(perempuanRadio)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(minatLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(javaCheck)
                        .addComponent(pythonCheck)
                        .addComponent(webCheck)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(temaToggle)
                    .addComponent(daftarButton))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaFieldActionPerformed

    private void npmFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_npmFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_npmFieldActionPerformed

    private void prodiComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodiComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodiComboActionPerformed

    private void javaCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_javaCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_javaCheckActionPerformed

    private void temaToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temaToggleActionPerformed
        gantiTema(temaToggle.isSelected());
    }//GEN-LAST:event_temaToggleActionPerformed
    private void daftarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarButtonActionPerformed
        tampilkanRingkasan();
    }//GEN-LAST:event_daftarButtonActionPerformed

    private void tampilkanRingkasan() {
        String jenisKelamin = lakiRadio.isSelected() ? "Laki-laki" : "Perempuan";
        
        List<String> minat = new ArrayList<>();
        for (JCheckBox cb : List.of(javaCheck, pythonCheck, webCheck)) {
            if (cb.isSelected()) {
                minat.add(cb.getText());
            }
        }
        String pesan = "Nama: " + namaField.getText()
            + "\nNPM: " + npmField.getText()
            + "\nProgram Studi: " + prodiCombo.getSelectedItem()
            + "\nJenis Kelamin: " + jenisKelamin
            + "\nMinat: " + (minat.isEmpty() ? "-" : String.join(", ", minat));
        JOptionPane.showMessageDialog(this, pesan, "Data Pendaftaran",
            JOptionPane.INFORMATION_MESSAGE);
    }
    private void gantiTema(boolean gelap) {
        if (gelap) {
            FlatDarkLaf.setup();
        } else {
            FlatLightLaf.setup();
        }
        FlatLaf.updateUI(); // terapkan tema baru ke semua jendela yang terbuka
        temaToggle.setText(gelap ? "Mode Terang" : "Mode Gelap");
    }
    public static void main(String args[]) {
        FlatLightLaf.setup();
        
        java.awt.EventQueue.invokeLater(() -> new FormPendaftaran().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton daftarButton;
    private javax.swing.JCheckBox javaCheck;
    private javax.swing.ButtonGroup jenisKelaminGroup;
    private javax.swing.JLabel jenisKelaminLabel;
    private javax.swing.JRadioButton lakiRadio;
    private javax.swing.JLabel minatLabel;
    private javax.swing.JTextField namaField;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JTextField npmField;
    private javax.swing.JLabel npmLabel;
    private javax.swing.JRadioButton perempuanRadio;
    private javax.swing.JComboBox<String> prodiCombo;
    private javax.swing.JLabel prodiLabel;
    private javax.swing.JCheckBox pythonCheck;
    private javax.swing.JToggleButton temaToggle;
    private javax.swing.JCheckBox webCheck;
    // End of variables declaration//GEN-END:variables
}
