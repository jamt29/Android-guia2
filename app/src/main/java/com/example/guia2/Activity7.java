package com.example.guia2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Activity7 extends AppCompatActivity {

    private String[] paises = {"Argentina", "Chile", "Paraguay", "Bolivia", "Peru", "Ecuador", "Brasil", "Colombia", "Venezuela", "Uruguay"};
    private String[] habitantes ={"40000000", "17000000", "6500000", "10000000", "30000000", "14000000", "183000000", "44000000", "29000000", "3500000"};

    private TextView tv1;
    private ListView lv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);

        tv1 = (TextView)findViewById(R.id.textview);
        lv1 = (ListView)findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, paises);
        lv1.setAdapter(adapter);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
                public void onItemClick(AdapterView parent, View view, int position, long id) {
                tv1.setText("Poblacion de " +  lv1.getItemAtPosition(position) + " es " + habitantes[position]);
            }
        });

    }
}