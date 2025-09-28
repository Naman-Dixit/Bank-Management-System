import java.sql.*;

public class Conn {
    Connection c; // Fixed typo in Connection
    Statement s;
    public Conn() {
        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver"); // Corrected driver class name
            // Establish connection (add proper URL, username, and password)
            c = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bankmanagementsystem", // Replace with your database name
                "root", // Replace with your username
                "NAMAN.125539"  // Replace with your password
            );
            s=c.createStatement();
        } catch (Exception e) {
            System.out.println(e); // Changed to System.out.println
        }
    }
}