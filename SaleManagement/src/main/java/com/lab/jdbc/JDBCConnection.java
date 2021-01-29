package com.lab.jdbc;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCConnection {

    public Connection getJDBCConnection() {

        Connection con = null;
        String url = "jdbc:sqlserver://localhost:1433;databaseName=SWT_LAB1;integratedSecurity=true";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url);
            System.out.println("Connection is successful.");
            System.out.println("Info : " + con);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection failed.");
            System.out.println(e.getMessage());
        }
        return con;
    }

    public void closeConnection(Connection con, PreparedStatement ps, ResultSet rs) throws SQLException {
        if (rs != null && !rs.isClosed()) {
            rs.close();
        }
        if (ps != null && !ps.isClosed()) {
            ps.close();
        }
        if (con != null && !con.isClosed()) {
            con.close();
        }
    }

    public static void main(String[] args) {
        JDBCConnection jdbc = new JDBCConnection();
        jdbc.getJDBCConnection();
    }
}
