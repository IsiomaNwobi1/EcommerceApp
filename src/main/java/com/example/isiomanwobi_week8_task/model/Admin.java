package com.example.isiomanwobi_week8_task.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Admin {


    private int adminID;
    private String fullName;
    private String email;
    private String password;
    private String adminToken;

    public Admin(String fullName, String email, String password, String adminToken) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.adminToken = adminToken;
    }

    public Admin() {
    }
}
