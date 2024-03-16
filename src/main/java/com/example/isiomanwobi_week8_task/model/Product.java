package com.example.isiomanwobi_week8_task.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Product {
    private int id;
    private String name;
    private String category;
    private Double price;
    private String image;


    public Product() {


    }

    public Product(String name, String category, Double price, String image) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.image = image;
    }
}



