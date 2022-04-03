package com.ecommerce.allstore.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "product_images")
public class ProductImages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imagePath;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="product_id",referencedColumnName = "id")
    private Product product;
}
