package com.example.eva1_8_eventos_recursos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    TextView txtVwNombre, txtVwApellido;
    EditText edtTxtNombre, edtTxtApellido;
    RadioGroup rdGrpIdioma;
    RadioButton rdBtnEnglish, rdBtnSpanish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVwNombre = findViewById(R.id.txtVwNombre);
        txtVwApellido = findViewById(R.id.txtVwApellido);

        edtTxtNombre = findViewById(R.id.edtTxtNombre);
        edtTxtApellido = findViewById(R.id.edtTxtApellido);

        rdBtnEnglish = findViewById(R.id.rdBtnEnglish);

        rdGrpIdioma = findViewById(R.id.rdGrpIdioma);

        rdBtnSpanish = findViewById(R.id.rdBtnSpanish);

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if (checkedId == R.id.rdBtnSpanish){
            txtVwNombre.setText(R.string.txt_vw_nom);
            edtTxtNombre.setHint(R.string.edt_txt_nom);
            txtVwApellido.setText(R.string.txt_vw_ape);
            edtTxtApellido.setHint(R.string.edt_txt_ape);
            rdBtnSpanish.setText(R.string.rd_btn_es);
            rdBtnEnglish.setText(R.string.rd_btn_in);


        }else{
            txtVwNombre.setText(R.string.txt_vw_nom_en);
            edtTxtNombre.setHint(R.string.edt_txt_nom_en);
            txtVwApellido.setText(R.string.txt_vw_ape_en);
            edtTxtApellido.setHint(R.string.edt_txt_ape_en);
            rdBtnSpanish.setText(R.string.rd_btn_es_en);
            rdBtnEnglish.setText(R.string.rd_btn_in_en);
        }
    }
}