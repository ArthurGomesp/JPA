package org.loja.br.com.loja.dao;

import org.loja.br.com.loja.model.Produto;

import javax.persistence.EntityManager;

public class ProdutoDAO {
    private EntityManager em;

    public ProdutoDAO(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Produto produto){
        em.getTransaction().begin();
        this.em.persist(produto);
        em.getTransaction().commit();
        em.close();
    }
}
