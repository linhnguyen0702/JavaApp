/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.PhongInfo;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 *
 * @author linhy
 */
public class PhongDao {

    public static List<PhongInfo> getPhongByUser(Integer userId) {
        List<PhongInfo> list = new LinkedList<>();
        try (Connection conn = DatabaseConection.getConnection()) {
            // SQL statement to get user information by username
            String sqlSelect = "select * from thongtinphong where id_name = ?";
            PreparedStatement pstmtSelect = conn.prepareStatement(sqlSelect);
            pstmtSelect.setInt(1, userId);
            ResultSet rs = pstmtSelect.executeQuery();
            while (rs.next()) {
                PhongInfo thongtinphong = new PhongInfo();
                // Assign room information from DB to the model
                thongtinphong.setId_phong(rs.getInt("id_phong"));
                thongtinphong.setLoaitin(rs.getString("loaitin"));
                thongtinphong.setLoaiphong(rs.getString("loaiphong"));
                thongtinphong.setGiaphong(rs.getDouble("gia"));
                thongtinphong.setDiaci(rs.getString("diachi"));
                thongtinphong.setDientich(rs.getString("dientich"));
                thongtinphong.setAnh(rs.getString("anh"));
                list.add(thongtinphong);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhongDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public static Integer themPhong(List<PhongInfo> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }
        try (Connection conn = DatabaseConection.getConnection()) {
            String sql = "INSERT INTO thongtinphong (loaitin, loaiphong, gia, diachi, dientich, anh, id_name) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

            // Duyệt qua từng dòng trong JTable và chèn vào cơ sở dữ liệu
            for (PhongInfo phong : list) {
                stmt.setString(1, phong.getLoaitin().trim()); // loaitin
                stmt.setString(2, phong.getLoaiphong().trim()); // loaiphong
                stmt.setDouble(3, phong.getGiaphong()); // gia
                stmt.setString(4, phong.getDiaci().trim()); // diachi
                stmt.setString(5, phong.getDientich().trim()); // dientich
                stmt.setString(6, phong.getAnh().trim());  // anh (đã được gán từ bên ngoài)
                stmt.setInt(7, phong.getId_name());

                int rowsAffected = stmt.executeUpdate();  // Thực hiện insert từng dòng
                if (rowsAffected > 0) {
                    System.out.println("Dong da duoc them vao co so du lieu");
                } else {
                    System.out.println("Khong them duoc dong");
                }
                return rowsAffected;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhongDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public static Integer suaPhong(List<PhongInfo> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }
        try (Connection conn = DatabaseConection.getConnection()) {
            String sql = "UPDATE [thongtinphong]\n"
                    + "   SET [loaitin] = ?\n"
                    + "      ,[loaiphong] = ?\n"
                    + "      ,[gia] = ?\n"
                    + "      ,[dientich] = ?\n"
                    + "      ,[diachi] = ?\n"
                    + "      ,[anh] = ?\n"
                    + " WHERE id_phong = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);

            // Duyệt qua từng dòng trong JTable và chèn vào cơ sở dữ liệu
            for (PhongInfo phong : list) {
                stmt.setString(1, phong.getLoaitin().trim()); // loaitin
                stmt.setString(2, phong.getLoaiphong().trim()); // loaiphong
                stmt.setDouble(3, phong.getGiaphong()); // gia
                stmt.setString(4, phong.getDientich().trim()); // dientich
                stmt.setString(5, phong.getDiaci().trim()); // diachi
                stmt.setString(6, phong.getAnh());// anh (đã được gán từ bên ngoài)
                stmt.setInt(7, phong.getId_phong());

                int rowsAffected = stmt.executeUpdate();  // Thực hiện insert từng dòng
                if (rowsAffected > 0) {
                    System.out.println("Sua phong thanh cong");
                } else {
                    System.out.println("Khong sua duoc phong");
                }
                return rowsAffected;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhongDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
