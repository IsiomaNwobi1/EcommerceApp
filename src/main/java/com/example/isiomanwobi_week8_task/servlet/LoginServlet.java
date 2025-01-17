package com.example.isiomanwobi_week8_task.servlet;

import com.example.isiomanwobi_week8_task.dao.UserDao;
import com.example.isiomanwobi_week8_task.model.User;
import com.example.isiomanwobi_week8_task.util.ConnectionUtil;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "loginServlet", value = "/login-servlet")
public class LoginServlet extends HttpServlet {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/ecommerce";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "Isioma12345";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
                String sql = "SELECT * FROM userDB WHERE email=? AND password=?";
                try (PreparedStatement statement = conn.prepareStatement(sql)) {
                    statement.setString(1, email);
                    statement.setString(2, password);
                    try (ResultSet result = statement.executeQuery()) {
                        if (result.next()) {
                            String userEmail = result.getString("email");
                            request.setAttribute("email", userEmail);
                            request.getRequestDispatcher("login-success.jsp").forward(request, response);
                        } else {
                            response.sendRedirect("signup-error.jsp");
                        }
                    }
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                response.sendRedirect("signup-error.jsp");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            response.sendRedirect("signup-error.jsp");
        }
    }
}
