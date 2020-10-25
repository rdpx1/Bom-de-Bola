package com.example.projetointegradoriv_a.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.projetointegradoriv_a.R;


public class SignUp extends AppCompatActivity {

    private TextView buttonRegistrar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        buttonRegistrar = findViewById(R.id.buttonRegistrar);

        buttonRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                registrar();
            }
        });

    }

    private void registrar() {

        Toast.makeText(this, "Os seus dados foram salvos!", Toast.LENGTH_LONG).show();
        Intent return_login = new Intent(this, Login.class);
        startActivity(return_login);
    }

}