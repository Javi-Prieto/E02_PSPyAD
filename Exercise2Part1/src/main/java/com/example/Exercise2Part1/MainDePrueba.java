package com.example.Exercise2Part1;

import com.example.Exercise2Part1.model.Categoria;
import com.example.Exercise2Part1.model.Producto;
import com.example.Exercise2Part1.repository.CategoriaRepository;
import com.example.Exercise2Part1.services.ProductoService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MainDePrueba {
    private final ProductoService serviceP;
    private final CategoriaRepository serviceC;
    @PostConstruct
    public void init(){
        Categoria c1 = Categoria.builder()
                .id(1L)
                .nombre("Ordenadores")

                .build();

        serviceC.save(c1);

        Categoria c2 = Categoria.builder()
                .id(2L)
                .nombre("Electronica")
                .build();
        serviceC.save(c2);
        c2.addChildren(c1);

        Producto p = Producto.builder()
                .id(1L)
                .nombre("HP Legion 5")
                .categoria(c1)
                .pvp(546.58)
                .build();
        serviceP.save(p);


    }
}