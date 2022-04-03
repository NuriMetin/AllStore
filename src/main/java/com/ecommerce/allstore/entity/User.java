package com.ecommerce.allstore.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String fatherName;
    private String email;
    private String username;
    private String password;
    private int wrongPasswordCount;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    private Date lockedDate;
    private boolean active;

    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Role> roles=new ArrayList<>();
}
