package com.example.guia2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {
    private EditText et1, et2;
    private TextView tv3;
    private RadioButton r1, r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);

        tv3 = (TextView)findViewById(R.id.tv3);

        r1 = (RadioButton)findViewById(R.id.r1);
        r2 = (RadioButton)findViewById(R.id.r2);
    }

    public void operar(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int nro1 = Integer.parseInt(valor1);
        int nro2 = Integer.parseInt(valor2);
        if (r1.isChecked()==true) {
            int suma = nro1 + nro2;
            String resu = String.valueOf(suma);
            tv3.setText(resu);
        } else {
            if (r2.isChecked()==true) {
                int resta = nro1 - nro2;
                String resu = String.valueOf(resta);
                tv3.setText(resu);
            }
        }
    }
}