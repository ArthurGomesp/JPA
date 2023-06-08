package org.loja.br.com.loja.test;

import org.loja.br.com.loja.model.Produto;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class CadastroDeProduto {
    public static void main(String[] args) {
        Produto celular = new Produto();
        celular.setNome("xiaomi 13 pro");
        celular.setDescricao("excelente");
        celular.setPreco(new BigDecimal("6500"));

        EntityManagerFactory factory = Persistence.
                createEntityManagerFactory("loja");
        EntityManager em = factory.createEntityManager();
        em.persist(celular);
        em.persist(celular);
    }
}
