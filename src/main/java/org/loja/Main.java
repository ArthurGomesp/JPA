package org.loja;

import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.loja.br.com.loja.dao.CategoriaDAO;
import org.loja.br.com.loja.dao.ProdutoDAO;
import org.loja.br.com.loja.model.Produto;
import org.loja.br.com.loja.util.JPAUtil;

import javax.persistence.EntityManager;

import java.util.List;

import static org.loja.br.com.loja.test.CadastroDeProduto.CadastroDeProduto;

public class Main {
    public static void main(String[] args) {
        CadastroDeProduto();
        Long id = 1l;

        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDAO produtoDAO = new ProdutoDAO(em);
        Produto p = produtoDAO.buscarPorId(id);
        System.out.println("=====");
        System.out.println(p.getPreco());
        System.out.println("=====");
        List<Produto> list = produtoDAO.buscarTodos();
        list.forEach(p2 -> System.out.println(p2.getNome()));
        System.out.println("=====");
        List<Produto> listNom = produtoDAO.buscarPorNome("xiaomi 13 pro");
        list.forEach(p2 -> System.out.println(p2.getNome()));
        System.out.println("=====");
        List<Produto> listNomeCategoria = produtoDAO.buscarPorNomeDaCategoria("celulares");
        list.forEach(p2 -> System.out.println(p2.getNome()));
    }
}