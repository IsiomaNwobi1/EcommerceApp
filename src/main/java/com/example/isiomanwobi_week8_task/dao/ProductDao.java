package com.example.isiomanwobi_week8_task.dao;

import com.example.isiomanwobi_week8_task.model.Product;
import com.example.isiomanwobi_week8_task.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDao {

    private Connection connection;

    public ProductDao(Connection connection) {
        this.connection = ConnectionUtil.getConnection();
    }

    public void addProduct(Product product) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO product(image, productName, amount, category) VALUES (?, ?, ?, ?)");
            preparedStatement.setString(1, product.getImage());
            preparedStatement.setString(2, product.getProductName());
            preparedStatement.setString(3, product.getAmount());
            preparedStatement.setString(4, product.getCategory());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
