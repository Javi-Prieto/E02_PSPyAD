package com.example.Exercise2Part1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private Double pvp;

    @ManyToOne
    private Categoria categoria;
}
