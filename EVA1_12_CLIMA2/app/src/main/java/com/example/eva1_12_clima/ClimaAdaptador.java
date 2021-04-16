package com.example.eva1_12_clima;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ClimaAdaptador extends ArrayAdapter<Clima> {
    private Context context;
    private int layout;
    private Clima[] cCiudades;


    public ClimaAdaptador(@NonNull Context context, int resource, @NonNull Clima[] objects) {
        super(context, resource, objects);
        this.context = context;
        this.layout = resource;
        this.cCiudades = objects;
    }


    //
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //fila: no existe la fila
        if(convertView == null) { //primera vez que se muestra la lista, no existe
            convertView = ((Activity)context).getLayoutInflater().inflate(layout, parent,false);
        }else{//fila: si existe y hay que llenar

        }

        ImageView imgVwClima;
        TextView txtVwCd, txtVwTemp, txtVwDesc;

        //vincularlas para poder usarlas
        imgVwClima = convertView.findViewById(R.id.imgVwImagen);
        txtVwCd = convertView.findViewById(R.id.txtVwTitulo);
        txtVwTemp = convertView.findViewById(R.id.txtVwTemp);
        txtVwDesc = convertView.findViewById(R.id.txtVwDesc);

        //llenar los widgets con datos(arreglo cCiudades)
        imgVwClima.setImageResource(cCiudades[position].getImagen());
        txtVwCd.setText(cCiudades[position].getCiudad());
        txtVwTemp.setText(cCiudades[position].getTemp()+" C");
        txtVwDesc.setText(cCiudades[position].getDesc());

        return convertView;
    }

}
