package com.ecommerce.allstore.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "countries")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
