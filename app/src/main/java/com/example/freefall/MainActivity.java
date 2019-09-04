package com.example.freefall;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    MediaPlayer fallSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         *
         * fallSound = MediaPlayer.create(this, R.raw.sound);
         *
         */
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy){

    }

    @Override
    public void onSensorChanged(final SensorEvent sensorEvent){
        synchronized (this){

            double x;
            double y;
            double z;
            double vector;

            if (sensorEvent.sensor.getType() == Sensor.TYPE_ACCELEROMETER){

                x = sensorEvent.values[0];
                y = sensorEvent.values[1];
                z = sensorEvent.values[2];

                vector = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));

                // Play sound if the phone is falling
                if (vector < 2.0){

                    /**
                     *
                     * fallSound.start();
                     *
                     * */
                }
                else {

                    /**
                     *
                     * fallSound.stop();
                     *
                     * */
                }
            }
        }
    }
}
