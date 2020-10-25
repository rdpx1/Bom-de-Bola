package com.example.projetointegradoriv_a.classes;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PartidaInfo {

    @SerializedName("gols_local")
    @Expose
    private String golsLocal;
    @SerializedName("gols_visitante")
    @Expose
    private String golsVisitante;
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
    @SerializedName("jogadores_local")
    @Expose
    private List<JogadoresLocal> jogadoresLocal = null;
    @SerializedName("jogadores_visitante")
    @Expose
    private List<JogadoresVisitante> jogadoresVisitante = null;

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

    public List<JogadoresLocal> getJogadoresLocal() {
        return jogadoresLocal;
    }

    public void setJogadoresLocal(List<JogadoresLocal> jogadoresLocal) {
        this.jogadoresLocal = jogadoresLocal;
    }

    public List<JogadoresVisitante> getJogadoresVisitante() {
        return jogadoresVisitante;
    }

    public void setJogadoresVisitante(List<JogadoresVisitante> jogadoresVisitante) {
        this.jogadoresVisitante = jogadoresVisitante;
    }
}
