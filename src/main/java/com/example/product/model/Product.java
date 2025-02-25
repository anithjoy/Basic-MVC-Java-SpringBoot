package com.example.product.model;

import jakarta.persistence.*;
import lombok.*;


@Entity
//marks this class as a database entity
@Table(name="products")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;

}
