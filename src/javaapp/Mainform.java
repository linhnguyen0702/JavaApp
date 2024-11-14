/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapp;

import javaapp.chitietphongtro;
import javaapp.updatethongtin;
import model.DangnhapInfo;
import javax.swing.ImageIcon;
import  javax.swing.SwingConstants;
/**
 *
 * @author linhy
 */
public class Mainform extends javax.swing.JFrame {

    private DangnhapInfo dangnhapInfo;

    /**
     * Creates new form Mainform
     */
    public Mainform() {
        initComponents();
//        lbldieukhoan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
//        lblemail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
//        lblfacebook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
//        lblgioithieu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
//        lblhuongdan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
//        lblinstagram.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
//        lblnhanguyencan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
//        lbltro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
//        lbltuyendung.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
//        lblvanphong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
//        lbltrogiup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }

    public Mainform(DangnhapInfo dangnhapInfo) {
        initComponents();
//        lbldieukhoan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
//        lblemail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
//        lblfacebook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
//        lblgioithieu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
//        lblhuongdan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
//        lblinstagram.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
//        lblnhanguyencan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
//        lbltro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
//        lbltuyendung.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
//        lblvanphong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
//        lbltrogiup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.dangnhapInfo = dangnhapInfo;
        lbltennguoidung.setText(this.dangnhapInfo.getName());
        lbldoituongthue.setText(this.dangnhapInfo.getDoiTuong());
    }

    public void setDangnhapInfor(DangnhapInfo dangnhapInfo) {
        this.dangnhapInfo = dangnhapInfo;
        lbltennguoidung.setText(this.dangnhapInfo.getName());
        lbldoituongthue.setText(this.dangnhapInfo.getDoiTuong());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbltimkiem = new javax.swing.JLabel();
        txttimkiem = new javax.swing.JTextField();
        cbboxdientich = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lbltennguoidung = new javax.swing.JLabel();
        btnupdatethongtin = new javax.swing.JButton();
        lbldoituongthue = new javax.swing.JLabel();
        btndangtin = new javax.swing.JButton();
        btndangxuat = new javax.swing.JButton();
        jphienthi = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mainform");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon1.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("NHÀ TRỌ BANANHA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(310, 310, 310)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(14, 14, 14))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbltimkiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbltimkiem.setText("Tìm kiếm");

        cbboxdientich.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diện tích", "12m^2", "10m^2", "20m^2", "10m^2-20m^2", "15m^2-25m^2", "50m^2" }));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Địa chỉ", "Hà Nội", "TPHCM", "Hội An", "Quảng Bình", "Nghệ An.Hà Tĩnh Hải Dương", "Phú thọ", "Bắc Ninh" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lbltimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(cbboxdientich, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbboxdientich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon7.png"))); // NOI18N

        lbltennguoidung.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbltennguoidung.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltennguoidung.setText("Tên ngời dùng");

        btnupdatethongtin.setText("Edit profile");
        btnupdatethongtin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdatethongtinActionPerformed(evt);
            }
        });

        lbldoituongthue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbldoituongthue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbldoituongthue.setText("Đối tượng");
        lbldoituongthue.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbldoituongthue.setVerifyInputWhenFocusTarget(false);

        btndangtin.setText("Đăng tin");
        btndangtin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndangtinActionPerformed(evt);
            }
        });

        btndangxuat.setText("Đăng xuất");
        btndangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndangxuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lbltennguoidung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 40, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(52, 52, 52))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btndangtin, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnupdatethongtin, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(38, 38, 38)))
                            .addComponent(btndangxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addComponent(lbldoituongthue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lbltennguoidung, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lbldoituongthue, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnupdatethongtin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btndangtin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btndangxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jphienthi.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jphienthiLayout = new javax.swing.GroupLayout(jphienthi);
        jphienthi.setLayout(jphienthiLayout);
        jphienthiLayout.setHorizontalGroup(
            jphienthiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 903, Short.MAX_VALUE)
        );
        jphienthiLayout.setVerticalGroup(
            jphienthiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jphienthi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jphienthi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnupdatethongtinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdatethongtinActionPerformed
        updatethongtin capnhat = new updatethongtin(dangnhapInfo, this);
        capnhat.setVisible(true);
        capnhat.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnupdatethongtinActionPerformed

    private void btndangtinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndangtinActionPerformed

        // Show the updatephong form
        updatephong updatep = new updatephong(dangnhapInfo);
        updatep.setVisible(true);
        updatep.setLocationRelativeTo(null);

    }//GEN-LAST:event_btndangtinActionPerformed

    private void btndangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndangxuatActionPerformed
        // TODO add your handling code here:
        Dangnhap dangnhap = new Dangnhap();
        dangnhap.setVisible(true);
        dangnhap.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btndangxuatActionPerformed

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
            java.util.logging.Logger.getLogger(Mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               Mainform mainform = new Mainform();
               mainform.setVisible(true);
               mainform.setResizable(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndangtin;
    private javax.swing.JButton btndangxuat;
    private javax.swing.JButton btnupdatethongtin;
    private javax.swing.JComboBox<String> cbboxdientich;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jphienthi;
    private javax.swing.JLabel lbldoituongthue;
    private javax.swing.JLabel lbltennguoidung;
    private javax.swing.JLabel lbltimkiem;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables
}
