package com.example.eva1_12_clima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Clima[] aClimaCd = {
            new Clima(R.drawable.sunny, 28, "Chihuahua", "Despejado con viento"),
            new Clima(R.drawable.atmospher, 25, "Delicias", "Vientos huracanados"),
            new Clima(R.drawable.cloudy, 24, "Camargo", "Nublado"),
            new Clima(R.drawable.light_rain, 23, "Casas Grandes", "Poca lluvia"),
            new Clima(R.drawable.rainy, 22, "Parral", "Lluviosos"),
            new Clima(R.drawable.snow, 13, "Cuauhtemoc", "Nieve"),
            new Clima(R.drawable.thunderstorm, 30, "Guerrero", "Tormenta de rayos"),
            new Clima(R.drawable.tornado, 20, "Creel", "Despejado con viento"),

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clima);
        Prueba<Integer> obj = new Prueba();
    }

    ListView lstVwClima;
    @Override
    protected void onStart() {
        super.onStart();
        lstVwClima = findViewById(R.id.lstVwClima);
        lstVwClima.setAdapter(new ClimaAdaptador(this, R.layout.activity_main, aClimaCd));

    }
}

class Prueba<T>{
    private T algo;

    public T getAlgo() {
        return algo;
    }

    public void setAlgo(T algo) {
        this.algo = algo;
    }
}