package com.tecnomotor.tabelarasther.model;

public class Sistema {
    private  int id;
    private  String nome;

    public Sistema(int id, String nome) {
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
