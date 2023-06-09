package org.loja.br.com.loja.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categoria")
@Getter
@Setter
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "valor_total")
    private BigDecimal valorTotal;
    private LocalDate data = LocalDate.now();
    @ManyToOne
    private Cliente cliente;
    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
    private List<ItemPedido> itens = new ArrayList<>();

    public void adicionarItem(ItemPedido item){
        item.setPedido(this);
        this.itens.add(item);
    }

    public Pedido() {
    }
    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }
}
