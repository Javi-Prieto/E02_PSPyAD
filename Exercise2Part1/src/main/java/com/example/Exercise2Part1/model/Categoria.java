package com.example.Exercise2Part1.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String nombre;
    @ManyToOne
    private Categoria parent;

    @ToString.Exclude
    @OneToMany(mappedBy = "parent", orphanRemoval = true)
    private Set<Categoria> childrens = new LinkedHashSet<>();


    //Helpers
    public void addChildren(Categoria c){
        this.childrens.add(c);
        c.setParent(c);

    }
}
