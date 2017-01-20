/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerTeman;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelTeman;
import util.Koneksi;

/**
 *
 * @author TOSHIBA
 */
public class ViewTeman extends javax.swing.JPanel {

    ControllerTeman ct = new ControllerTeman();
    ModelTeman mt = new ModelTeman();
    Koneksi koneksi = new Koneksi();

    /**
     * Creates new form ViewTeman
     */
    public ViewTeman() {
        initComponents();
        tampilTeman();
    }

     private void tampilTeman() {
        koneksi.koneksiDatabase();

        DefaultTableModel tabel = new DefaultTableModel();

        tabel.addColumn("ID");
        tabel.addColumn("Nama Teman");
        tabel.addColumn("Nomor Handphone");
        tabel.addColumn("Email");

        jTabelTeman.setModel(tabel);
        try {
            String sql = "select * from tbl_teman";

            ResultSet res = koneksi.state.executeQuery(sql);
            while (res.next()) {
                tabel.addRow(new Object[]{
                    res.getString("id"),
                    res.getString("nama"),
                    res.getString("nope"),
                    res.getString("email")
                });
                jTabelTeman.setModel(tabel);

            }
        } catch (SQLException eer) {
            System.err.println("SQLException:" + eer.getMessage());
        }
    }
     
     
      private void tombolBaru() {
        jTextFieldNama.setEditable(true);
        jTextFieldHp.setEditable(true);
        jTextFieldEmail.setEditable(true);
        jTextFieldNama.requestFocus();
        bersihJTextField();
    }

    private void tombolBatal() {
        jTextFieldNama.setEditable(false);
        jTextFieldHp.setEditable(false);
        jTextFieldEmail.setEditable(false);
        bersihJTextField();
        jButtonSimpan.setEnabled(false);
        jButtonBaru.setText("Baru");
    }
    
    private void bersihJTextField(){
        jTextFieldId.setText("");
        jTextFieldNama.setText("");
        jTextFieldHp.setText("");
        jTextFieldEmail.setText("");
    }
    
