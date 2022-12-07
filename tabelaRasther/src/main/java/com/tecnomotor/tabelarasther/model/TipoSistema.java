package com.tecnomotor.tabelarasther.model;

public class TipoSistema {
    private  int id;
    private  String nome;

    public TipoSistema(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }


    @Override
    public String toString() {
        return getNome();
    }
}
