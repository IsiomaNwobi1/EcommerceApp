package com.example.isiomanwobi_week8_task.controller;

import com.example.isiomanwobi_week8_task.dao.UserDao;
import com.example.isiomanwobi_week8_task.model.User;
import com.example.isiomanwobi_week8_task.util.ConnectionUtil;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "users", value = "/signup")
public class UserController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User newUser = new User(firstName, lastName, email, password);
        UserDao userDao = new UserDao(ConnectionUtil.getConnection());
        userDao.addUser(newUser);

        response.sendRedirect("signup-success.jsp");
    }
}
