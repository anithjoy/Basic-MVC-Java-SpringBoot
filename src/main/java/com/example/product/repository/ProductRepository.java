package com.example.product.repository;

//The repository interacts with the database.


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.product.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
