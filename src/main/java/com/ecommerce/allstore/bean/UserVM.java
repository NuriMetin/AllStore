package com.ecommerce.allstore.bean;

import java.util.Date;

public class UserVM {
    private Integer id;
    private String name;
    private String surname;
    private String fatherName;
    private String email;
    private String username;
    private String password;
    private String confirmPassword;
    private int wrongPasswordCount;
    private Date createdDate;
    private Date lockedDate;
    private boolean active;
}
