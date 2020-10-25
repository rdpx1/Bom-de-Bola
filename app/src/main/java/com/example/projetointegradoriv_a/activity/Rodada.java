package com.example.projetointegradoriv_a.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projetointegradoriv_a.R;
import com.example.projetointegradoriv_a.adapter.RodadaAdapter;
import com.example.projetointegradoriv_a.classes.Partida;
import com.example.projetointegradoriv_a.service.WebServiceClient;
import com.example.projetointegradoriv_a.service.WebServiceTimeInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Rodada extends AppCompatActivity  {

    List<Partida> partidaList;
    RecyclerView recyclerView;
    RodadaAdapter recyclerAdapter;
    private TextView buttonRetorno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rodada);

        partidaList = new ArrayList<>();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerviewrodada);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerAdapter = new RodadaAdapter(getApplicationContext(), partidaList);
        recyclerView.setAdapter(recyclerAdapter);

        WebServiceTimeInterface webserviceCall = WebServiceClient.getClient().create(WebServiceTimeInterface.class);

        Call<List<Partida>> call = webserviceCall.getJSON();

        call.enqueue(new Callback<List<Partida>>() {

            @Override
            public void onResponse(Call<List<Partida>> call, Response<List<Partida>> response) {

                if (response.isSuccessful()) {
                    partidaList = response.body();
                    Log.d("TAG","Response ="+ partidaList);
                    recyclerAdapter.setPartidaList(partidaList);
                 }
        }

                 @Override
                 public void onFailure(Call<List<Partida>> call, Throwable t) {
                    Log.d("TAG", "Response = " +t.toString());

            }
        });

        //Botão de retorno
        buttonRetorno = findViewById(R.id.buttonSair);

        buttonRetorno.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view)
            {

                retornar();
            }


        });

    }

    private void retornar() {

        Intent return_campeonato = new Intent(this, MainActivity.class);
        startActivity(return_campeonato);
    }

}
