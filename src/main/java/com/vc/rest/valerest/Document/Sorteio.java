package com.vc.rest.valerest.Document;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Document
public class Sorteio implements Serializable {

    @Getter @Setter private String _id;
    @Getter @Setter private String data;
    @Getter @Setter private String numero;
    @Getter @Setter private String premio;
    @Getter @Setter private List<Integer> dezenas;
    @Getter @Setter private List<Contemplado> contemplados;

    public Sorteio() {
    }

    public Sorteio(String _id, String data, String numero, String premio, List<Integer> dezenas, List<Contemplado> contemplados) {
        this._id = _id;
        this.data = data;
        this.numero = numero;
        this.premio = premio;
        this.dezenas = dezenas;
        this.contemplados = contemplados;
    }
}
