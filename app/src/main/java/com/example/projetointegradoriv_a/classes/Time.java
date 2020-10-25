package com.example.projetointegradoriv_a.classes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Time {

    @SerializedName("id_time")
    @Expose
    private Integer idTime;
    @SerializedName("posicao")
    @Expose
    private String posicao;
    @SerializedName("url_brasao")
    @Expose
    private String urlBrasao;
    @SerializedName("nome")
    @Expose
    private String nome;
    @SerializedName("saldo_gols")
    @Expose
    private String saldoGols;
    @SerializedName("pontos")
    @Expose
    private String pontos;

    public Integer getIdTime() {
        return idTime;
    }

    public void setIdTime(Integer idTime) {
        this.idTime = idTime;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getUrlBrasao() {
        return urlBrasao;
    }

    public void setUrlBrasao(String urlBrasao) {
        this.urlBrasao = urlBrasao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSaldoGols() {
        return saldoGols;
    }

    public void setSaldoGols(String saldoGols) {
        this.saldoGols = saldoGols;
    }

    public String getPontos() {
        return pontos;
    }

    public void setPontos(String pontos) {
        this.pontos = pontos;
    }
}