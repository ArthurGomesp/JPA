package org.loja.br.com.loja.model;

import lombok.Getter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "categoria") @Getter
public class ItemPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal precoUnitario;
    private Integer quantidade;

    @ManyToOne
    private Pedido pedido;
    @ManyToOne
    private Produto produto;

    public ItemPedido() {
    }
    public ItemPedido(Integer quantidade, Pedido pedido, Produto produto) {
        this.quantidade = quantidade;
        this.pedido = pedido;
        this.produto = produto;
    }
}