    private void tabelKlik(){
        jButtonHapus.setEnabled(true);
        jButtonUbah.setEnabled(true);
    }
    private void tabelUnKlik(){
        jButtonHapus.setEnabled(false);
        jButtonUbah.setEnabled(false);
        bersihJTextField();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldNama = new javax.swing.JTextField();
        jTextFieldHp = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButtonBaru = new javax.swing.JButton();
        jButtonUbah = new javax.swing.JButton();
        jButtonHapus = new javax.swing.JButton();
        jButtonBersih = new javax.swing.JButton();
        jButtonSimpan = new javax.swing.JButton();
        jButtonTutup = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelTeman = new javax.swing.JTable();

        jLabel1.setText("id :");

        jLabel2.setText("Nama :");

        jLabel3.setText("No. Hp :");

        jLabel4.setText("Email :");

        jPanel1.setBackground(new java.awt.Color(204, 255, 51));

        jButtonBaru.setText("Baru");
        jButtonBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBaruActionPerformed(evt);
            }
        });

        jButtonUbah.setText("Ubah");
        jButtonUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUbahActionPerformed(evt);
            }
        });

        jButtonHapus.setText("Hapus");
        jButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusActionPerformed(evt);
            }
        });

        jButtonBersih.setText("Bersih");
        jButtonBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBersihActionPerformed(evt);
            }
        });

        jButtonSimpan.setText("Simpan");
        jButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanActionPerformed(evt);
            }
        });

        jButtonTutup.setText("Tutup");
        jButtonTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTutupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonSimpan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBaru, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBersih, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonTutup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonUbah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonUbah)
                    .addComponent(jButtonBaru))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSimpan)
                    .addComponent(jButtonHapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTutup)
                    .addComponent(jButtonBersih))
                .addContainerGap())
        );

        jTabelTeman.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTabelTeman);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(jTextFieldHp)
                            .addComponent(jTextFieldNama))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldHp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanActionPerformed
        // TODO add your handling code here:
        String nama = jTextFieldNama.getText();
        String nope = jTextFieldHp.getText();
        String email = jTextFieldEmail.getText();
        if(nama.equals("") || nope.equals("") || email.equals("")){
            JOptionPane.showMessageDialog(null, "Harap Isi Data Dengan Benar");
        }else{
            
        if (JOptionPane.showConfirmDialog(null, "Apakah Anda ingin Menyimpan?", "PERHATIAN",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                mt.setNama(nama);
                mt.setNope(nope);
                mt.setEmail(email);

                ct.simpanTeman(mt);

                tampilTeman();
                tombolBatal();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Harap Isi Data Dengan Benar");
            }
        } else {
        }
        }

    }//GEN-LAST:event_jButtonSimpanActionPerformed

    private void jButtonTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTutupActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButtonTutupActionPerformed

    private void jButtonUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUbahActionPerformed
        // TODO add your handling code here:
         if (JOptionPane.showConfirmDialog(null, "Apakah Kamu ingin Mengubah?", "PERHATIAN",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                int id = Integer.parseInt(jTextFieldId.getText());
                String nama = jTextFieldNama.getText();
                String nope = jTextFieldHp.getText();
                String email = jTextFieldEmail.getText();

                mt.setId(id);//mt didapat dari pembuatan objek, dari kelas ModelTeman (instansiasi dilakukan diatas)
                mt.setNama(nama);
                mt.setNope(nope);
                mt.setEmail(email);

                ct.ubahDataTeman(mt);//ct didapat dari pembuatan objek, dari kelas ControllerTeman (instansiasi dilakukan diatas)

                tampilTeman();
                tabelUnKlik();
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(this, "Galat jButtonUbahActionPerformed : "+e);
            }
        } else {
        }

    }//GEN-LAST:event_jButtonUbahActionPerformed

    private void jButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusActionPerformed
        // TODO add your handling code here:
         if (JOptionPane.showConfirmDialog(null, "Apakah Kamu Ingin Menghapus?", "PERHATIAN!",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
             try {
                 int id = Integer.parseInt(jTextFieldId.getText());

                mt.setId(id);//mt didapat dari pembuatan objek, dari kelas ModelTeman (instansiasi dilakukan diatas)
                ct.hapusDataTeman(mt);//ct didapat dari pembuatan objek, dari kelas ControllerTeman (instansiasi dilakukan diatas)

                tampilTeman();
                tabelUnKlik();
             } catch (Exception e) {
                 JOptionPane.showMessageDialog(this, "galat button hapus");
             }
        } else {
        }
    }//GEN-LAST:event_jButtonHapusActionPerformed

    private void jButtonBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBaruActionPerformed
        // TODO add your handling code here:
         String logic = jButtonBaru.getText();
        if (logic.equals("Baru")) {
            jButtonSimpan.setEnabled(true);
            jButtonBaru.setText("Batal");
            tombolBaru();
        } else {
            jButtonSimpan.setEnabled(false);
            jButtonBaru.setText("Baru");
            tombolBatal();
        }
    }//GEN-LAST:event_jButtonBaruActionPerformed

    private void jButtonBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBersihActionPerformed
        // TODO add your handling code here:
         bersihJTextField();
    }//GEN-LAST:event_jButtonBersihActionPerformed


     private void jTableTemanMouseClicked(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
        
        try {
            int baris = jTabelTeman.getSelectedRow();//mengambil urutan baris dari table yang ada
            jTextFieldId.setText(jTabelTeman.getValueAt(baris, 0).toString());
            jTextFieldNama.setText(jTabelTeman.getValueAt(baris, 1).toString());
            jTextFieldHp.setText(jTabelTeman.getValueAt(baris, 2).toString());
            jTextFieldEmail.setText(jTabelTeman.getValueAt(baris, 3).toString());
            tabelKlik();
        } catch (Exception e) {
            System.err.println("Error : " + e);
        }
    }             
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBaru;
    private javax.swing.JButton jButtonBersih;
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JButton jButtonTutup;
    private javax.swing.JButton jButtonUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabelTeman;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldHp;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNama;
    // End of variables declaration//GEN-END:variables
}