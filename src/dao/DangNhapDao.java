/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.DangnhapInfo;

/**
 *
 * @author linhy
 */
public class DangNhapDao {

    public static DangnhapInfo getDangNhap(String username) {
        try (Connection conn = DatabaseConection.getConnection()) {
            // SQL statement to get user information by username
            String sqlSelect = "SELECT * FROM dangnhap WHERE usename = ?";
            PreparedStatement pstmtSelect = conn.prepareStatement(sqlSelect);
            pstmtSelect.setString(1, username);

            // Execute query and get results
            ResultSet rs = pstmtSelect.executeQuery();

            if (rs.next()) {
                DangnhapInfo dangnhap = new DangnhapInfo();
                // Assign user information from DB to form fields
                dangnhap.setName(rs.getString("name"));
                dangnhap.setUsername(rs.getString("usename"));
                dangnhap.setPhone(rs.getString("phone"));
                dangnhap.setDob(rs.getString("Datetime"));
                dangnhap.setAddress(rs.getString("Adress"));
                dangnhap.setCccd(rs.getString("cccd"));
                dangnhap.setEmail(rs.getString("email"));
                dangnhap.setGioiTinh(rs.getString("sex"));
                dangnhap.setDoiTuong(rs.getString("role"));
                return dangnhap;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Lỗi khi lấy thông tin người dùng.");
        }

        return null;
    }

    public static boolean updateUserInfo(DangnhapInfo dangnhapInfo, String userName) {
        try (Connection conn = DatabaseConection.getConnection()) {
            // Update user information
            String sqlUpdate = "UPDATE dangnhap SET name = ?, usename = ?, phone = ?, Adress = ?, Datetime = ?, sex = ?, role = ?, cccd = ?, email = ? WHERE usename = ?";
            PreparedStatement pstmtUpdate = conn.prepareStatement(sqlUpdate);

            pstmtUpdate.setString(1, dangnhapInfo.getName());
            pstmtUpdate.setString(2, dangnhapInfo.getUsername());
            pstmtUpdate.setString(3, dangnhapInfo.getPhone());
            pstmtUpdate.setString(4, dangnhapInfo.getAddress());
            pstmtUpdate.setString(5, dangnhapInfo.getDob());
            pstmtUpdate.setString(6, "Nam".equals(dangnhapInfo.getGioiTinh()) ? "Nam" : "Nữ");
            pstmtUpdate.setString(7, "Người thuê".equals(dangnhapInfo.getDoiTuong()) ? "Người thuê" : "Chủ trọ");
            pstmtUpdate.setString(8, dangnhapInfo.getCccd());
            pstmtUpdate.setString(9, dangnhapInfo.getEmail());
            pstmtUpdate.setString(10, userName); // Use account to update

            // Execute update
            pstmtUpdate.executeUpdate();
            conn.commit();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Lỗi khi cập nhật thông tin người dùng.");
            return false;

        }

    }

}
