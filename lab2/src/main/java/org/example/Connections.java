package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connections {
    private static final String URL = "jdbc:postgresql://localhost:5432/university management system";
    private static final String USER = "postgres";
    private static final String PASSWORD = "123";

    public static Connection getConnection() throws SQLException {
        return (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
    }


}
