package com.example.claserodrigo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnLista,btnAcel,btnGiro,btnLuz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLista=(Button) findViewById(R.id.btnListar);
        btnAcel=(Button) findViewById(R.id.btnAcelerometro);
        btnGiro=(Button) findViewById(R.id.btnGiroscopio);
        btnLuz=(Button) findViewById(R.id.btnLuz);


        btnLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getApplicationContext(),ListaSensores.class);
                startActivity(i);

            }
        });

        btnGiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getApplicationContext(),SensorGiro.class);
                startActivity(i);
            }
        });

        btnAcel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getApplicationContext(),SensoAcelerometro.class);
                startActivity(i);
            }
        });


        btnLuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getApplicationContext(),SensorLuz.class);
                startActivity(i);
            }
        });
    }


}