package com.example.projetointegradoriv_a.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.projetointegradoriv_a.R;

public class MainActivity extends AppCompatActivity {


    private ImageView imageViewCampeonato;
    private TextView buttonSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageViewCampeonato = (ImageView) findViewById(R.id.imageViewCampeonato);
        imageViewCampeonato.setTag(R.drawable.logo_brasileiro);


        imageViewCampeonato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sendRodada();

            }

            ;
        });

        buttonSair = findViewById(R.id.buttonSair);

        buttonSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sairApp();
            }
        });


    }

    private void sendRodada()
    {

        Intent send_rodada = new Intent(this, Rodada.class);
        startActivity(send_rodada);

    };

    private void sairApp()
    {

        this.finishAffinity();

    };

}