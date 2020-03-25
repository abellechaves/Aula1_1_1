package com.example.aula1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Tela2 extends AppCompatActivity {

    protected void onCreat(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        setTitle("Resultado da Conversão");

        Intent intent = getIntent();
        float valor = intent.getFloatExtra(name: resposta, defaultValue:0);

        float conversao = ((valor * 9)/5) + 32;

        TextView = (TextView) findViewById(R.id.textViewTela2);
        text.setText("valor em Fahreinheit:" + conversao);

    }





}
