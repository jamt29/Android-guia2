package com.example.guia2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Activity10 extends AppCompatActivity {

    private EditText et1, et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_10);


        et1 =(EditText)findViewById(R.id.et1);
        et2 =(EditText)findViewById(R.id.et2);

    }


    public void verificar(View v) {
        String clave = et2.getText().toString();
        if (clave.length()==0) {
            Toast notificacion = Toast.makeText(this, "La clave no a sido ingresada", Toast.LENGTH_LONG);
            notificacion.show();
        }
    }
}