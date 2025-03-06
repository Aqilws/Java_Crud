package Form;

import Config.Koneksi;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class FrameMahasiswa extends javax.swing.JFrame {

    private Connection conn;
    
    public FrameMahasiswa() {
        initComponents();
        conn = Koneksi.getConnection();
        getData();
        nonAktifBtn();
    }
    
    private void getData() {
        DefaultTableModel model =(DefaultTableModel) table_data.getModel();
        model.setRowCount(0);
        
        try {
            String sql = "Select * From mahasiswa_data";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
                int id = rs.getInt("id");
                String nama = rs.getString("nama");
                String jurusan = rs.getString("jurusan");
                String phone = rs.getString("phone");
                String alamat = rs.getString("alamat");
                
                Object[] rowData = {id, nama, jurusan, phone, alamat};
                model.addRow(rowData);
                
            }
            
            rs.close();
            rs.close();
                    
        } catch (Exception e) {
            Logger.getLogger(FrameMahasiswa.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_data = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        input_nama = new javax.swing.JTextField();
        input_alamat = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        input_jurusan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        input_phone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        input_search = new javax.swing.JTextField();
        btn_remove = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nama", "Jurusan", "Phone", "Alamat"
            }
        ));
        table_data.setRowHeight(40);
        table_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_dataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_data);

        jLabel1.setText("Nama");

        input_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_namaActionPerformed(evt);
            }
        });

        input_alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_alamatActionPerformed(evt);
            }
        });

        jLabel2.setText("Alamat");

        input_jurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_jurusanActionPerformed(evt);
            }
        });

        jLabel3.setText("Jurusan");

        input_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_phoneActionPerformed(evt);
            }
        });

        jLabel4.setText("Phone");

        input_search.setText("    Search .... ");
        input_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_searchActionPerformed(evt);
            }
        });

        btn_remove.setText("Remove");
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });

        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(input_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(input_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(input_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(input_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(input_search, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(input_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(input_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(input_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(25, 25, 25)
                                .addComponent(input_phone, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(input_search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void input_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_namaActionPerformed

    private void input_alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_alamatActionPerformed

    private void input_jurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_jurusanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_jurusanActionPerformed

    private void input_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_phoneActionPerformed

    private void input_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_searchActionPerformed

    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
        int selectedRow = table_data.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih Data Yang Akan DiHapus");
            return;
        }
        
            String id = table_data.getValueAt(selectedRow, 0).toString();
            String nama = input_nama.getText();
            String jurusan = input_jurusan.getText();
            String phone = input_phone.getText();
            String alamat = input_alamat.getText();


            if (nama.isEmpty() || jurusan.isEmpty() || phone.isEmpty() || alamat.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Pilih Data Yang Akan Dihapus ", "Validation", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try{
                String sql = "DELETE FROM mahasiswa_data WHERE id=?";
                PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1, id);
            
                int rowDelete = st.executeUpdate();
                if (rowDelete > 0) {
                    JOptionPane.showMessageDialog(this, "Data Berhasil DiHapus");
                    resetForm();
                    getData();
                }
            }catch (Exception e) {
                Logger.getLogger(FrameMahasiswa.class.getName()).log(Level.SEVERE,null,e);
            }
    }//GEN-LAST:event_btn_removeActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
       String nama = input_nama.getText();
       String jurusan = input_jurusan.getText();
       String phone = input_phone.getText();
       String alamat = input_alamat.getText();
       
        if (nama.isEmpty() || jurusan.isEmpty() || phone.isEmpty() || alamat.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Input Data Dengan Benar !! ", "Validation", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            String sql = "INSERT INTO mahasiswa_data (nama, jurusan, phone, alamat) VALUES (?,?,?,?)";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, nama);
            st.setString(2, jurusan);
            st.setString(3, phone);
            st.setString(4, alamat);
            
            int rowInserted = st.executeUpdate();
            if (rowInserted > 0) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan");
                resetForm();
                getData();
            }
            
            st.close();
            st.close();
            
        } catch (Exception e) {
            Logger.getLogger(FrameMahasiswa.class.getName()).log(Level.SEVERE,null,e);
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        int selectedRow = table_data.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Data Berhasil Di Update !!!");
            return;
        }
        
            String id = table_data.getValueAt(selectedRow, 0).toString();
            String nama = input_nama.getText();
            String jurusan = input_jurusan.getText();
            String phone = input_phone.getText();
            String alamat = input_alamat.getText();


            if (nama.isEmpty() || jurusan.isEmpty() || phone.isEmpty() || alamat.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Terdapat input yang kosong ", "Validation", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try{
                String sql = "UPDATE mahasiswa_data SET nama=?, jurusan=?, phone=?, alamat=? WHERE id=?";
                PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1, nama);
                st.setString(2, jurusan);
                st.setString(3, phone);
                st.setString(4, alamat);
                st.setString(5, id);
            
            
                int rowUpdate = st.executeUpdate();
                if (rowUpdate > 0) {
                    JOptionPane.showMessageDialog(this, "Data Berhasil Diperbaharui");
                    resetForm();
                    getData();
                }
            }catch (Exception e) {
                Logger.getLogger(FrameMahasiswa.class.getName()).log(Level.SEVERE,null,e);
            }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        input_nama.setText("");
        input_jurusan.setText("");
        input_phone.setText("");
        input_alamat.setText("");
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void table_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_dataMouseClicked
        int selectedRow = table_data.getSelectedRow();
        
        if (selectedRow != -1) {
            String nama = table_data.getValueAt(selectedRow, 1).toString();
            String jurusan = table_data.getValueAt(selectedRow, 2).toString();
            String phone = table_data.getValueAt(selectedRow, 3).toString();
            String alamat = table_data.getValueAt(selectedRow, 4).toString();
              
            input_nama.setText(nama);
            input_jurusan.setText(jurusan);
            input_phone.setText(phone);
            input_alamat.setText(alamat);
            
            
        }
    }//GEN-LAST:event_table_dataMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_remove;
    private javax.swing.JButton btn_update;
    private javax.swing.JTextField input_alamat;
    private javax.swing.JTextField input_jurusan;
    private javax.swing.JTextField input_nama;
    private javax.swing.JTextField input_phone;
    private javax.swing.JTextField input_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_data;
    // End of variables declaration//GEN-END:variables

    private void resetForm() {
        input_nama.setText("");
        input_jurusan.setText("");
        input_phone.setText("");
        input_alamat.setText("");
    }

    private void nonAktifBtn() {
//        btn_cancel.setEnabled(false);
        btn_update.setEnabled(false);
//        btn_remove.setEnabled(false);
        
        
    }


}
