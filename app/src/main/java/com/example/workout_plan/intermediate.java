package com.example.workout_plan;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class intermediate extends AppCompatActivity {

    private Button absIntermediate;
    private Button chestIntermediate;
    private Button armsIntermediate;
    private Button legsIntermediate;
    private Button backIntermediate;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate);
        getSupportActionBar().hide();


        absIntermediate = findViewById(R.id.absIntermediate);
        absIntermediate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(intermediate.this, IntermediateAbs.class);
                startActivity(intent);
            }
        });

        chestIntermediate = findViewById(R.id.chestIntermediate);
        chestIntermediate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(intermediate.this, IntermediateChest.class);
                startActivity(intent);
            }
        });

        armsIntermediate = findViewById(R.id.armsIntermediate);
        armsIntermediate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(intermediate.this, IntermediateArms.class);
                startActivity(intent);
            }
        });

        legsIntermediate = findViewById(R.id.legsIntermediate);
        legsIntermediate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(intermediate.this, IntermediateLegs.class);
                startActivity(intent);
            }
        });

        backIntermediate = findViewById(R.id.backIntermediate);
        backIntermediate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(intermediate.this, IntermediateBack.class);
                startActivity(intent);
            }
        });

    }
}