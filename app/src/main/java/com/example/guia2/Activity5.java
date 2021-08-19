package com.example.guia2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity5 extends AppCompatActivity {
    private EditText et1, et2;
    private TextView tv3;
    private CheckBox checkbox1, checkbox2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        et1 = (EditText)findViewById(R.id.et01);
        et2 = (EditText)findViewById(R.id.et02);

        tv3 = (TextView) findViewById(R.id.tv03);

        checkbox1 = (CheckBox)findViewById(R.id.cb1);
        checkbox2 = (CheckBox)findViewById(R.id.cb2);
    }

    public void operar(View view) {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        int nro1 = Integer.parseInt(valor1);
        int nro2 = Integer.parseInt(valor2);
        String resu = "";
        if (checkbox1.isChecked()==true) {
            int suma = nro1 + nro2;
            resu = "La Suma es: "+ suma;
        }
        if (checkbox2.isChecked()==true) {
            int resta = nro1 - nro2;
            resu = "La resta es: "+ resta;
        }

      //  Toast.makeText(this, "Qwerty" + resu, Toast.LENGTH_SHORT).show();
        tv3.setText(resu);

    }
}