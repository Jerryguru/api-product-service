package com.ar.product.service.service.impl;

import com.ar.product.service.entity.Product;
import com.ar.product.service.repository.ProductRepository;
import com.ar.product.service.service.ProductService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

// Here we Write the Business Logics
@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    @Override
    public Product saveProduct(Product product) {
        //product.setCreatedDate (LocalDateTime.now());
        //product.setUpdatedDate(LocalDateTime.now());
        Product saveProduct =   productRepository.save(product);
        return saveProduct;
    }

    @Override
    public List<Product> getAllProducts() {
         List<Product> products =  productRepository.findAll();
        return products;
    }

    @Override
    public Product getProductById(Long id) {
        Product product =  productRepository.findById(id);
        .orElseThrow(()-> new RuntimeException("Product not found with id "+id));
       // .orElseThrow(new RuntimeException("No Product found"));
        return null;
    }


}
