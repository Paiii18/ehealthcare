/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tampilan;

import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import java.io.File;
import java.sql.Connection;
import java.util.HashMap;
import javax.swing.JOptionPane;
import koneksi.koneksi;
import login.login;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Asus
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menu() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        menubar = new javax.swing.JMenuBar();
        menu_home = new javax.swing.JMenu();
        menu_logout = new javax.swing.JMenuItem();
        menu_master = new javax.swing.JMenu();
        menu_pasien = new javax.swing.JMenuItem();
        menu_dokter = new javax.swing.JMenuItem();
        menu_obat = new javax.swing.JMenuItem();
        menu_pelayanan = new javax.swing.JMenu();
        menu_pemeriksaan = new javax.swing.JMenuItem();
        menu_kamar = new javax.swing.JMenuItem();
        menu_pembayaran = new javax.swing.JMenuItem();
        menu_laporan = new javax.swing.JMenu();
        data_dokter = new javax.swing.JMenuItem();
        data_pasien = new javax.swing.JMenuItem();
        data_pemeriksaan = new javax.swing.JMenuItem();
        data_resep = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/hospital.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        menu_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-home-24.png"))); // NOI18N
        menu_home.setText("Home");

        menu_logout.setText("Logout");
        menu_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_logoutActionPerformed(evt);
            }
        });
        menu_home.add(menu_logout);

        menubar.add(menu_home);

        menu_master.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-pencil-24.png"))); // NOI18N
        menu_master.setText("Master");

        menu_pasien.setText("Pasien");
        menu_pasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_pasienActionPerformed(evt);
            }
        });
        menu_master.add(menu_pasien);

        menu_dokter.setText("Dokter");
        menu_dokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_dokterActionPerformed(evt);
            }
        });
        menu_master.add(menu_dokter);

        menu_obat.setText("Obat");
        menu_obat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_obatActionPerformed(evt);
            }
        });
        menu_master.add(menu_obat);

        menubar.add(menu_master);

        menu_pelayanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-person-24.png"))); // NOI18N
        menu_pelayanan.setText("Pelayanan");

        menu_pemeriksaan.setText("Rekam Medis");
        menu_pemeriksaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_pemeriksaanActionPerformed(evt);
            }
        });
        menu_pelayanan.add(menu_pemeriksaan);

        menu_kamar.setText("Kamar");
        menu_kamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_kamarActionPerformed(evt);
            }
        });
        menu_pelayanan.add(menu_kamar);

        menu_pembayaran.setText("Pembayaran");
        menu_pembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_pembayaranActionPerformed(evt);
            }
        });
        menu_pelayanan.add(menu_pembayaran);

        menubar.add(menu_pelayanan);

        menu_laporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-print-24.png"))); // NOI18N
        menu_laporan.setText("Laporan");

        data_dokter.setText("Laporan Data Dokter");
        menu_laporan.add(data_dokter);

        data_pasien.setText("Laporan Data Pasien");
        menu_laporan.add(data_pasien);

        data_pemeriksaan.setText("Laporan Data Rekam Medis");
        menu_laporan.add(data_pemeriksaan);

        data_resep.setText("Laporan Data Pembayaran");
        menu_laporan.add(data_resep);

        menubar.add(menu_laporan);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menu_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_logoutActionPerformed
        // TODO add your handling code here:
        new login().setVisible(true);
        dispose();
    }//GEN-LAST:event_menu_logoutActionPerformed

    private void menu_dokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_dokterActionPerformed
        // TODO add your handling code here:
        new dokter().setVisible(true);
        dispose();
    }//GEN-LAST:event_menu_dokterActionPerformed

    private void menu_pasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_pasienActionPerformed
        // TODO add your handling code here:
        new pasien().setVisible(true);
        dispose();
    }//GEN-LAST:event_menu_pasienActionPerformed

    private void menu_obatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_obatActionPerformed
        // TODO add your handling code here:
        new obat().setVisible(true);
        dispose();
    }//GEN-LAST:event_menu_obatActionPerformed

    private void menu_pemeriksaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_pemeriksaanActionPerformed
        // TODO add your handling code here:
        new rekammedis().setVisible(true);
        dispose();
    }//GEN-LAST:event_menu_pemeriksaanActionPerformed

    private void menu_pembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_pembayaranActionPerformed
        // TODO add your handling code here:
        new pembayaran().setVisible(true);
        dispose();
    }//GEN-LAST:event_menu_pembayaranActionPerformed

    private void menu_kamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_kamarActionPerformed
        // TODO add your handling code here:
        new kamar().setVisible(true);
        dispose();
    }//GEN-LAST:event_menu_kamarActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem data_dokter;
    private javax.swing.JMenuItem data_pasien;
    private javax.swing.JMenuItem data_pemeriksaan;
    private javax.swing.JMenuItem data_resep;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem menu_dokter;
    private javax.swing.JMenu menu_home;
    private javax.swing.JMenuItem menu_kamar;
    private javax.swing.JMenu menu_laporan;
    private javax.swing.JMenuItem menu_logout;
    private javax.swing.JMenu menu_master;
    private javax.swing.JMenuItem menu_obat;
    private javax.swing.JMenuItem menu_pasien;
    private javax.swing.JMenu menu_pelayanan;
    private javax.swing.JMenuItem menu_pembayaran;
    private javax.swing.JMenuItem menu_pemeriksaan;
    private javax.swing.JMenuBar menubar;
    // End of variables declaration//GEN-END:variables
}
