package com.example.workout_plan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button absBeginner;
    private Button chestBeginner;
    private Button armsBeginner;
    private Button legsBeginner;
    private Button backBeginner;
    private Button absIntermediate;
    private Button chestIntermediate;
    private Button armsIntermediate;
    private Button legsIntermediate;
    private Button backIntermediate;
    private Button absAdvanced;
    private Button chestAdvanced;
    private Button armsAdvanced;
    private Button legsAdvanced;
    private Button backAdvanced;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


        absBeginner = findViewById(R.id.absBeginner);
        absBeginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BeginnerAbs.class);
                startActivity(intent);
            }
        });

        chestBeginner = findViewById(R.id.chestBeginner);
        chestBeginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BeginnerChest.class);
                startActivity(intent);
            }
        });

        armsBeginner = findViewById(R.id.armsBeginner);
        armsBeginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BeginnerArms.class);
                startActivity(intent);
            }
        });

        legsBeginner = findViewById(R.id.legsBeginner);
        legsBeginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BeginnerLegs.class);
                startActivity(intent);
            }
        });

        backBeginner = findViewById(R.id.backBeginner);
        backBeginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BeginnerBack.class);
                startActivity(intent);
            }
        });


    }
}