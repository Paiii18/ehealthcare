/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tampilan;

import cari.cariDokter;
import cari.cariObat;
import cari.cariPasien;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;

/**
 *
 * @author Asus
 */
public class rekammedis extends javax.swing.JFrame {

    private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    public String idPas, namaPas, idDok, namaDok, idObat, namaObat;

    public String getIdPas() {
        return idPas;
    }

    public String getNamaPas() {
        return namaPas;
    }

    public String getIdDok() {
        return idDok;
    }

    public String getNamaDok() {
        return namaDok;
    }

    public String getIdObat() {
        return idObat;
    }

    public String getNamaObat() {
        return namaObat;
    }

    /**
     * Creates new form Pemeriksaan
     */
    public rekammedis() {
        initComponents();
        datatable();
    }

    protected void kosong() {
        tidrekam.setText("");
        tiddokter.setText("");
        tidobat.setText("");
        tidpasien.setText("");
        tnamadokter.setText("");
        tnama_obat.setText("");
        tglperiksa.setDate(null);
        tnama_pasien.setText("");
        tgejala.setText("");
        tdiagnosis.setText("");
    }

    protected void datatable() {
        Object[] Baris = {"ID Periksa", "Nama Dokter", "Nama Pasien", "Tanggal", "Gejala", "Diagnosis", "tindakan"};
        DefaultTableModel tabmode = new DefaultTableModel(null, Baris);
        tablepemeriksaan.setModel(tabmode);

        String sql = "SELECT rekam_medis.id_rekammedis, dokter.nama_dokter, pasien.nama_pasien, rekam_medis.tanggal_periksa, rekam_medis.gejala, rekam_medis.diagnosis, rekam_medis.tindakan "
                + "FROM rekam_medis "
                + "JOIN dokter ON rekam_medis.id_dokter = dokter.id_dokter "
                + "JOIN pasien ON rekam_medis.id_pasien = pasien.id_pasien";

        try {
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String a = hasil.getString("id_rekammedis");
                String b = hasil.getString("nama_dokter");
                String c = hasil.getString("nama_pasien");
                String d = hasil.getString("tanggal_periksa");
                String e = hasil.getString("gejala");
                String f = hasil.getString("diagnosis");
                String g = hasil.getString("tindakan");

                String[] data = {a, b, c, d, e, f, g};
                tabmode.addRow(data);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void pasienTerpilih() {
        cariPasien cp = new cariPasien();
        cp.rekam = this;
        tidpasien.setText(idPas);
        tnama_pasien.setText(namaPas);
    }

    public void dokterTerpilih() {
        cariDokter cd = new cariDokter();
        cd.rekam = this;
        tiddokter.setText(idDok);
        tnamadokter.setText(namaDok);
    }

    public void obatTerpilih() {
        cariObat co = new cariObat();
        co.rekam = this;
        tidobat.setText(idObat);
        tnama_obat.setText(namaObat);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tglperiksa = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tgejala = new javax.swing.JTextArea();
        tdiagnosis = new javax.swing.JTextField();
        bsimpan = new javax.swing.JButton();
        bperbarui = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        bkembali = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablepemeriksaan = new javax.swing.JTable();
        bcari_dokter = new javax.swing.JButton();
        tnama_obat = new javax.swing.JTextField();
        bcari_pasien = new javax.swing.JButton();
        tnama_pasien = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tnamadokter = new javax.swing.JTextField();
        bcari_obat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tidrekam = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tiddokter = new javax.swing.JTextField();
        tidpasien = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tidobat = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cbtindakan = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Nama Dokter");

        jLabel5.setText("Nama Pasien");

        jLabel6.setText("Tanggal Periksa");

        jLabel7.setText("Gejala");

        jLabel8.setText("Diagnosis");

        tgejala.setColumns(20);
        tgejala.setRows(5);
        jScrollPane1.setViewportView(tgejala);

        bsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save.png"))); // NOI18N
        bsimpan.setText("Simpan");
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });

        bperbarui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/update.png"))); // NOI18N
        bperbarui.setText("Perbarui");
        bperbarui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bperbaruiActionPerformed(evt);
            }
        });

        bhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete.png"))); // NOI18N
        bhapus.setText("Hapus");
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });

        bkembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/back.png"))); // NOI18N
        bkembali.setText("Kembali");
        bkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkembaliActionPerformed(evt);
            }
        });

        tablepemeriksaan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablepemeriksaan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablepemeriksaanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablepemeriksaan);

        bcari_dokter.setText("...");
        bcari_dokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcari_dokterActionPerformed(evt);
            }
        });

        bcari_pasien.setText("...");
        bcari_pasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcari_pasienActionPerformed(evt);
            }
        });

        jLabel10.setText("Obat");

        tnamadokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnamadokterActionPerformed(evt);
            }
        });

        bcari_obat.setText("...");
        bcari_obat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcari_obatActionPerformed(evt);
            }
        });

        jLabel1.setText("Id Rekam");

        tidrekam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tidrekamActionPerformed(evt);
            }
        });

        jLabel2.setText("Id Dokter");

        jLabel4.setText("Id Obat");

        tiddokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiddokterActionPerformed(evt);
            }
        });

        jLabel9.setText("Id Pasien");

        jLabel11.setText("Tindakan");

        cbtindakan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rawat Inap", "Boleh Pulang", "Rawat Jalan" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bsimpan)
                                .addGap(18, 18, 18)
                                .addComponent(bperbarui)
                                .addGap(20, 20, 20)
                                .addComponent(bhapus)
                                .addGap(20, 20, 20)
                                .addComponent(bkembali)))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(tidrekam, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(tnama_pasien, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(tnama_obat, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tidobat, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bcari_obat))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tiddokter, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bcari_dokter))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tidpasien, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bcari_pasien))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(tnamadokter, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(219, 219, 219)
                                .addComponent(jLabel7)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(95, 95, 95)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tglperiksa, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tdiagnosis)
                                            .addComponent(cbtindakan, 0, 242, Short.MAX_VALUE))))
                                .addGap(20, 20, 20))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(tglperiksa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tdiagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(cbtindakan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tidrekam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tiddokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(bcari_dokter))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tnamadokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tidpasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bcari_pasien))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tnama_pasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tidobat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bcari_obat))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(7, 7, 7))
                            .addComponent(tnama_obat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bperbarui)
                    .addComponent(bhapus)
                    .addComponent(bkembali)
                    .addComponent(bsimpan))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
        // TODO add your handling code here:
        try {
            String idRekam = tidrekam.getText();
            String idDokter = tiddokter.getText();
            String idPasien = tidpasien.getText();
            String idObat = tidobat.getText();
            String gejala = tgejala.getText();
            String diagnosis = tdiagnosis.getText();
            String tindakan = cbtindakan.getSelectedItem().toString();
            java.util.Date tanggalPeriksa = tglperiksa.getDate();
            java.sql.Date sqlDate = new java.sql.Date(tanggalPeriksa.getTime());

            String sql = "INSERT INTO rekam_medis (id_rekammedis, id_dokter, id_pasien, id_obat, gejala, diagnosis, tindakan, tanggal_periksa) VALUES (?,?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, idRekam);
            pstmt.setString(2, idDokter);
            pstmt.setString(3, idPasien);
            pstmt.setString(4, idObat);
            pstmt.setString(5, gejala);
            pstmt.setString(6, diagnosis);
            pstmt.setString(7, tindakan);
            pstmt.setDate(8, sqlDate);
//      
            pstmt.executeUpdate();
            pstmt.close();

            datatable();
            kosong();
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan!");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_bsimpanActionPerformed

    private void bperbaruiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bperbaruiActionPerformed
        try {
            String idRekam = tidrekam.getText();
            String idDokter = tiddokter.getText();
            String idPasien = tidpasien.getText();
            String idObat = tidobat.getText();
            String gejala = tgejala.getText();
            String diagnosis = tdiagnosis.getText();
            String tindakan = cbtindakan.getSelectedItem().toString();
            java.util.Date tanggalPeriksa = tglperiksa.getDate();
            java.sql.Date sqlDate = new java.sql.Date(tanggalPeriksa.getTime());

            String sql = "UPDATE rekam_medis SET id_dokter= ?, id_pasien= ?, id_obat= ?,  gejala = ?, diagnosis = ?, tindakan= ?, tanggal_periksa= ? WHERE id_rekammedis= ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, idDokter);
            pstmt.setString(2, idPasien);
            pstmt.setString(3, idObat);
            pstmt.setString(4, gejala);
            pstmt.setString(5, diagnosis);
            pstmt.setString(6, tindakan);
            pstmt.setDate(7, sqlDate);
            pstmt.setString(8, idRekam);
            pstmt.executeUpdate();
            pstmt.close();

            datatable();
            kosong();
            JOptionPane.showMessageDialog(null, "Data berhasil diperbarui!");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_bperbaruiActionPerformed

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
        try {
            String idRekam = tidrekam.getText();

            String sql = "DELETE FROM rekam_medis WHERE id_rekammedis= ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, idRekam);
            pstmt.executeUpdate();
            pstmt.close();

            datatable();
            kosong();
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_bhapusActionPerformed

    private void bkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkembaliActionPerformed
        // TODO add your handling code here:
        new menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_bkembaliActionPerformed

    private void bcari_dokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcari_dokterActionPerformed
        cariDokter cd = new cariDokter();
        cd.rekam = this;
        cd.setVisible(true);
        cd.setResizable(false);
        tiddokter.setEnabled(false);
        tnamadokter.setEnabled(false);
    }//GEN-LAST:event_bcari_dokterActionPerformed

    private void bcari_pasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcari_pasienActionPerformed
        cariPasien cp = new cariPasien();
        cp.rekam = this;
        cp.setVisible(true);
        cp.setResizable(false);
        tidpasien.setEnabled(false);
        tnama_pasien.setEnabled(false);
    }//GEN-LAST:event_bcari_pasienActionPerformed

    private void tablepemeriksaanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablepemeriksaanMouseClicked
        int row = tablepemeriksaan.rowAtPoint(evt.getPoint());
        if (row >= 0) {
            String idRekamMedis = tablepemeriksaan.getValueAt(row, 0).toString();
            String namaDokter = tablepemeriksaan.getValueAt(row, 1).toString();
            String namaPasien = tablepemeriksaan.getValueAt(row, 2).toString();
            String tanggal = tablepemeriksaan.getValueAt(row, 3).toString();
            String gejala = tablepemeriksaan.getValueAt(row, 4).toString();
            String diagnosis = tablepemeriksaan.getValueAt(row, 5).toString();
            String tindakan = tablepemeriksaan.getValueAt(row, 6).toString();

            tidrekam.setText(idRekamMedis);
            tnamadokter.setText(namaDokter);
            tnama_pasien.setText(namaPasien);
            cbtindakan.setSelectedItem(tindakan);

            try {
                java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(tanggal);
                tglperiksa.setDate(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            tgejala.setText(gejala);
            tdiagnosis.setText(diagnosis);
        }
    }//GEN-LAST:event_tablepemeriksaanMouseClicked

    private void bcari_obatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcari_obatActionPerformed
        cariObat co = new cariObat();
        co.rekam = this;
        co.setVisible(true);
        co.setResizable(false);
        tidobat.setEnabled(false);
        tnama_obat.setEnabled(false);
    }//GEN-LAST:event_bcari_obatActionPerformed

    private void tnamadokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnamadokterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnamadokterActionPerformed

    private void tiddokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiddokterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tiddokterActionPerformed

    private void tidrekamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tidrekamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tidrekamActionPerformed

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
            java.util.logging.Logger.getLogger(rekammedis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rekammedis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rekammedis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rekammedis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rekammedis().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcari_dokter;
    private javax.swing.JButton bcari_obat;
    private javax.swing.JButton bcari_pasien;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton bkembali;
    private javax.swing.JButton bperbarui;
    private javax.swing.JButton bsimpan;
    private javax.swing.JComboBox<String> cbtindakan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablepemeriksaan;
    private javax.swing.JTextField tdiagnosis;
    private javax.swing.JTextArea tgejala;
    private com.toedter.calendar.JDateChooser tglperiksa;
    private javax.swing.JTextField tiddokter;
    private javax.swing.JTextField tidobat;
    private javax.swing.JTextField tidpasien;
    private javax.swing.JTextField tidrekam;
    private javax.swing.JTextField tnama_obat;
    private javax.swing.JTextField tnama_pasien;
    private javax.swing.JTextField tnamadokter;
    // End of variables declaration//GEN-END:variables
}
