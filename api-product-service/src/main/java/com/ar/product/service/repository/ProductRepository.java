package com.ar.product.service.repository;

import com.ar.product.service.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
* Here Spring Creates SQL Automatically
* Insted of Select*,Insert,Update,Delete
* Here JPARepository provides them all without creating them
* */
@Repository
public interface ProductRepository   extends JpaRepository<Product,Long> {
}
