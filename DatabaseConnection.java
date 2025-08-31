package myapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/your_database_name";
    private static final String USER = "your_mysql_username";
    private static final String PASSWORD = "your_mysql_password";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to MySQL database!");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Connection error: " + e.getMessage());
        }
        return connection;
    }

    // Test connection
    public static void main(String[] args) {
        getConnection();
    }
}
