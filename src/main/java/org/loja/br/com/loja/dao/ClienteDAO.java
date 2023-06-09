package org.loja.br.com.loja.dao;

import org.loja.br.com.loja.model.Cliente;
import org.loja.br.com.loja.model.Produto;

import javax.persistence.EntityManager;
import java.util.List;

public class ClienteDAO {
    private EntityManager em;

    public ClienteDAO(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Cliente cliente){
        this.em.persist(cliente);
    }
    public Cliente buscarPorId(Long id){
        return em.find(Cliente.class, id);
    }

}
