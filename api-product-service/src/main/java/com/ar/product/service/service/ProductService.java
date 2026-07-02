package com.ar.product.service.service;

import com.ar.product.service.entity.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);

    List<Product> getAllProducts();

    Product getProductById(Long id);
}
