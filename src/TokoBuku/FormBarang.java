/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TokoBuku;

import java.awt.Point;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author En Tay
 */
public class FormBarang extends javax.swing.JFrame {

    /**
     * Creates new form MasterBarang
     */
    public FormBarang() {
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

        tombolSelesai = new javax.swing.JButton();
        tombolTambah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBarang = new javax.swing.JTable();
        tombolReload = new javax.swing.JButton();

        setTitle("Master Barang");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tombolSelesai.setText("Selesai");
        tombolSelesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolSelesaiActionPerformed(evt);
            }
        });

        tombolTambah.setText("Tambah");
        tombolTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolTambahActionPerformed(evt);
            }
        });

        tabelBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode", "Nama"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelBarang.setColumnSelectionAllowed(true);
        tabelBarang.getTableHeader().setReorderingAllowed(false);
        tabelBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBarangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabelBarangMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tabelBarang);
        tabelBarang.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        tombolReload.setText("Reload");
        tombolReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolReloadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tombolReload)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tombolTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tombolSelesai)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombolSelesai)
                    .addComponent(tombolTambah)
                    .addComponent(tombolReload))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tombolSelesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolSelesaiActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_tombolSelesaiActionPerformed

    private void tombolTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolTambahActionPerformed
        new FormDetailBarang().baru();
    }//GEN-LAST:event_tombolTambahActionPerformed

    private void tombolReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolReloadActionPerformed
        try {
            // deklarasi
            Connection conn;
            PreparedStatement st;
            ResultSet rs;
            
            // bersihkan tabel
            // hapus setiap baris pada jTabel
            DefaultTableModel model = (DefaultTableModel) tabelBarang.getModel();
            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }

            // buat objek conn untuk koneksi database
            conn = Global.db();
            
            // siapkan statement untuk baca data
            String sql ="select * from barang";
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();

            // loop baca setiap data 
            String kode;
            String nama;
            while (rs.next()) {
                kode = rs.getString("kode");
                nama = rs.getString("nama");
                // tambahkan data yang dibaca sebagai baris baru di jTable
                model.addRow(new Object[]{kode, nama});
            }
            rs.close();
            st.close();
            conn.close();
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage());
        }
    }//GEN-LAST:event_tombolReloadActionPerformed

    private void tabelBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBarangMouseClicked
        // membaca nomor baris yang diklik
        Point p = evt.getPoint();
        int row = tabelBarang.rowAtPoint(p);

        // ambil kode barang dari baris yang di klik
        String kode = tabelBarang.getModel().getValueAt(row, 0).toString();

        // untuk percobaan, menamtampilkan 'kode'
        // JOptionPane.showMessageDialog(null, kode);
        // buat objek FormDetailBarang
        FormDetailBarang f = new FormDetailBarang();
        f.baca(kode); // kirim 'kode' lewat fungsi 'baca'
    }//GEN-LAST:event_tabelBarangMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        tombolReload.doClick();
    }//GEN-LAST:event_formWindowOpened

    private void tabelBarangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBarangMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelBarangMouseEntered

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
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelBarang;
    private javax.swing.JButton tombolReload;
    private javax.swing.JButton tombolSelesai;
    private javax.swing.JButton tombolTambah;
    // End of variables declaration//GEN-END:variables
}
