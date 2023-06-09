package org.loja.br.com.loja.test;

import org.loja.br.com.loja.dao.CategoriaDAO;
import org.loja.br.com.loja.dao.ClienteDAO;
import org.loja.br.com.loja.dao.ProdutoDAO;
import org.loja.br.com.loja.model.Categoria;
import org.loja.br.com.loja.model.Cliente;
import org.loja.br.com.loja.model.Produto;
import org.loja.br.com.loja.util.JPAUtil;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;


public class CadastroDeProduto {
    public static void CadastroDeProduto() {
        Categoria celulares = new Categoria("celulares");
        Produto celular = new Produto("xiaomi 13 pro","excelente",new BigDecimal("6500"), celulares);
        Produto celular1 = new Produto("iphone 13 pro","caro",new BigDecimal("15000"), celulares);
        Cliente cliente = new Cliente("Arthur", "52536987");

        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDAO produtoDAO = new ProdutoDAO(em);
        CategoriaDAO categoriaDAO = new CategoriaDAO(em);
        ClienteDAO clienteDAO = new ClienteDAO(em);

        em.getTransaction().begin();
        categoriaDAO.cadastrar(celulares);
        produtoDAO.cadastrar(celular);
        clienteDAO.cadastrar(cliente);

        em.getTransaction().commit();
        em.close();
    }
}
