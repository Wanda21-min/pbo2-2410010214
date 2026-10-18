/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package id.ac.uniska.pbo2.p04;

import com.formdev.flatlaf.FlatLightLaf;


/**
 *
 * @author Wanda
 */
public class GaleriLayout extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GaleriLayout.class.getName());

    /**
     * Creates new form GaleriLayout
     */
    public GaleriLayout() {
        initComponents();
        
        // Kode tambahan: gaya huruf judul dan ukuran awal jendela
        catatanJudulLabel.putClientProperty("FlatLaf.styleClass", "h3");
        setSize(640, 400);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        layoutTab = new javax.swing.JTabbedPane();
        borderlayoutPanel = new javax.swing.JPanel();
        westBtn = new javax.swing.JButton();
        centerBtn = new javax.swing.JButton();
        eastBtn = new javax.swing.JButton();
        northBtn = new javax.swing.JButton();
        southBtn = new javax.swing.JButton();
        flowPanel = new javax.swing.JPanel();
        baruBtn = new javax.swing.JButton();
        bukaBtn = new javax.swing.JButton();
        simpanBtn = new javax.swing.JButton();
        simpansebagaiBtn = new javax.swing.JButton();
        cetakBtn = new javax.swing.JButton();
        bagikanBtn = new javax.swing.JButton();
        keluarBtn = new javax.swing.JButton();
        gridPanel = new javax.swing.JPanel();
        Btn1 = new javax.swing.JButton();
        Btn2 = new javax.swing.JButton();
        Btn3 = new javax.swing.JButton();
        Btn4 = new javax.swing.JButton();
        Btn5 = new javax.swing.JButton();
        Btn6 = new javax.swing.JButton();
        Btn7 = new javax.swing.JButton();
        Btn8 = new javax.swing.JButton();
        Btn9 = new javax.swing.JButton();
        gridBagPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        boxPanel = new javax.swing.JPanel();
        dashboardBtn = new javax.swing.JButton();
        datamahasiswaBtn = new javax.swing.JButton();
        datamatakuliahBtn = new javax.swing.JButton();
        laporanBtn = new javax.swing.JButton();
        gabunganPanel = new javax.swing.JPanel();
        catatanJudulLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        catatanTextArea = new javax.swing.JTextArea();
        hariPanel = new javax.swing.JPanel();
        seninBtn = new javax.swing.JButton();
        selasaBtn = new javax.swing.JButton();
        rabuBtn = new javax.swing.JButton();
        aksiPanel = new javax.swing.JPanel();
        hapusBtn = new javax.swing.JButton();
        simpanButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Galeri Layout Manager");

        borderlayoutPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 12, 12, 12));
        borderlayoutPanel.setLayout(new java.awt.BorderLayout(8, 8));

        westBtn.setText("West");
        borderlayoutPanel.add(westBtn, java.awt.BorderLayout.LINE_START);

        centerBtn.setText("Center");
        centerBtn.addActionListener(this::centerBtnActionPerformed);
        borderlayoutPanel.add(centerBtn, java.awt.BorderLayout.CENTER);

        eastBtn.setText("East");
        borderlayoutPanel.add(eastBtn, java.awt.BorderLayout.LINE_END);

        northBtn.setText("North");
        borderlayoutPanel.add(northBtn, java.awt.BorderLayout.PAGE_START);

        southBtn.setText("South");
        borderlayoutPanel.add(southBtn, java.awt.BorderLayout.PAGE_END);

        layoutTab.addTab("BorderLayout", borderlayoutPanel);

        flowPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 8, 8));

        baruBtn.setText("Baru");
        flowPanel.add(baruBtn);

        bukaBtn.setText("Buka");
        flowPanel.add(bukaBtn);

        simpanBtn.setText("Simpan");
        flowPanel.add(simpanBtn);

        simpansebagaiBtn.setText("Simpan Sebagai");
        flowPanel.add(simpansebagaiBtn);

        cetakBtn.setText("Cetak");
        flowPanel.add(cetakBtn);

        bagikanBtn.setText("Bagikan");
        flowPanel.add(bagikanBtn);

        keluarBtn.setText("Keluar");
        flowPanel.add(keluarBtn);

        layoutTab.addTab("FlowLayout", flowPanel);

        gridPanel.setLayout(new java.awt.GridLayout(3, 3, 8, 8));

        Btn1.setText("1");
        gridPanel.add(Btn1);

        Btn2.setText("2");
        gridPanel.add(Btn2);

        Btn3.setText("3");
        gridPanel.add(Btn3);

        Btn4.setText("4");
        gridPanel.add(Btn4);

        Btn5.setText("5");
        gridPanel.add(Btn5);

        Btn6.setText("6");
        Btn6.addActionListener(this::Btn6ActionPerformed);
        gridPanel.add(Btn6);

        Btn7.setText("7");
        gridPanel.add(Btn7);

        Btn8.setText("8");
        gridPanel.add(Btn8);

        Btn9.setText("9");
        gridPanel.add(Btn9);

        gridBagPanel.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("jLabel1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 12);
        gridBagPanel.add(jLabel1, gridBagConstraints);

        jTextField1.setText("jTextField1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        gridBagPanel.add(jTextField1, gridBagConstraints);

        gridPanel.add(gridBagPanel);

        layoutTab.addTab("GridLayout", gridPanel);

        boxPanel.setLayout(new javax.swing.BoxLayout(boxPanel, javax.swing.BoxLayout.Y_AXIS));

        dashboardBtn.setText("Dashboard");
        boxPanel.add(dashboardBtn);

        datamahasiswaBtn.setText("Data Mahasiswa");
        boxPanel.add(datamahasiswaBtn);

        datamatakuliahBtn.setText("Data Mata Kuliah");
        boxPanel.add(datamatakuliahBtn);

        laporanBtn.setText("Laporan");
        boxPanel.add(laporanBtn);

        layoutTab.addTab("BoxLayout", boxPanel);

        gabunganPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 12, 12, 12));
        gabunganPanel.setLayout(new java.awt.BorderLayout(8, 8));

        catatanJudulLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        catatanJudulLabel.setText("Catatan Harian");
        gabunganPanel.add(catatanJudulLabel, java.awt.BorderLayout.NORTH);

        catatanTextArea.setColumns(20);
        catatanTextArea.setRows(5);
        catatanTextArea.setText("Tulis catatan di sini");
        jScrollPane1.setViewportView(catatanTextArea);

        gabunganPanel.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        hariPanel.setLayout(new javax.swing.BoxLayout(hariPanel, javax.swing.BoxLayout.Y_AXIS));

        seninBtn.setText("Senin");
        hariPanel.add(seninBtn);

        selasaBtn.setText("Selasa");
        hariPanel.add(selasaBtn);

        rabuBtn.setText("Rabu");
        hariPanel.add(rabuBtn);

        gabunganPanel.add(hariPanel, java.awt.BorderLayout.WEST);

        aksiPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 8, 0));

        hapusBtn.setText("Hapus");
        aksiPanel.add(hapusBtn);

        simpanButton.setText("Simpan");
        aksiPanel.add(simpanButton);

        gabunganPanel.add(aksiPanel, java.awt.BorderLayout.SOUTH);

        layoutTab.addTab("Gabungan", gabunganPanel);

        getContentPane().add(layoutTab, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void centerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_centerBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_centerBtnActionPerformed

    private void Btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn6ActionPerformed

    public static void main(String args[]) {
        // Blok Nimbus buatan NetBeans diganti dengan tema FlatLaf
        FlatLightLaf.setup();
        
        // Tampilkan form di Event Dispatch Thread
        java.awt.EventQueue.invokeLater(() -> new GaleriLayout().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn1;
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JButton Btn5;
    private javax.swing.JButton Btn6;
    private javax.swing.JButton Btn7;
    private javax.swing.JButton Btn8;
    private javax.swing.JButton Btn9;
    private javax.swing.JPanel aksiPanel;
    private javax.swing.JButton bagikanBtn;
    private javax.swing.JButton baruBtn;
    private javax.swing.JPanel borderlayoutPanel;
    private javax.swing.JPanel boxPanel;
    private javax.swing.JButton bukaBtn;
    private javax.swing.JLabel catatanJudulLabel;
    private javax.swing.JTextArea catatanTextArea;
    private javax.swing.JButton centerBtn;
    private javax.swing.JButton cetakBtn;
    private javax.swing.JButton dashboardBtn;
    private javax.swing.JButton datamahasiswaBtn;
    private javax.swing.JButton datamatakuliahBtn;
    private javax.swing.JButton eastBtn;
    private javax.swing.JPanel flowPanel;
    private javax.swing.JPanel gabunganPanel;
    private javax.swing.JPanel gridBagPanel;
    private javax.swing.JPanel gridPanel;
    private javax.swing.JButton hapusBtn;
    private javax.swing.JPanel hariPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton keluarBtn;
    private javax.swing.JButton laporanBtn;
    private javax.swing.JTabbedPane layoutTab;
    private javax.swing.JButton northBtn;
    private javax.swing.JButton rabuBtn;
    private javax.swing.JButton selasaBtn;
    private javax.swing.JButton seninBtn;
    private javax.swing.JButton simpanBtn;
    private javax.swing.JButton simpanButton;
    private javax.swing.JButton simpansebagaiBtn;
    private javax.swing.JButton southBtn;
    private javax.swing.JButton westBtn;
    // End of variables declaration//GEN-END:variables
}
