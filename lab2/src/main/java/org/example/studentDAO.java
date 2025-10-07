package org.example;



import java.sql.*;

public class studentDAO {

    public void insertStudent(String name, String email) throws Exception {
        String sql = "insert into student values(?,?)";
        try (Connection conn = Connections.getConnection();
             PreparedStatement s = conn.prepareStatement(sql)) {
            s.setString(1, name);
            s.setString(2, email);
            s.executeUpdate();
        }
    }

    public void deleteStudent(int id) throws Exception {
        String sql = "DELETE FROM student WHERE id = ?";
        try (Connection conn = Connections.getConnection();
             PreparedStatement s = conn.prepareStatement(sql)) {
            s.setInt(1, id);
            s.executeUpdate();
        }
    }
}

