package com.example.projetointegradoriv_a.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.projetointegradoriv_a.R;


public class Login extends AppCompatActivity {

    private TextView buttonLogin;
    private TextView buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        buttonLogin = findViewById(R.id.buttonSair);
        buttonRegister = findViewById(R.id.buttonRegister);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                login();

            }
        });

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                register();

                }
            });

        }


    private void login() {

            Toast.makeText(Login.this, "Você está conectado!", Toast.LENGTH_LONG).show();

            Intent principal = new Intent(this, MainActivity.class);

            startActivity(principal);
        }

    private void register() {

        Intent register_user = new Intent(this, SignUp.class);
        startActivity(register_user);
    }



}



