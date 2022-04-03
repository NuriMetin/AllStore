package com.ecommerce.allstore.bean;

import lombok.Data;

@Data
public class RegisterModel {
    private String name;
    private String surname;
    private String fatherName;
    private String email;
    private String username;
    private String password;
    private String confirmPassword;
}
