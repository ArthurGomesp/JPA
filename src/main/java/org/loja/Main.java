package org.loja;

import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.loja.br.com.loja.dao.CategoriaDAO;
import org.loja.br.com.loja.dao.ClienteDAO;
import org.loja.br.com.loja.dao.PedidoDAO;
import org.loja.br.com.loja.dao.ProdutoDAO;
import org.loja.br.com.loja.model.Cliente;
import org.loja.br.com.loja.model.ItemPedido;
import org.loja.br.com.loja.model.Pedido;
import org.loja.br.com.loja.model.Produto;
import org.loja.br.com.loja.util.JPAUtil;

import javax.persistence.EntityManager;

import java.util.List;

import static org.loja.br.com.loja.test.CadastroDeProduto.CadastroDeProduto;

public class Main {
    public static void main(String[] args) {
        CadastroDeProduto();

        EntityManager em = JPAUtil.getEntityManager();

        ProdutoDAO produtoDAO = new ProdutoDAO(em);
        Produto produto = produtoDAO.buscarPorId(1l);

        em.getTransaction().begin();

        ClienteDAO clienteDAO = new ClienteDAO(em);
        Cliente cliente = clienteDAO.buscarPorId(1l);
        Pedido pedido = new Pedido(cliente);

        pedido.adicionarItem(new ItemPedido(2, pedido, produto));
        PedidoDAO pedidoDAO = new PedidoDAO(em);
        pedidoDAO.cadastrar(pedido);

        em.getTransaction().commit();
        em.close();
    }
}

































