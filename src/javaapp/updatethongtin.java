/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapp;

import dao.DangNhapDao;
import javax.swing.JOptionPane;
import model.DangnhapInfo;

/**
 *
 * @author linhy
 */
public class updatethongtin extends javax.swing.JFrame {

    private DangnhapInfo userInfo;
    private Mainform mainForm;

    /**
     * Creates new form updatethongtin
     */
    public updatethongtin() {
        initComponents();
    }

    public updatethongtin(DangnhapInfo userDangnhap, Mainform mainForm) {
        initComponents();
        this.userInfo = userDangnhap;
        this.mainForm = mainForm;
        getUserInfo();
    }

    private void getUserInfo() {
        if (userInfo != null) {
            txthoten.setText(userInfo.getName());
            txttaikhoan.setText(userInfo.getUsername());
            txtsodienthoai.setText(userInfo.getPhone());
            txtngaysinh.setText(userInfo.getDob());
            txtdiachi.setText(userInfo.getAddress());
            txtcccd.setText(userInfo.getCccd());
            txtemail.setText(userInfo.getEmail());

            String gioiTinh = userInfo.getGioiTinh() == null ? null : userInfo.getGioiTinh().trim();
            String doiTuong = userInfo.getDoiTuong() == null ? null : userInfo.getDoiTuong().trim();
            // Handle gender selection
            radnam.setSelected("Nam".equals(gioiTinh));
            radnu.setSelected("Nữ".equals(gioiTinh));

            // Handle user type selection
            radnguoithue.setSelected("Người thuê".equals(doiTuong));
            radchutro.setSelected("Chủ trọ".equals(doiTuong));
        } else {
            JOptionPane.showMessageDialog(this, "Lỗi khi lấy thông tin người dùng.");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrgioitinh = new javax.swing.ButtonGroup();
        btngrdoituong = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        lblhoten = new javax.swing.JLabel();
        lbltaikhoan = new javax.swing.JLabel();
        lblsodienthoai = new javax.swing.JLabel();
        lblgioitinh = new javax.swing.JLabel();
        lbldoituong = new javax.swing.JLabel();
        lblngaysinh = new javax.swing.JLabel();
        lbldiachi = new javax.swing.JLabel();
        lblCCCD = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        txttaikhoan = new javax.swing.JTextField();
        txtsodienthoai = new javax.swing.JTextField();
        txtngaysinh = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txthoten = new javax.swing.JTextField();
        txtdiachi = new javax.swing.JTextField();
        txtcccd = new javax.swing.JTextField();
        radnam = new javax.swing.JRadioButton();
        radnu = new javax.swing.JRadioButton();
        radnguoithue = new javax.swing.JRadioButton();
        radchutro = new javax.swing.JRadioButton();
        btnupdatethongtin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("THÔNG TIN CÁ NHÂN");

        lblhoten.setText("Họ tên");

        lbltaikhoan.setText("Tài Khoản");

        lblsodienthoai.setText("Số điện thoại");

        lblgioitinh.setText("Giới tính");

        lbldoituong.setText("Đối tượng");

        lblngaysinh.setText("Ngày sinh");

        lbldiachi.setText("Địa chỉ");

        lblCCCD.setText("CCCD");

        lblemail.setText("Email");

        txttaikhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttaikhoanActionPerformed(evt);
            }
        });

        txtsodienthoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsodienthoaiActionPerformed(evt);
            }
        });

        txtngaysinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtngaysinhActionPerformed(evt);
            }
        });

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        txthoten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthotenActionPerformed(evt);
            }
        });

        txtdiachi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiachiActionPerformed(evt);
            }
        });

        txtcccd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcccdActionPerformed(evt);
            }
        });

        btngrgioitinh.add(radnam);
        radnam.setText("Nam");

        btngrgioitinh.add(radnu);
        radnu.setText("Nữ");

        btngrdoituong.add(radnguoithue);
        radnguoithue.setText("Người thuê");

        btngrdoituong.add(radchutro);
        radchutro.setText("Chủ trọ");

        btnupdatethongtin.setText("CẬP NHẬT THÔNG TIN");
        btnupdatethongtin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdatethongtinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblhoten, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltaikhoan)
                            .addComponent(lblsodienthoai)
                            .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsodienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblgioitinh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbldoituong)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblemail, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblngaysinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbldiachi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcccd, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radnu, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radnam, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radnguoithue, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radchutro, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnupdatethongtin))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblhoten)
                    .addComponent(lblngaysinh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltaikhoan)
                    .addComponent(lbldiachi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsodienthoai)
                    .addComponent(lblCCCD))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcccd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsodienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(lblemail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldoituong)
                    .addComponent(lblgioitinh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radnam)
                    .addComponent(radnguoithue))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radnu)
                    .addComponent(radchutro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnupdatethongtin)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txttaikhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttaikhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttaikhoanActionPerformed

    private void txtsodienthoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsodienthoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsodienthoaiActionPerformed

    private void txtngaysinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtngaysinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtngaysinhActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txthotenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthotenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthotenActionPerformed

    private void txtdiachiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiachiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiachiActionPerformed

    private void txtcccdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcccdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcccdActionPerformed

    private void btnupdatethongtinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdatethongtinActionPerformed
        DangnhapInfo infoUpdate = new DangnhapInfo();
        infoUpdate.setName(txthoten.getText());
        infoUpdate.setUsername(txttaikhoan.getText());
        infoUpdate.setPhone(txtsodienthoai.getText());
        infoUpdate.setDob(txtngaysinh.getText());
        infoUpdate.setAddress(txtdiachi.getText());
        infoUpdate.setCccd(txtcccd.getText());
        infoUpdate.setEmail(txtemail.getText());
        infoUpdate.setGioiTinh(radnam.isSelected() ? "Nam" : "Nữ");
        infoUpdate.setDoiTuong(radnguoithue.isSelected() ? "Người thuê" : "Chủ trọ");

        boolean isSuccess = DangNhapDao.updateUserInfo(infoUpdate, userInfo.getUsername());
        if (isSuccess) {
//            JOptionPane.showMessageDialog(this, "Cập nhật thông tin thành công!");
            JOptionPane.showMessageDialog(this, "Cập nhật thông tin thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            // Mở lại form chính (formMain)
            this.mainForm.setDangnhapInfor(infoUpdate);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Lỗi khi cập nhật thông tin người dùng.");
        }
    }//GEN-LAST:event_btnupdatethongtinActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updatethongtin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btngrdoituong;
    private javax.swing.ButtonGroup btngrgioitinh;
    private javax.swing.JButton btnupdatethongtin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCCCD;
    private javax.swing.JLabel lbldiachi;
    private javax.swing.JLabel lbldoituong;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblgioitinh;
    private javax.swing.JLabel lblhoten;
    private javax.swing.JLabel lblngaysinh;
    private javax.swing.JLabel lblsodienthoai;
    private javax.swing.JLabel lbltaikhoan;
    private javax.swing.JRadioButton radchutro;
    private javax.swing.JRadioButton radnam;
    private javax.swing.JRadioButton radnguoithue;
    private javax.swing.JRadioButton radnu;
    private javax.swing.JTextField txtcccd;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txthoten;
    private javax.swing.JTextField txtngaysinh;
    private javax.swing.JTextField txtsodienthoai;
    private javax.swing.JTextField txttaikhoan;
    // End of variables declaration//GEN-END:variables
}
