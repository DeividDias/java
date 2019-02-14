package br.com.softbox.ivendas.sellin.entrada.mercadoria;

import java.math.BigDecimal;

public class Item {
    private String nome;
    private String cnpj;
    private Integer nota;

    public Item(String nome, String cnpj, int nota) {
        super();
        this.nome = nome;
        this.cnpj = cnpj;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }
    
}
