
package com.example.projetointegradoriv_a.classes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Partida {

    @SerializedName("id_partida")
    @Expose
    private Integer idPartida;
    @SerializedName("nome_local")
    @Expose
    private String nomeLocal;
    @SerializedName("nome_visitante")
    @Expose
    private String nomeVisitante;
    @SerializedName("url_brasao_local")
    @Expose
    private String urlBrasaoLocal;
    @SerializedName("url_brasao_visitante")
    @Expose
    private String urlBrasaoVisitante;
    @SerializedName("gols_local")
    @Expose
    private String golsLocal;
    @SerializedName("gols_visitante")
    @Expose
    private String golsVisitante;

    public Integer getIdPartida() {
        return idPartida;
    }

    public void setIdPartida(Integer idPartida) {
        this.idPartida = idPartida;
    }

    public String getNomeLocal() {
        return nomeLocal;
    }

    public void setNomeLocal(String nomeLocal) {
        this.nomeLocal = nomeLocal;
    }

    public String getNomeVisitante() {
        return nomeVisitante;
    }

    public void setNomeVisitante(String nomeVisitante) {
        this.nomeVisitante = nomeVisitante;
    }

    public String getUrlBrasaoLocal() {
        return urlBrasaoLocal;
    }

    public void setUrlBrasaoLocal(String urlBrasaoLocal) {
        this.urlBrasaoLocal = urlBrasaoLocal;
    }

    public String getUrlBrasaoVisitante() {
        return urlBrasaoVisitante;
    }

    public void setUrlBrasaoVisitante(String urlBrasaoVisitante) {
        this.urlBrasaoVisitante = urlBrasaoVisitante;
    }

    public String getGolsLocal() {
        return golsLocal;
    }

    public void setGolsLocal(String golsLocal) {
        this.golsLocal = golsLocal;
    }

    public String getGolsVisitante() {
        return golsVisitante;
    }

    public void setGolsVisitante(String golsVisitante) {
        this.golsVisitante = golsVisitante;
    }

}
