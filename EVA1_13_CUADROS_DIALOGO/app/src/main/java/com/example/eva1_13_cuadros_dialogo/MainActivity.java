package com.example.eva1_13_cuadros_dialogo;


import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickCDSistema(View v){
        new AlertDialog.Builder(this).
                setTitle("Cuadro de dialogo de Android").
                setMessage("Cuerpo del mensaje").
                setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this,
                                        "Boton Ok", Toast.LENGTH_SHORT).show();
                            }
                        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,
                        "No", Toast.LENGTH_SHORT).show();
            }
        }).setNeutralButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,
                        "cancelar", Toast.LENGTH_SHORT).show();
            }
        }).show();


    }

    public void onClickCDCustom(View v){
        Dialog dlgMiCuadroDialogo = new Dialog(this);
        //asignamos el layout
        dlgMiCuadroDialogo.setContentView(R.layout.cuadro_dialogo);
        //vincular widgets
        TextView titulo;
        EditText datos;
        Button ok;

        titulo = dlgMiCuadroDialogo.findViewById(R.id.txtVwTitulo);
        datos = dlgMiCuadroDialogo.findViewById(R.id.txtVwDatos);
        ok = dlgMiCuadroDialogo.findViewById(R.id.btnOk);

        titulo.setText(" Este es un cuadro personalizado");
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, datos.getText().
                        toString(), Toast.LENGTH_SHORT).show();

            }
        });
        dlgMiCuadroDialogo.show();

    }
}