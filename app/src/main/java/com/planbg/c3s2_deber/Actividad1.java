package com.planbg.c3s2_deber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Calendar;

import java.util.Calendar;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

public class Actividad1 extends AppCompatActivity {

    private TextView tvDisplayDate;
    private DatePicker dpResult;
    private Button btnChangeDate;

    private int year;
    private int month;
    private int day;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);

        Button button= (Button) findViewById(R.id.boton_siguiente);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //DoIt(v);
                EditText et = (EditText) findViewById(R.id.edit_nombre);
                String textoEditNombre = et.getText().toString();
                EditText etTel = (EditText) findViewById(R.id.edit_telefono);
                String textoTelefono = etTel.getText().toString();
                EditText etEmail = (EditText) findViewById(R.id.edit_email);
                String textoEmail = etEmail.getText().toString();
                EditText etDesc = (EditText) findViewById(R.id.edit_descrip);
                String textoDesc = etDesc.getText().toString();

                DatePicker datePicker = (DatePicker) findViewById(R.id.dpResult);
                int day = datePicker.getDayOfMonth();
                int month = datePicker.getMonth()+1;
                int year = datePicker.getYear();
                String textFechaNacimiento = " " + String.valueOf(day) + "/" + String.valueOf(month) + "/"+String.valueOf(year);

                Intent intent = new Intent(Actividad1.this, Actividad2.class);
                intent.putExtra(getResources().getString(R.string.pNombre), textoEditNombre);
                intent.putExtra(getResources().getString(R.string.pFecha), textFechaNacimiento);
                intent.putExtra(getResources().getString(R.string.pTelefono), textoTelefono);
                intent.putExtra(getResources().getString(R.string.pEmail), textoEmail);
                intent.putExtra(getResources().getString(R.string.pDescrip), textoDesc);


                startActivity(intent);
            }
        });

    } // Fin on create

}// fin aclass actividad 1


