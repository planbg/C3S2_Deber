package com.planbg.c3s2_deber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Actividad2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        Bundle parametrosRecov = getIntent().getExtras();
        String var1 = parametrosRecov.getString(getResources().getString(R.string.pNombre));
        String var2 = parametrosRecov.getString(getResources().getString(R.string.pFecha));
        String var3 = parametrosRecov.getString(getResources().getString(R.string.pTelefono));
        String var4 = parametrosRecov.getString(getResources().getString(R.string.pEmail));
        String var5 = parametrosRecov.getString(getResources().getString(R.string.pDescrip));

        TextView tvVar1  = (TextView) findViewById(R.id.tv_cdNombre);
        TextView tvVar2  = (TextView) findViewById(R.id.tv_cdFecha);
        TextView tvVar3  = (TextView) findViewById(R.id.tv_cdTel);
        TextView tvVar4  = (TextView) findViewById(R.id.tv_cdEmail);
        TextView tvVar5  = (TextView) findViewById(R.id.tv_cdDesc);


        tvVar1.setText(var1);
        tvVar2.setText(getResources().getString(R.string.txt_confFn)+var2);
        tvVar3.setText(getResources().getString(R.string.txt_ConfTel)+var3);
        tvVar4.setText(getResources().getString(R.string.txt_ConfEmail)+var4);
        tvVar5.setText(getResources().getString(R.string.txt_ConfDesc)+var5);



        Button button= (Button) findViewById(R.id.boton_editar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}
