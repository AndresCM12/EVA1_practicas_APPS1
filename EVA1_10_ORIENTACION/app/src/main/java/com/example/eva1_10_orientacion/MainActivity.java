package com.example.eva1_10_orientacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtVwMensaje;

    @Override
    protected void onStart() {
        super.onStart();
        txtVwMensaje = findViewById(R.id.txtVwMensaje);
        txtVwMensaje.setText("El mismo widget en dos layouts distintos");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



}