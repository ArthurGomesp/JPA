package org.loja.br.com.loja.model;


import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "categoria")

@Getter
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Categoria() {
    }
    public Categoria(String name) {
        this.name = name;
    }
}
