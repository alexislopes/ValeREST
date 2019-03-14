package com.vc.rest.valerest.Document;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Dia {

    @Getter @Setter private String _id;
    @Getter @Setter private String data;
    @Getter @Setter private List<Sorteio> sorteios;

    public Dia() {
    }

    public Dia(String _id, String data, List<Sorteio> sorteios) {
        this._id = _id;
        this.data = data;
        this.sorteios = sorteios;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<Sorteio> getSorteios() {
        return sorteios;
    }

    public void setSorteios(List<Sorteio> sorteios) {
        this.sorteios = sorteios;
    }
}
