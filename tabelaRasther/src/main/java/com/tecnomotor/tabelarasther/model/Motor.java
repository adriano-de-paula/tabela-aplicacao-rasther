package com.tecnomotor.tabelarasther.model;

public class Motor {
    private  int id;
    private  String nome;

    public Motor(int id, String nome) {
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
