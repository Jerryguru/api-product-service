package com.ar.product.service.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
@Entity
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // it will gives the auto increment
    private Long id;

    @Column(nullable = false) // here it should not be null mush and should be value.
    private String ProductName;

    @Column(length = 1000)
    private String description;

    @Column(nullable = false)
    private Double price;

    private  Integer quantity;

    private  String category;

    private  String brand;

    @Column(unique = true) // here we cant use the o Duplicates
    private String sku;

    private Boolean status;

    private LocalDateTime CreatedDate;

    private  LocalDateTime UpdatedDate;

}
