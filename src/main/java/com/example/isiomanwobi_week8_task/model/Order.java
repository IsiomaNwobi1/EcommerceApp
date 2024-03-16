package com.example.isiomanwobi_week8_task.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Order extends Product{
    private int orderId;
    private int uid;
    private int qunatity;
    private String date;

    public Order() {
    }

    public Order(int uid, int qunatity, String date) {
        super();
        this.uid = uid;
        this.qunatity = qunatity;
        this.date = date;
    }
}
