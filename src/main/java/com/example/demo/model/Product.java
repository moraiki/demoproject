package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor

@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false) // Asegúrate de que no permita valores nulos
    private Integer stock; // Agrega el campo 'stock'

    @Column(nullable = false) // Asegúrate de que no permita valores nulos
    private double weight; // Agrega el campo 'stock'
}
