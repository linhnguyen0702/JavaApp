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
            jcldngaysinh.setDate(userInfo.getDob());
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
        txtemail = new javax.swing.JTextField();
        txthoten = new javax.swing.JTextField();
        txtdiachi = new javax.swing.JTextField();
        txtcccd = new javax.swing.JTextField();
        radnam = new javax.swing.JRadioButton();
        radnu = new javax.swing.JRadioButton();
        radnguoithue = new javax.swing.JRadioButton();
        radchutro = new javax.swing.JRadioButton();
        btnupdatethongtin = new javax.swing.JButton();
        jcldngaysinh = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÔNG TIN CÁ NHÂN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 23, 562, -1));

        lblhoten.setText("Họ tên");
        getContentPane().add(lblhoten, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 75, 49, -1));

        lbltaikhoan.setText("Tài Khoản");
        getContentPane().add(lbltaikhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 142, -1, -1));

        lblsodienthoai.setText("Số điện thoại");
        getContentPane().add(lblsodienthoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 214, -1, -1));

        lblgioitinh.setText("Giới tính");
        getContentPane().add(lblgioitinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 316, -1, -1));

        lbldoituong.setText("Đối tượng");
        getContentPane().add(lbldoituong, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 316, -1, -1));

        lblngaysinh.setText("Ngày sinh");
        getContentPane().add(lblngaysinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 75, -1, -1));

        lbldiachi.setText("Địa chỉ");
        getContentPane().add(lbldiachi, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 142, 52, -1));

        lblCCCD.setText("CCCD");
        getContentPane().add(lblCCCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 214, 37, -1));

        lblemail.setText("Email");
        getContentPane().add(lblemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 286, 43, -1));

        txttaikhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttaikhoanActionPerformed(evt);
            }
        });
        getContentPane().add(txttaikhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 170, 205, 32));

        txtsodienthoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsodienthoaiActionPerformed(evt);
            }
        });
        getContentPane().add(txtsodienthoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 246, 205, 32));

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 308, 205, 32));

        txthoten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthotenActionPerformed(evt);
            }
        });
        getContentPane().add(txthoten, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 103, 205, 32));

        txtdiachi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiachiActionPerformed(evt);
            }
        });
        getContentPane().add(txtdiachi, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 170, 205, 32));

        txtcccd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcccdActionPerformed(evt);
            }
        });
        getContentPane().add(txtcccd, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 246, 205, 32));

        btngrgioitinh.add(radnam);
        radnam.setText("Nam");
        getContentPane().add(radnam, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 346, 98, -1));

        btngrgioitinh.add(radnu);
        radnu.setText("Nữ");
        getContentPane().add(radnu, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 388, 98, -1));

        btngrdoituong.add(radnguoithue);
        radnguoithue.setText("Người thuê");
        getContentPane().add(radnguoithue, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 346, 98, -1));

        btngrdoituong.add(radchutro);
        radchutro.setText("Chủ trọ");
        getContentPane().add(radchutro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 388, 98, -1));

        btnupdatethongtin.setText("CẬP NHẬT THÔNG TIN");
        btnupdatethongtin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdatethongtinActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdatethongtin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, -1, -1));
        getContentPane().add(jcldngaysinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 102, 210, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/anhnen.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txttaikhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttaikhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttaikhoanActionPerformed

    private void txtsodienthoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsodienthoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsodienthoaiActionPerformed

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
        infoUpdate.setDob(jcldngaysinh.getDate());
        infoUpdate.setAddress(txtdiachi.getText());
        infoUpdate.setCccd(txtcccd.getText());
        infoUpdate.setEmail(txtemail.getText());
        infoUpdate.setGioiTinh(radnam.isSelected() ? "Nam" : "Nữ");
        infoUpdate.setDoiTuong(radnguoithue.isSelected() ? "Người thuê" : "Chủ trọ");
        String email = txtemail.getText();
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        if (!email.matches(emailRegex)) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng email!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return; // Dừng quá trình cập nhật nếu email không hợp lệ
        }
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

    @Override
    public void setDefaultCloseOperation(int operation) {
        if (operation != DO_NOTHING_ON_CLOSE
                && operation != HIDE_ON_CLOSE
                && operation != DISPOSE_ON_CLOSE
                && operation != EXIT_ON_CLOSE) {
            throw new IllegalArgumentException("defaultCloseOperation must be"
                    + " one of: DO_NOTHING_ON_CLOSE, HIDE_ON_CLOSE,"
                    + " DISPOSE_ON_CLOSE, or EXIT_ON_CLOSE");
        }

        if (operation == EXIT_ON_CLOSE) {
            setVisible(true);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                updatethongtin updatettp = new updatethongtin();
                updatettp.setVisible(true);
                updatettp.setResizable(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btngrdoituong;
    private javax.swing.ButtonGroup btngrgioitinh;
    private javax.swing.JButton btnupdatethongtin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private com.toedter.calendar.JDateChooser jcldngaysinh;
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
    private javax.swing.JTextField txtsodienthoai;
    private javax.swing.JTextField txttaikhoan;
    // End of variables declaration//GEN-END:variables
}
