package com.ecommerce.allstore.entity;

import lombok.Data;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data
@Table(name = "producers")
public class Producer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "producer_id",referencedColumnName = "id")
    private Collection<Product> products=new ArrayList<>();
}
