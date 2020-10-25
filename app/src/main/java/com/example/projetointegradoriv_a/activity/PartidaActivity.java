package com.example.projetointegradoriv_a.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projetointegradoriv_a.R;
import com.example.projetointegradoriv_a.adapter.PartidaTimeLocalAdapter;
import com.example.projetointegradoriv_a.adapter.PartidaTimeVisitanteAdapter;
import com.example.projetointegradoriv_a.adapter.RodadaAdapter;
import com.example.projetointegradoriv_a.classes.JogadoresLocal;
import com.example.projetointegradoriv_a.classes.JogadoresVisitante;
import com.example.projetointegradoriv_a.service.WebServiceClient;
import com.example.projetointegradoriv_a.service.WebServiceTimeInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PartidaActivity extends AppCompatActivity {



    List<JogadoresLocal> jogadoresLocalList;
    List<JogadoresVisitante> jogadoresVisitantesList;
    RecyclerView recyclerView;
    PartidaTimeLocalAdapter recyclerLocalAdapter;
    PartidaTimeVisitanteAdapter recyclerVisitanteAdapter;
    private TextView buttonRetornar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.partida);

        jogadoresLocalList = new ArrayList<>();
        jogadoresVisitantesList = new ArrayList<>();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerviewlocal);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerLocalAdapter = new PartidaTimeLocalAdapter(getApplicationContext(), jogadoresLocalList);
        recyclerView.setAdapter(recyclerLocalAdapter);


                WebServiceTimeInterface webserviceCall = WebServiceClient.getClient().create(WebServiceTimeInterface.class);


        //Chamando infos time local
        Call<List<JogadoresLocal>> call = webserviceCall.getInfoLocal();

        call.enqueue(new Callback<List<JogadoresLocal>>() {

            @Override
            public void onResponse(Call<List<JogadoresLocal>> call, Response<List<JogadoresLocal>> response) {

                if (response.isSuccessful()) {
                    jogadoresLocalList = response.body();
                    Log.d("TAG","Response ="+ jogadoresLocalList);
                    recyclerLocalAdapter.setLocalList(jogadoresLocalList);
                }
            }

            @Override
            public void onFailure(Call<List<JogadoresLocal>> call, Throwable t) {
                Log.d("TAG", "Response = " +t.toString());

            }
        });

        //Chamando info jogadores visitante
        recyclerView = (RecyclerView)findViewById(R.id.recyclerviewvisitante);
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager2);
        recyclerVisitanteAdapter = new PartidaTimeVisitanteAdapter(getApplicationContext(), jogadoresVisitantesList);
        recyclerView.setAdapter(recyclerVisitanteAdapter);

        Call<List<JogadoresVisitante>> callVisitante = webserviceCall.getInfoVisitante();

        callVisitante.enqueue(new Callback<List<JogadoresVisitante>>() {
            @Override
            public void onResponse(Call<List<JogadoresVisitante>> call, Response<List<JogadoresVisitante>> response) {

                if (response.isSuccessful()) {
                    jogadoresVisitantesList = response.body();
                    Log.d("TAG","Response ="+ jogadoresVisitantesList);
                    recyclerVisitanteAdapter.setVisitanteList(jogadoresVisitantesList);

                }

            }

            @Override
            public void onFailure(Call<List<JogadoresVisitante>> call, Throwable t) {

                Log.d("TAG", "Response = " +t.toString());

            }
        });


        //Botão de retorno
        buttonRetornar = findViewById(R.id.buttonRetornar);

        buttonRetornar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view)
            {

                retornar();
            }


        });


    };

    private void retornar() {

        Intent return_rodada = new Intent(this, Rodada.class);
        startActivity(return_rodada);
    }
}
