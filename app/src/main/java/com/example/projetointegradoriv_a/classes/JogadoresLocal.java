package com.example.projetointegradoriv_a.classes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JogadoresLocal {

    @SerializedName("camisa")
    @Expose
    private String camisa;
    @SerializedName("nome")
    @Expose
    private String nome;

    public String getCamisa() {
        return camisa;
    }

    public void setCamisa(String camisa) {
        this.camisa = camisa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}