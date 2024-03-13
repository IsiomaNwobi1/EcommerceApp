package com.example.isiomanwobi_week8_task.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Product {

    private int serialNumber;
    private int quantity;
    private String image;
    private String productName;
    private String amount;
    private String category;

    public Product(String image, String productName, String amount, String category) {
        this.image = image;
        this.productName = productName;
        this.amount = amount;
        this.category = category;
    }

    public Product() {
    }
}
