package com.example.workout_plan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class advanced extends AppCompatActivity {

    private Button absAdvanced;
    private Button chestAdvanced;
    private Button armsAdvanced;
    private Button legsAdvanced;
    private Button backAdvanced;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced);
        getSupportActionBar().hide();



        absAdvanced = findViewById(R.id.absAdvanced);
        absAdvanced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(advanced.this, AdvancedAbs.class);
                startActivity(intent);
            }
        });

        chestAdvanced = findViewById(R.id.chestAdvanced);
        chestAdvanced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(advanced.this, AdvancedChest.class);
                startActivity(intent);
            }
        });

        armsAdvanced = findViewById(R.id.armsAdvanced);
        armsAdvanced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(advanced.this, AdvancedArms.class);
                startActivity(intent);
            }
        });

        legsAdvanced = findViewById(R.id.legsAdvanced);
        legsAdvanced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(advanced.this, AdvancedLegs.class);
                startActivity(intent);
            }
        });

        backAdvanced = findViewById(R.id.backAdvanced);
        backAdvanced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(advanced.this, AdvancedBack.class);
                startActivity(intent);
            }
        });


    }
}