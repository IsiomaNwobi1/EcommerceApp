package com.example.isiomanwobi_week8_task.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.*;

@WebServlet(name = "adminServlet", value="/admin-servlet")
public class AdminLoginServlet extends HttpServlet {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/ecommerce";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "Isioma12345";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fullName = request.getParameter("fullName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String adminToken = request.getParameter("adminToken");

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
                String sql = "SELECT * FROM adminDB WHERE email= ? AND password= ? AND adminToken=?";
                try (PreparedStatement statement = conn.prepareStatement(sql)) {
                    statement.setString(1, fullName);
                    statement.setString(1, email);
                    statement.setString(2, password);
                    statement.setString(3, adminToken);
                    try (ResultSet result = statement.executeQuery()) {
                        if (result.next()) {
                            String userEmail = result.getString("email");
                            request.setAttribute("email", userEmail);
                            request.getRequestDispatcher("adminDashboard.jsp").forward(request, response);
                        } else {
                            response.sendRedirect("signup-error.jsp");
                        }
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
                response.sendRedirect("signup-error.jsp");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            response.sendRedirect("signup-error.jsp");
        }
    }
}