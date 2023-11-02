package com.example.Exercise2Part1.repository;

import com.example.Exercise2Part1.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}