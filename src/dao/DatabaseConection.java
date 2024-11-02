/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author linhy
 */
public class DatabaseConection {
    private static final String DB_URL = "jdbc:sqlserver://localhost:1433;DatabaseName=formdangnhap;instance=SQLSERVER;encrypt=true;TrustServerCertificate=true;";
    private static final String USER = "sa";
    private static final String PASS = "Linh12345";
     public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return conn;
    }
}
