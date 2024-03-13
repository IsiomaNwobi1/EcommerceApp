package com.example.isiomanwobi_week8_task.controller;

import com.example.isiomanwobi_week8_task.dao.ProductDao;
import com.example.isiomanwobi_week8_task.model.Product;
import com.example.isiomanwobi_week8_task.util.ConnectionUtil;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "products", value = "/products")
public class ProductController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String image = request.getParameter("image");
        String productName = request.getParameter("productName");
        String amount = request.getParameter("amount");
        String category = request.getParameter("category");

        Product newProduct = new Product(image, productName, amount, category);
        ProductDao productDao = new ProductDao(ConnectionUtil.getConnection());
        productDao.addProduct(newProduct);

//        response.sendRedirect("signup-success.jsp");
    }
}
