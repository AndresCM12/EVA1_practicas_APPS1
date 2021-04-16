package com.example.eva1_6_eventos;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class MiClaseOnClick implements View.OnClickListener{
        Context context;
    @Override
    public void onClick(View v) {
        Toast.makeText(context, "", Toast.LENGTH_SHORT).show();
    }

    public void setContext(Context context){
        this.context=context;
    }
}
