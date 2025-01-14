package com.example.claserodrigo2;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import java.util.List;

public class ListaSensores extends AppCompatActivity {

    SensorManager sm;
    TextView txtListar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sensores);
        txtListar=(TextView) findViewById(R.id.txtListarSensores);

        sm=(SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> lista=sm.getSensorList(Sensor.TYPE_ALL);

        txtListar.setText("Numero de sensores: "+lista.size());
        for(int i=0; i<lista.size(); i++) {
            Sensor sensor = lista.get(i);
            int tipo = sensor.getType();
            txtListar.append(" \ntipo : " + tipo);
            String nombre = sensor.getName();
            txtListar.append(" \nnombre: " + nombre);
            String fabricante = sensor.getVendor();
            txtListar.append("\nfabricante:" + fabricante);
            float consumo = sensor.getPower();
            txtListar.append("\nconsumo: " + consumo + "mAh");
            float resolucion = sensor.getResolution();
            txtListar.append("\nresolucion: " + resolucion);
        }

        txtListar.setMovementMethod(new ScrollingMovementMethod());


    }
}