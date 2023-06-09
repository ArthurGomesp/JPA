package org.loja.br.com.loja.model;


import lombok.Getter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity @Table(name = "categoria") @Getter
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal valorTotal;
    private LocalDate data = LocalDate.now();
    @ManyToOne
    private Cliente cliente;
    @OneToMany
    private List<ItemPedido> itens;

    public Pedido() {
    }
    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }
}
