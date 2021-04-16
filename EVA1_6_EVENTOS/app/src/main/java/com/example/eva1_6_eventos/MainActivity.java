package com.example.eva1_6_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {

    Button btnListener, btnClaseAnonima, btnPorClase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //upor interfaz listener
        btnListener = findViewById(R.id.btnListener);
        btnListener.setOnClickListener(this);


        //por clase anonima
        btnClaseAnonima = findViewById(R.id.btnClaseAnonima);
        btnClaseAnonima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
            }
        });


        //por clase
        MiClaseOnClick obje = new MiClaseOnClick();
        obje.setContext(this);
        btnPorClase = findViewById(R.id.btnPorClase);
        btnPorClase.setOnClickListener(new MiClaseOnClick());

    }

    //USANDO LA PROPIEDAD android onclick DEL WIDGET
    //public void NOMBREDELMETODO(View arg){}
    public void miClick(View arg){
        //MOSTRAR UN MENSAJE(TOAST)
        Toast.makeText(this, "Evento por ONCLICK XML", Toast.LENGTH_LONG).show();
    }


    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Evento por Listener", Toast.LENGTH_LONG).show();

    }
}
