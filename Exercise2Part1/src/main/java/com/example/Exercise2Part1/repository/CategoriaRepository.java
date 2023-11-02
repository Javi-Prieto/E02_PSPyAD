package com.example.Exercise2Part1.repository;

import com.example.Exercise2Part1.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}