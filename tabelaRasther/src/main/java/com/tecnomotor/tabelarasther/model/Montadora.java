package com.tecnomotor.tabelarasther.model;

public class Montadora {
    private  int id;
    private  String nome;
    private Categoria tipo;

    public Montadora(int id, String nome, Categoria tipo) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Categoria getTipo() {
        return tipo;
    }


    @Override
    public String toString() {
        return getNome();
    }
}
