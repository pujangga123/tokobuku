/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TokoBuku;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author En Tay
 */
public class FormDetailBarang extends javax.swing.JFrame {

    /**
     * Creates new form DetailBarang
     */
    public FormDetailBarang() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textNama = new javax.swing.JTextField();
        comboJenis = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        textHarga = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textKode = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tombolTambah = new javax.swing.JButton();
        tombolBatal = new javax.swing.JButton();
        tombolUpdate = new javax.swing.JButton();
        tombolHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nama");

        comboJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ATK", "Buku", "Makanan" }));

        jLabel2.setText("Jenis");

        jLabel3.setText("Harga");

        jLabel4.setText("Kode");

        tombolTambah.setText("Tambah");
        tombolTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolTambahActionPerformed(evt);
            }
        });

        tombolBatal.setText("Batal");
        tombolBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolBatalActionPerformed(evt);
            }
        });

        tombolUpdate.setText("Update");
        tombolUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolUpdateActionPerformed(evt);
            }
        });

        tombolHapus.setText(" Hapus");
        tombolHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tombolTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tombolHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tombolUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tombolBatal))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(textNama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                        .addComponent(textKode, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(textHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 179, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tombolBatal, tombolTambah});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombolBatal)
                    .addComponent(tombolUpdate)
                    .addComponent(tombolTambah)
                    .addComponent(tombolHapus))
                .addGap(18, 18, 18))
        );

        textKode.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tombolBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolBatalActionPerformed
        setVisible(false);
    }//GEN-LAST:event_tombolBatalActionPerformed

    private void tombolTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolTambahActionPerformed
        Connection conn;
        try {
            conn = Global.db();
            
            // baca data
            String kode = textKode.getText();
            String nama = textNama.getText();
            String jenis = comboJenis.getSelectedItem().toString();
            int harga = Integer.parseInt(textHarga.getText());
            
            // SQL
            String sql = "insert into barang (kode, nama, jenis, harga) values (?,?,?,?)";
            
            // siapkan statement untuk INSERT
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, kode);
            pst.setString(2, nama);
            pst.setString(3, jenis);
            pst.setInt(4, harga);
            
            // eksekusi SQL
            pst.execute(); 
            
            // hapus objek 
            pst.close();
            conn.close();
            
            // tampilkan pesan
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage().toString());
        } 
        
    }//GEN-LAST:event_tombolTambahActionPerformed

    private void tombolUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolUpdateActionPerformed
        Connection conn;
        try {                
            // pada bagian ini kita menggunakan Global.db(), untuk menggantikan perintah:
            // Class.forName dan DriverManager.getConnection
            conn = Global.db();  // ingat, ganti kata Global dengan nama Anda.

            // baca data
            String kode = textKode.getText();
            String nama = textNama.getText();
            String jenis = comboJenis.getSelectedItem().toString();
            int harga = Integer.parseInt(textHarga.getText());

            // SQL
            String sql = "update barang set nama=?, jenis=?, harga=? where kode=?";

            // siapkan statement untuk INSERT
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, nama);
            pst.setString(2, jenis);
            pst.setInt(3, harga);
            pst.setString(4, kode);

            // eksekusi SQL
            pst.execute(); 

            // hapus objek 
            pst.close();
            conn.close();

            // tampilkan pesan
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage().toString());
        } 
    }//GEN-LAST:event_tombolUpdateActionPerformed

    private void tombolHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolHapusActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Konfirmasi", "Yakin hapus item ini?",  JOptionPane.DEFAULT_OPTION)==0) {
            Connection conn;
            try {
                conn = Global.db();

                // baca data
                String kode = textKode.getText();

                // SQL
                String sql = "delete from barang where kode=?";

                // siapkan statement untuk INSERT
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, kode);

                // eksekusi SQL
                pst.execute(); 

                // hapus objek 
                pst.close();
                conn.close();

                // tampilkan pesan
                JOptionPane.showMessageDialog(null, "Data dihapus");
            } catch(Exception e) {
                //JOptionPane.showMessageDialog(null,e.getMessage().toString());
                JOptionPane.showMessageDialog(null,e.getMessage().toString());
            } 
        }
        
    }//GEN-LAST:event_tombolHapusActionPerformed

    public void baca(String kode) {
        tombolTambah.setVisible(false);
        tombolUpdate.setVisible(true);
        tombolHapus.setVisible(true);
        
        Connection conn;
        try {
            Class.forName(Global.DBDRIVER);
            conn = DriverManager.getConnection(Global.DBCONNECTION,Global.DBUSER, Global.DBPASS);
 
            Statement st;
            st = conn.createStatement();
            ResultSet rs;
            rs = st.executeQuery("select * from barang where kode='"+kode+"'");
            if(rs.next()) {
                textKode.setText(rs.getString("kode"));
                textNama.setText(rs.getString("nama"));
            }
            st.close();
            rs.close();
            conn.close();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,"gagal baca");
        } 
        setVisible(true);
    }
    
    public void baru() {
        textKode.setText("");
        textNama.setText("");
        comboJenis.setSelectedIndex(0);
        textHarga.setText("0");
        setVisible(true);
        
        tombolUpdate.setVisible(false);
        tombolTambah.setVisible(true);
        tombolHapus.setVisible(false);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormDetailBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDetailBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDetailBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDetailBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDetailBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboJenis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField textHarga;
    private javax.swing.JTextField textKode;
    private javax.swing.JTextField textNama;
    private javax.swing.JButton tombolBatal;
    private javax.swing.JButton tombolHapus;
    private javax.swing.JButton tombolTambah;
    private javax.swing.JButton tombolUpdate;
    // End of variables declaration//GEN-END:variables
}
