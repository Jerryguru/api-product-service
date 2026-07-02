package com.ar.product.service.controller;

import com.ar.product.service.entity.Product;
import com.ar.product.service.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Here We are going to expose the End Points (Rest APIS)
@RestController   // it is going to handels the RestApi Request and return the data that data is usually Jason Data
@RequestMapping  ("/products") // here it is a  defines the Base URl for all APIS in this cotroller
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    //Insert  the data into the DB
    //Add HTTP Method : POSTMAPPING
    @PostMapping("/addProduct")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
        Product productResp = productService.saveProduct(product);
        return new ResponseEntity<>(productResp, HttpStatus.CREATED);
    }
    // Retrive all the records from DB
    @GetMapping("/allProducts")
    public ResponseEntity<List<Product>>getAllProducts(){
        List<Product>products = productService.getAllProducts();
        return new ResponseEntity<>(products,HttpStatus.OK);
    }
// Based on the id u need to get the data
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") Long id){
 Product resp = productService.getProductById(id);
 return  new ResponseEntity<>(resp , HttpStatus.OK);
    }


}
