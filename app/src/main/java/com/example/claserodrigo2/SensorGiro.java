package com.example.claserodrigo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

public class SensorGiro extends AppCompatActivity {
    TextView txtX,txtY,txtZ;
    SensorManager sm;

    Sensor giro;

    SensorEventListener sel;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_giro);
        txtX =(TextView) findViewById(R.id.txtGiroX);
        txtY=(TextView) findViewById(R.id.txtGiroY);
        txtZ=(TextView) findViewById(R.id.txtGiroZ);

        sm=(SensorManager) getSystemService(Context.SENSOR_SERVICE);
        giro=sm.getDefaultSensor(Sensor.TYPE_GYROSCOPE);

        sel= new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent sensorEvent) {
                float x= sensorEvent.values[0];
                float y= sensorEvent.values[1];
                float z= sensorEvent.values[2];
                txtX.setText(""+x);
                txtY.setText(String.valueOf(y));
                txtZ.setText(String.valueOf(z));

            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int i) {

            }
        };
        sm.registerListener(sel,giro,SensorManager.SENSOR_DELAY_UI);

    }

}