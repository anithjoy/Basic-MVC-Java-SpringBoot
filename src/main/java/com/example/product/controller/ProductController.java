package com.example.product.controller;

import com.example.product.model.Product;
import com.example.product.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductController {
    private final ProductService productService;

    public ProductController (ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

//     request body converts json data into products object
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        System.out.println(" Product input ->"+ product.getName() );
        return productService.saveProduct(product);
    }

//    get by id function style
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        System.out.println("Post Id"+ id);
        return productService.getProductById(id) ;
    }
}
