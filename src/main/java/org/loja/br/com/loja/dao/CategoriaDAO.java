package org.loja.br.com.loja.dao;

import org.loja.br.com.loja.model.Categoria;
import org.loja.br.com.loja.model.Produto;

import javax.persistence.EntityManager;
import java.util.List;

public class CategoriaDAO {
    private EntityManager em;

    public CategoriaDAO(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Categoria categoria){
        this.em.persist(categoria);
    }

}
