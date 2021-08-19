package com.example.guia2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity8 extends AppCompatActivity {
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8);

        tv1 = (TextView) findViewById(R.id.tv1);

    }

    public void llamar(View view) {
        tv1.setText("Llamando");
    }
}