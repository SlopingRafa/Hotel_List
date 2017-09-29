package com.example.secomp.hotel;

/**
 * Created by secomp on 29/09/17.
 */

public class Hotel {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getEstrela() {
        return estrela;
    }

    public void setEstrela(float estrela) {
        this.estrela = estrela;
    }

    private long id;

    public Hotel(long id, String nome, String endereco, float estrela) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.estrela = estrela;
    }

    public String nome;
    public String endereco;
    public float estrela;

}
