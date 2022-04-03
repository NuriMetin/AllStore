package com.ecommerce.allstore.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data
@Table(name = "companies")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "company_id",referencedColumnName = "id")
    private Collection<Product> products=new ArrayList<>();
}
