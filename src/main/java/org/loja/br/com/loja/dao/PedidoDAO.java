package org.loja.br.com.loja.dao;

import org.loja.br.com.loja.model.Pedido;
import org.loja.br.com.loja.model.Produto;

import javax.persistence.EntityManager;
import java.util.List;

public class PedidoDAO {
    private EntityManager em;

    public PedidoDAO(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Pedido pedido){
        this.em.persist(pedido);
    }


}
