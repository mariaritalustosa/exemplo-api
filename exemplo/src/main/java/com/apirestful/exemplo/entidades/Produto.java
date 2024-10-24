package com.apirestful.exemplo.entidades;

import java.util.*;
import jakarta.persistence.*;

@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idProduto;
    private String nome;
    private double preco;
    private int quantidade;

    @ManyToOne
    @JoinColumn(name = "idCategoria")
    private Categoria categoria;

    @ManyToMany
    @JoinTable(
        name = "produto_fornecedor",
        joinColumns = @JoinColumn(name = "idProduto"),
        inverseJoinColumns = @JoinColumn(name = "idFornecedor")
    )
    private List<Fornecedor> fornecedores;    

}
