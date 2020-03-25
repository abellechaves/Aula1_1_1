package com.example.aula1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.text.Editable;
import android.util.Log;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Conversor de Temperatura");

    }
public void ConverterTemp(View view){

    Log.d(tag:"texto", msg"clicou")
    EditText edit = (EditText) FindViewById(R.id.editText);
    Editable resposta = edit.getText();
    float floatResposta = 0;
    if(resposta.lenght() > 0){
        floatResposta - Float .parseFloat(String.valueOf(resposta));
    }
    Intent intent = new Intent(pakageContext: this, Tela 2.class);
    intent.putExtra(name:"resposta",floatResposta);
    startActivity(intent]);
}






    @Override
    protected void onResume(){
        super.onResume();
}

@Override
    protected void onPause(){
        super.onPause();
}

@Override
    protected void onStop(){ super.onStop(); }

@Override
    protected void onDestroy(){
        super.onDestroy();
}


}
