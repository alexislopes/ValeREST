package com.vc.rest.valerest.Document;



import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
public class Contemplado implements Serializable {

    @Getter @Setter private Integer numero;
    @Getter @Setter private String certificado;
    @Getter @Setter private String nome;
    @Getter @Setter private String endereco;
    @Getter @Setter private String bairro;
    @Getter @Setter private String cidade;
    @Getter @Setter private String pontoDeVenda;

    public Contemplado() {
    }

    public Contemplado(Integer numero, String certificado, String nome, String bairro, String cidade, String pontoDeVenda) {
        this.numero = numero;
        this.certificado = certificado;
        this.nome = nome;
        this.bairro = bairro;
        this.cidade = cidade;
        this.pontoDeVenda = pontoDeVenda;
    }
}
