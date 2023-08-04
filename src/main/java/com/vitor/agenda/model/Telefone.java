package com.vitor.agenda.model;

import java.lang.reflect.Array;

public class Telefone {

    private String ddd;
    private String numero;

    public Telefone(String numeroCompleto) {
        String[] data = numeroCompleto.split(" ");
        ddd = data[0];
        numero = data[1];
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumeroCompleto(){
        return ddd + numero;
    }


}
