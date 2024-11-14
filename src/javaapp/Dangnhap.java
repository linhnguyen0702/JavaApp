/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapp;

import dao.DangNhapDao;
import dao.DatabaseConection;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.prefs.Preferences;

/**
 *
 * @author linhy
 */
public class Dangnhap extends javax.swing.JFrame {

    private Preferences prefs; // Để lưu thông tin người dùng

    /**
     * Creates new form NewJFrame
     */
    public Dangnhap() {
        initComponents();
        lbldangky.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        // Khởi tạo Preferences để lưu thông tin
        prefs = Preferences.userNodeForPackage(Dangnhap.class);

        // Lấy thông tin từ Preferences và điền vào các trường
        String savedUsername = prefs.get("username", ""); // Lấy tài khoản đã lưu
        String savedPassword = prefs.get("password", ""); // Lấy mật khẩu đã lưu

        txttaikhoan.setText(savedUsername);
        passmatkhau.setText(savedPassword);
        chknhomatkhau.setSelected(!savedUsername.isEmpty()); // Kiểm tra và đặt trạng thái của checkbox
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
        lbltaikhoan = new javax.swing.JLabel();
        lblmatkhau = new javax.swing.JLabel();
        txttaikhoan = new javax.swing.JTextField();
        btndangnhap = new javax.swing.JButton();
        passmatkhau = new javax.swing.JPasswordField();
        chknhomatkhau = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        lbldangky = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ĐĂNG NHẬP");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 425, 34));

        lbltaikhoan.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbltaikhoan.setText("Tài khoản");
        getContentPane().add(lbltaikhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 82, 75, 33));
        lbltaikhoan.getAccessibleContext().setAccessibleName("");

        lblmatkhau.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblmatkhau.setText("Mật khẩu");
        getContentPane().add(lblmatkhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 147, 75, 31));
        lblmatkhau.getAccessibleContext().setAccessibleName("");

        txttaikhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttaikhoanActionPerformed(evt);
            }
        });
        getContentPane().add(txttaikhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 82, 262, 33));
        txttaikhoan.getAccessibleContext().setAccessibleName("");

        btndangnhap.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btndangnhap.setText("Đăng nhập ");
        btndangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndangnhapActionPerformed(evt);
            }
        });
        getContentPane().add(btndangnhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 243, 142, 33));
        getContentPane().add(passmatkhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 146, 262, 33));

        chknhomatkhau.setText("Nhớ mật khẩu");
        chknhomatkhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chknhomatkhauActionPerformed(evt);
            }
        });
        getContentPane().add(chknhomatkhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 201, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Bạn chưa có tài khoản ?");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 288, -1, -1));

        lbldangky.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbldangky.setForeground(new java.awt.Color(0, 0, 204));
        lbldangky.setText("Đăng ký");
        lbldangky.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbldangkyMouseClicked(evt);
            }
        });
        getContentPane().add(lbldangky, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 288, 57, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/anhnen.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txttaikhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttaikhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttaikhoanActionPerformed

    private void btndangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndangnhapActionPerformed
        String usename = txttaikhoan.getText();
        String password = new String(passmatkhau.getPassword());
        // Kiểm tra nếu tài khoản hoặc mật khẩu bị bỏ trống
        if (usename.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập tài khoản!");
            return;
        }
        if (password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mật khẩu!");
            return;
        }
        try (Connection conn = DatabaseConection.getConnection()) {
            String sql = "SELECT * FROM dangnhap WHERE usename = ? AND password = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, usename);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                // Lưu tài khoản và mật khẩu nếu checkbox được chọn
                if (chknhomatkhau.isSelected()) {
                    prefs.put("username", usename);
                    prefs.put("password", password);
                } else {
                    // Xóa thông tin nếu checkbox không được chọn
                    prefs.remove("username");
                    prefs.remove("password");
                }

                Mainform mainform = new Mainform(DangNhapDao.getDangNhap(usename));
                mainform.setVisible(true);
                mainform.setLocationRelativeTo(null);
                dispose(); // Đóng form đăng nhập
            } else {
                JOptionPane.showMessageDialog(this, "Đăng nhập thất bại,kiểm tra lại username hoặc password,vui lòng thử lại .");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu: " + ex.getMessage());
        }
    }//GEN-LAST:event_btndangnhapActionPerformed

    private void chknhomatkhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chknhomatkhauActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_chknhomatkhauActionPerformed

    private void lbldangkyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbldangkyMouseClicked
        // TODO add your handling code here:
        Dangky dangky = new Dangky();
        dangky.setVisible(true);
        dangky.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_lbldangkyMouseClicked

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
            java.util.logging.Logger.getLogger(Dangnhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dangnhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dangnhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dangnhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Dangnhap dangNhap = new Dangnhap();
                dangNhap.setVisible(true);
                dangNhap.setResizable(false);
                dangNhap.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndangnhap;
    private javax.swing.JCheckBox chknhomatkhau;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbldangky;
    private javax.swing.JLabel lblmatkhau;
    private javax.swing.JLabel lbltaikhoan;
    public static javax.swing.JPasswordField passmatkhau;
    public static javax.swing.JTextField txttaikhoan;
    // End of variables declaration//GEN-END:variables
}
