package com.example.Exercise2Part1.services;

import com.example.Exercise2Part1.model.Categoria;
import com.example.Exercise2Part1.repository.CategoriaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoriaService {
    private final CategoriaRepository repository;

    public List<Categoria> findAll(){
        return Collections.unmodifiableList(repository.findAll());
    }

    public Optional<Categoria> findById(Long id){
        return repository.findById(id);
    }

    public Categoria save(Categoria c){
        return repository.save(c);
    }
}
