package com.example.projetointegradoriv_a.service;

import com.example.projetointegradoriv_a.classes.JogadoresLocal;
import com.example.projetointegradoriv_a.classes.JogadoresVisitante;
import com.example.projetointegradoriv_a.classes.Partida;
import com.example.projetointegradoriv_a.classes.PartidaInfo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface WebServiceTimeInterface {
    @Headers({
            "Content-Type: application/json"
    })

//    @GET("$2y$12$C5B9ilbmPXWtsH8RYj7GbOamWTbRbQFYvpsB3T3g7VahHx7gJYPum")
      @GET("partidas")
     Call<List<Partida>> getJSON();

     @GET("partidas/1/jogadores_local")
    Call<List<JogadoresLocal>> getInfoLocal();

     @GET("partidas/1/jogadores_visitantes")
    Call<List<JogadoresVisitante>> getInfoVisitante();

}
