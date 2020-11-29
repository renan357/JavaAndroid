package com.example.javaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void iniciaCliente (View v){
        Intent intent = new Intent(v.getContext(), Cliente.class);
        startActivity(intent);
    }

    public void iniciaItemDePedido (View v){
        Intent intent = new Intent(v.getContext(), ItemDePedido.class);
        startActivity(intent);
    }

    public void iniciaPedido (View v){
        Intent intent = new Intent(v.getContext(), Pedido.class);
        startActivity(intent);
    }

    public void iniciaListaDePedidos (View v){
        Intent intent = new Intent(v.getContext(), ListaDePedidos.class);
        startActivity(intent);
    }

}