package com.example.eva1_14_recycle_view;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.ViewHolder>{

    private  String[] aDatos;

    public MiAdaptador(String[] aDatos) {
        this.aDatos = aDatos;
    }

    //viewholder representa un item de la lista
    //eventos y m[etodos de cada widget

    public static class ViewHolder extends RecyclerView.ViewHolder{
         private final TextView txtVwFila;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtVwFila = itemView.findViewById(R.id.txtVwFila);
        }

        public TextView getTxtVwFila() {
            return txtVwFila;
        }
    }

    //crear la pantala cada fila y crear los objetos view holder
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.texto_fila, parent, false);
        return new ViewHolder(v);
    }

    //llenar con datos
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.getTxtVwFila().setText(aDatos[position]);
    }



    @Override
    public int getItemCount() {
        return aDatos.length;
    }
}
