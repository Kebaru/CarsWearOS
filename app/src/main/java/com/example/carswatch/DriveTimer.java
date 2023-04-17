package com.example.carswatch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

import com.example.carswatch.databinding.ActivityDriveTimerBinding;

public class DriveTimer extends Activity {

    private ActivityDriveTimerBinding binding;
Button Stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDriveTimerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Stop = findViewById(R.id.Stop);

        Chronometer simpleChronometer = (Chronometer) findViewById(R.id.simpleChronometer);

        simpleChronometer.start();

        Stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DriveTimer.this, MainActivity.class));
            }
        });
    }
}