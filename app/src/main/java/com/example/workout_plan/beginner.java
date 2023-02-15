package com.example.workout_plan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class beginner extends AppCompatActivity {

    private Button absBeginner;

    private Button chestBeginner;
    private Button armsBeginner;
    private Button legsBeginner;
    private Button backBeginner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner);
        getSupportActionBar().hide();



        absBeginner = findViewById(R.id.absBeginner);
        absBeginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(beginner.this, BeginnerAbs.class);
                startActivity(intent);
            }
        });

        chestBeginner = findViewById(R.id.chestBeginner);
        chestBeginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(beginner.this, BeginnerChest.class);
                startActivity(intent);
            }
        });

        armsBeginner = findViewById(R.id.armsBeginner);
        armsBeginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(beginner.this, BeginnerArms.class);
                startActivity(intent);
            }
        });

        legsBeginner = findViewById(R.id.legsBeginner);
        legsBeginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(beginner.this, BeginnerLegs.class);
                startActivity(intent);
            }
        });

        backBeginner = findViewById(R.id.backBeginner);
        backBeginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(beginner.this, BeginnerBack.class);
                startActivity(intent);
            }
        });

    }
}