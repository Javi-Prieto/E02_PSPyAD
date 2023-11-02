package com.example.Exercise2Part1.services;

import com.example.Exercise2Part1.model.Categoria;
import com.example.Exercise2Part1.model.Producto;
import com.example.Exercise2Part1.repository.ProductoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductoService {
    private final ProductoRepository repository;

    public List<Producto> findAll(){
        return Collections.unmodifiableList(repository.findAll());
    }

    public Optional<Producto> findById(Long id){
        return repository.findById(id);
    }

    public Producto save(Producto p){
        return repository.save(p);
    }
}
