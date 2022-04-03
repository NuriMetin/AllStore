package com.ecommerce.allstore.entity;

import jdk.jfr.Experimental;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "product_details")
public class ProductDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String content;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="product_id",referencedColumnName = "id")
    private Product product;
}
