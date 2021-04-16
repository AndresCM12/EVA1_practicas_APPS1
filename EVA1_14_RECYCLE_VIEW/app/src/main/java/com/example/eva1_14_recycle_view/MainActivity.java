package com.example.eva1_14_recycle_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcVwLista;
    String[] aDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aDatos = new String[100];
        for (int i = 0; i<100; i++){
            aDatos[i] = "Elemento no. "+i;
        }
        llenar(aDatos);
        rcVwLista = findViewById(R.id.rcVwLista);
        rcVwLista.setAdapter(new MiAdaptador(aDatos));

        rcVwLista.setLayoutManager(new LinearLayoutManager(this));
       // rcVwLista.setLayoutManager(new GridLayoutManager(this,2));
    }

    public void llenar(String[] args){
        args = new String[100];
        for (int i = 0; i<100; i++){
                args[i] = "Elemento no. "+i;
        }
    }

}