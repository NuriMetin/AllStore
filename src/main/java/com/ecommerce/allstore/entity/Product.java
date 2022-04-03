package com.ecommerce.allstore.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private double price;
    private double discountPrice;
    private int count;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="subcategory_id",referencedColumnName = "id")
    private Subcategory subcategory;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="company_id",referencedColumnName = "id")
    private Company company;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="producer_id",referencedColumnName = "id")
    private Producer producer;
}
