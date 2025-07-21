/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/school_db", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // TEST CONNECTION
    public static void main(String[] args) {
        Connection con = DBConnection.connect();
        if (con != null) {
            System.out.println("✅ Database connected successfully!");
        } else {
            System.out.println("❌ Database connection failed.");
        }
    }
}


