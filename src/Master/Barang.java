/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Master;

import Database.Koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MDena
 */
public class Barang extends javax.swing.JInternalFrame {

    /** Creates new form Barang */
    public Barang() {
        initComponents();
        AutoID();
        loadData();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel2_21552011440 = new javax.swing.JPanel();
        Panel_21552011440 = new javax.swing.JPanel();
        ButtonTambah2_21552011440 = new javax.swing.JButton();
        LabelNama_21552011440 = new javax.swing.JLabel();
        LabelStock_21552011440 = new javax.swing.JLabel();
        Kode_TextField_21552011440 = new javax.swing.JTextField();
        LabelHB_21552011440 = new javax.swing.JLabel();
        LabelJudul_21552011440 = new javax.swing.JLabel();
        NamaBarang_TextField_21552011440 = new javax.swing.JTextField();
        ButtonClear_21552011440 = new javax.swing.JButton();
        LabelKode_21552011440 = new javax.swing.JLabel();
        ButtonHapus2_21552011440 = new javax.swing.JButton();
        ButtonEdit2_21552011440 = new javax.swing.JButton();
        Stock_Spinner_21552011440 = new javax.swing.JSpinner();
        LabelHJ_21552011440 = new javax.swing.JLabel();
        HB_TextField_21552011440 = new javax.swing.JTextField();
        HJ_TextField_21552011440 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TBL_Barang_21552011440 = new javax.swing.JTable();
        LabelCD_21552011440 = new javax.swing.JLabel();
        CD_TextField_21552011440 = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        ButtonTambah2_21552011440.setText("Tambah");
        ButtonTambah2_21552011440.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTambah2_21552011440ActionPerformed(evt);
            }
        });

        LabelNama_21552011440.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        LabelNama_21552011440.setText("Nama Barang");

        LabelStock_21552011440.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        LabelStock_21552011440.setText("Stock");

        LabelHB_21552011440.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        LabelHB_21552011440.setText("Harga Awal");

        LabelJudul_21552011440.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        LabelJudul_21552011440.setText("DATA BARANG");

        ButtonClear_21552011440.setText("Clear");
        ButtonClear_21552011440.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClear_21552011440ActionPerformed(evt);
            }
        });

        LabelKode_21552011440.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        LabelKode_21552011440.setText("Kode Barang");

        ButtonHapus2_21552011440.setText("Hapus");
        ButtonHapus2_21552011440.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHapus2_21552011440ActionPerformed(evt);
            }
        });

        ButtonEdit2_21552011440.setText("Edit");
        ButtonEdit2_21552011440.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEdit2_21552011440ActionPerformed(evt);
            }
        });

        LabelHJ_21552011440.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        LabelHJ_21552011440.setText("Harga Satuan");

        TBL_Barang_21552011440.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Barang", "Nama Barang", "QTY", "Harga Beli", "Harga Jual"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBL_Barang_21552011440.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBL_Barang_21552011440MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TBL_Barang_21552011440);

        LabelCD_21552011440.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        LabelCD_21552011440.setText("Cari Data");

        CD_TextField_21552011440.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CD_TextField_21552011440KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout Panel_21552011440Layout = new javax.swing.GroupLayout(Panel_21552011440);
        Panel_21552011440.setLayout(Panel_21552011440Layout);
        Panel_21552011440Layout.setHorizontalGroup(
            Panel_21552011440Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_21552011440Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_21552011440Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_21552011440Layout.createSequentialGroup()
                        .addGroup(Panel_21552011440Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_21552011440Layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(ButtonClear_21552011440, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(Panel_21552011440Layout.createSequentialGroup()
                                .addComponent(LabelStock_21552011440, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(93, 93, 93)
                                .addComponent(Stock_Spinner_21552011440))
                            .addGroup(Panel_21552011440Layout.createSequentialGroup()
                                .addGroup(Panel_21552011440Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Panel_21552011440Layout.createSequentialGroup()
                                        .addComponent(LabelNama_21552011440, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(5, 5, 5))
                                    .addGroup(Panel_21552011440Layout.createSequentialGroup()
                                        .addComponent(LabelHB_21552011440, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(Panel_21552011440Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(HB_TextField_21552011440)
                                    .addComponent(NamaBarang_TextField_21552011440)))
                            .addGroup(Panel_21552011440Layout.createSequentialGroup()
                                .addComponent(LabelKode_21552011440, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Kode_TextField_21552011440, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addGap(27, 27, 27)
                        .addGroup(Panel_21552011440Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonTambah2_21552011440, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonEdit2_21552011440, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonHapus2_21552011440, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(503, 503, 503))
                    .addGroup(Panel_21552011440Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(415, 415, 415))
                    .addGroup(Panel_21552011440Layout.createSequentialGroup()
                        .addComponent(LabelHJ_21552011440, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HJ_TextField_21552011440)
                        .addGap(601, 601, 601))
                    .addGroup(Panel_21552011440Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(LabelJudul_21552011440)
                        .addGap(52, 52, 52)
                        .addComponent(LabelCD_21552011440)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CD_TextField_21552011440, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        Panel_21552011440Layout.setVerticalGroup(
            Panel_21552011440Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_21552011440Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_21552011440Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelJudul_21552011440, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel_21552011440Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CD_TextField_21552011440, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LabelCD_21552011440)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Panel_21552011440Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel_21552011440Layout.createSequentialGroup()
                        .addGroup(Panel_21552011440Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_21552011440Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(LabelKode_21552011440, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_21552011440Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Kode_TextField_21552011440, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)))
                        .addGap(20, 20, 20)
                        .addGroup(Panel_21552011440Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NamaBarang_TextField_21552011440)
                            .addComponent(LabelNama_21552011440, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(Panel_21552011440Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(ButtonTambah2_21552011440, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonEdit2_21552011440, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(7, 7, 7)))
                .addGroup(Panel_21552011440Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_21552011440Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(ButtonHapus2_21552011440, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Panel_21552011440Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Stock_Spinner_21552011440)
                        .addComponent(LabelStock_21552011440, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_21552011440Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_21552011440Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(LabelHB_21552011440, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                    .addComponent(HB_TextField_21552011440, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_21552011440Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelHJ_21552011440, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HJ_TextField_21552011440))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 29, Short.MAX_VALUE)
                .addComponent(ButtonClear_21552011440, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addGap(86, 86, 86))
        );

        javax.swing.GroupLayout Panel2_21552011440Layout = new javax.swing.GroupLayout(Panel2_21552011440);
        Panel2_21552011440.setLayout(Panel2_21552011440Layout);
        Panel2_21552011440Layout.setHorizontalGroup(
            Panel2_21552011440Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_21552011440, javax.swing.GroupLayout.PREFERRED_SIZE, 500, Short.MAX_VALUE)
        );
        Panel2_21552011440Layout.setVerticalGroup(
            Panel2_21552011440Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_21552011440, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel2_21552011440, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel2_21552011440, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonTambah2_21552011440ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTambah2_21552011440ActionPerformed
     try {
            String sql = "INSERT INTO barang VALUES ('"+Kode_TextField_21552011440.getText()+"','"
                    +NamaBarang_TextField_21552011440.getText()+"','"
                    +Stock_Spinner_21552011440.getValue()+"','"
                    +HB_TextField_21552011440.getText()+"','"
                    +HJ_TextField_21552011440.getText()+"')";
            java.sql.Connection conn=(Connection)Koneksi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
       Kode_TextField_21552011440.setEnabled(true); 
       loadData();
       AutoID();
       Bersih();
    }//GEN-LAST:event_ButtonTambah2_21552011440ActionPerformed

    private void ButtonHapus2_21552011440ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHapus2_21552011440ActionPerformed
    try {
            String sql ="delete from barang where kode_barang='"+Kode_TextField_21552011440.getText()+"'";
            java.sql.Connection conn=(Connection)Koneksi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Data Dihapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    Kode_TextField_21552011440.setEnabled(true);
    loadData();
    AutoID();
    Bersih();
    }//GEN-LAST:event_ButtonHapus2_21552011440ActionPerformed

    private void ButtonEdit2_21552011440ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEdit2_21552011440ActionPerformed
    try {
            String sql ="UPDATE barang SET kode_barang = '"+Kode_TextField_21552011440.getText()+
                    "',nama_barang = '"+NamaBarang_TextField_21552011440.getText()+
                    "',stock= '"+Stock_Spinner_21552011440.getValue()+
                    "',harga_awal= '"+HB_TextField_21552011440.getText()+
                    "',harga_satuan= '"+HJ_TextField_21552011440.getText()+
                    "' WHERE kode_barang = '"+Kode_TextField_21552011440.getText()+"'";
            java.sql.Connection conn=(Connection)Koneksi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Diedit");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Edit Data Gagal!!!"+e.getMessage());
        }
    Kode_TextField_21552011440.setEnabled(true);
    loadData();
    AutoID();
    Bersih();
    }//GEN-LAST:event_ButtonEdit2_21552011440ActionPerformed

    private void ButtonClear_21552011440ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonClear_21552011440ActionPerformed
    Bersih();
    }//GEN-LAST:event_ButtonClear_21552011440ActionPerformed

    private void TBL_Barang_21552011440MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBL_Barang_21552011440MouseClicked
    int baris = TBL_Barang_21552011440.rowAtPoint(evt.getPoint());
        String kode_barang =TBL_Barang_21552011440.getValueAt(baris, 0).toString();
        Kode_TextField_21552011440.setText(kode_barang);
        String nama_barang = TBL_Barang_21552011440.getValueAt(baris,1).toString();
        NamaBarang_TextField_21552011440.setText(nama_barang);
        String harga_beli=TBL_Barang_21552011440.getValueAt(baris, 3).toString();
        HB_TextField_21552011440.setText(harga_beli);
        String harga_jual=TBL_Barang_21552011440.getValueAt(baris, 4).toString();
        HJ_TextField_21552011440.setText(harga_jual);
        Kode_TextField_21552011440.setEnabled(false);
    }//GEN-LAST:event_TBL_Barang_21552011440MouseClicked

    private void CD_TextField_21552011440KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CD_TextField_21552011440KeyReleased
        String key=CD_TextField_21552011440.getText();
        System.out.println(key);

        if(key!=""){
            cariData(key);
        }else{
            loadData();
        }
    }//GEN-LAST:event_CD_TextField_21552011440KeyReleased

    public final void loadData() {
        DefaultTableModel model = new DefaultTableModel();
        TBL_Barang_21552011440.setModel(model);
        model.addColumn("Kode Barang");
        model.addColumn("Nama Barang");
        model.addColumn("Stock");
        model.addColumn("Harga Awal");
        model.addColumn("Harga Satuan");
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        try {
            Connection c = Koneksi.configDB();
            Statement s = c.createStatement();

            String sql = "SELECT * FROM barang";
            ResultSet r = s.executeQuery(sql);

            while (r.next()) {
                Object[] o = new Object[5];
                o[0] = r.getString("kode_barang");
                o[1] = r.getString("nama_barang");
                o[2] = r.getObject("stock");
                o[3] = r.getString("harga_awal");
                o[4] = r.getString("harga_satuan");
               
                model.addRow(o);
            }
            r.close();
            s.close();
        } catch (SQLException e) {
            System.out.println("Terjadi Error");
        }
   }
    
    public void AutoID() {
        try {
            String sql = "SELECT * FROM barang ORDER BY kode_barang DESC";
            java.sql.Connection conn=(Connection)Koneksi.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet rs=stm.executeQuery(sql);
            if (rs.next()) {
                String kode_barang = rs.getString("kode_barang").substring(2);
                String BR = "" + (Integer.parseInt(kode_barang) + 1);
                String No = "";

                if(BR.length()==1)
                {No = "000";}
                else if(BR.length()==2)
                {No = "00";}
                else if(BR.length()==3)
                {No = "0";}
                else if(BR.length()==4)
                {No = "";}
                Kode_TextField_21552011440.setText("BR" + No + BR);
            } else {
                Kode_TextField_21552011440.setText("BR0001");
            }
            rs.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void cariData(String key){
        try{
            DefaultTableModel model = new DefaultTableModel();
            Object[] judul_kolom = {"Kode Barang", "Nama Barang", "Stock", "Harga Awal", "Harga Satuan"};
            model=new DefaultTableModel(null,judul_kolom);
            TBL_Barang_21552011440.setModel(model);
            
            Connection conn=(Connection)Koneksi.configDB();
            Statement stt=conn.createStatement();
            model.getDataVector().removeAllElements();
            
            String sql = ("SELECT * from barang WHERE kode_barang LIKE '%"+key+"%' OR nama_barang LIKE '%"+key+"%'");  
            ResultSet rs = stt.executeQuery(sql);
            while(rs.next()){
                Object[] data={
                    rs.getString("kode_barang"),
                    rs.getString("nama_barang"),
                    rs.getString("stock"),
                    rs.getString("harga_awal"),
                    rs.getString("harga_satuan"),       
                };
               model.addRow(data);
            }                
        } catch (Exception ex) {
        System.err.println(ex.getMessage());
        }
    }
    
    private void Bersih(){
        NamaBarang_TextField_21552011440.setText("");
        HB_TextField_21552011440.setText("");
        HJ_TextField_21552011440.setText("");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonClear_21552011440;
    private javax.swing.JButton ButtonEdit2_21552011440;
    private javax.swing.JButton ButtonHapus2_21552011440;
    private javax.swing.JButton ButtonTambah2_21552011440;
    private javax.swing.JTextField CD_TextField_21552011440;
    private javax.swing.JTextField HB_TextField_21552011440;
    private javax.swing.JTextField HJ_TextField_21552011440;
    private javax.swing.JTextField Kode_TextField_21552011440;
    private javax.swing.JLabel LabelCD_21552011440;
    private javax.swing.JLabel LabelHB_21552011440;
    private javax.swing.JLabel LabelHJ_21552011440;
    private javax.swing.JLabel LabelJudul_21552011440;
    private javax.swing.JLabel LabelKode_21552011440;
    private javax.swing.JLabel LabelNama_21552011440;
    private javax.swing.JLabel LabelStock_21552011440;
    private javax.swing.JTextField NamaBarang_TextField_21552011440;
    private javax.swing.JPanel Panel2_21552011440;
    private javax.swing.JPanel Panel_21552011440;
    private javax.swing.JSpinner Stock_Spinner_21552011440;
    private javax.swing.JTable TBL_Barang_21552011440;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

}