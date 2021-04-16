package com.example.eva1_7_radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rdGrpComida;
    ProgressBar prgrsBr;
    int progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdGrpComida = findViewById(R.id.rdGrpComida);
        prgrsBr = findViewById(R.id.prgrsBrUno);
        prgrsBr.setMax(100);
        progress = 0;
        //ASIGNAR EL LISTENER CLASE ANONIMA
        rdGrpComida.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
               //TOAST INDICANDO CUAL RADIOBUTTON FUE SELECCIONADO

                switch (checkedId){
                    case R.id.radioButton:
                        mostratTexto("Tacos");
                        aumentarProgreso();
                        break;
                    case R.id.radioButton2:
                        mostratTexto("Montados");
                        aumentarProgreso();
                        break;
                    case R.id.radioButton3:
                        mostratTexto("Buttitos");
                        aumentarProgreso();
                        break;
                    case R.id.radioButton4:
                        mostratTexto("Alitas");
                        aumentarProgreso();
                        break;
                    case R.id.radioButton5:
                        mostratTexto("Garnachas");
                        aumentarProgreso();
                        break;

                }

            }
        });

    }
    public void aumentarProgreso(){
        progress = progress + 20;
        prgrsBr.setProgress(progress);
    }

    public void mostratTexto(String texto){
        Toast.makeText(MainActivity.this,texto,Toast.LENGTH_SHORT).show();
    }
}