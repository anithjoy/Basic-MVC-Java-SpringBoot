package com.example.product.service;

// Business logics are implemented

import com.example.product.model.Product;
import com.example.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product saveProduct (Product product) {
        return productRepository.save(product);
    }

    public Product getProductById(Long id){
        return productRepository.findById(id).orElse(null);
    }
}
