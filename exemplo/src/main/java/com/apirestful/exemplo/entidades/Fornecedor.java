package com.apirestful.exemplo.entidades;

import jakarta.persistence.*;

@Entity
public class Fornecedor {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idFornecedor;
    private String nome;
    private Long contato;

    public int getIdFornecedor() {
        return idFornecedor;
    }
    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Long getContato() {
        return contato;
    }
    public void setContato(Long contato) {
        this.contato = contato;
    }

    

}
