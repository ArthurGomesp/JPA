package org.loja.br.com.loja.model;
import lombok.Getter;
import javax.persistence.*;

@Entity @Table(name = "clientes") @Getter
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String cpf;

    public Cliente() {
    }

    public Cliente(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }
}
