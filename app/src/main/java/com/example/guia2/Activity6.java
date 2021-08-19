package com.example.guia2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Activity6 extends AppCompatActivity {

    private Spinner spinner1;
    private EditText et1, et2;
    private TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);

        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
        tv3 = (TextView) findViewById(R.id.tv3);

        spinner1 = (Spinner)findViewById(R.id.spinner);
        String []opciones = {"sumar","restar","multiplicar","dividir"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        spinner1.setAdapter(adapter);
    }

    public void operar(View view) {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        int nro1 = Integer.parseInt(valor1);
        int nro2 = Integer.parseInt(valor2);

        String selec = spinner1.getSelectedItem().toString();
        if (selec.equals("sumar")) {
            int suma = nro1 + nro2;
            String resu = String.valueOf(suma);
            tv3.setText(resu);
        } else
            if (selec.equals("restar")) {
                int resta = nro1 - nro2;
                String resu = String.valueOf(resta);
                tv3.setText(resu);
            } else
            if (selec.equals("multiplicar")) {
                int multiplicar = nro1 * nro2;
                String resu = String.valueOf(multiplicar);
                tv3.setText(resu);
            } else
            if (selec.equals("dividir")) {
                int div = nro1 / nro2;
                String resu = String.valueOf(div);
                tv3.setText(resu);
            }
    }

}