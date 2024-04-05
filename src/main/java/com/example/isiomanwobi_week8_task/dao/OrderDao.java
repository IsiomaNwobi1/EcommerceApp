package com.example.isiomanwobi_week8_task.dao;

import com.example.isiomanwobi_week8_task.model.Order;
import com.example.isiomanwobi_week8_task.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class OrderDao {

    private Connection connection;

    private String query;
    private PreparedStatement pst;
    private ResultSet rs;



    public OrderDao(Connection con) {
        super();
        this.connection = con;
    }

    public boolean insertOrder(Order model) {
        boolean result = false;
        try {
            query = "insert into orders (p_id, u_id, o_quantity, o_date) values(?,?,?,?)";
            pst = this.connection.prepareStatement(query);
            pst.setInt(1, model.getId());
            pst.setInt(2, model.getUid());
            pst.setInt(3, model.getQunatity());
            pst.setString(4, model.getDate());
            pst.executeUpdate();
            result = true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
}
