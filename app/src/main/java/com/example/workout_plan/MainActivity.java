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

        absIntermediate = findViewById(R.id.absIntermediate);
        absIntermediate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, IntermediateAbs.class);
                startActivity(intent);
            }
        });

        chestIntermediate = findViewById(R.id.chestIntermediate);
        chestIntermediate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, IntermediateChest.class);
                startActivity(intent);
            }
        });

        armsIntermediate = findViewById(R.id.armsIntermediate);
        armsIntermediate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, IntermediateArms.class);
                startActivity(intent);
            }
        });

        legsIntermediate = findViewById(R.id.legsIntermediate);
        legsIntermediate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, IntermediateLegs.class);
                startActivity(intent);
            }
        });

        backIntermediate = findViewById(R.id.backIntermediate);
        backIntermediate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, IntermediateBack.class);
                startActivity(intent);
            }
        });

        absAdvanced = findViewById(R.id.absAdvanced);
        absAdvanced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AdvancedAbs.class);
                startActivity(intent);
            }
        });

        chestAdvanced = findViewById(R.id.chestAdvanced);
        chestAdvanced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AdvancedChest.class);
                startActivity(intent);
            }
        });

        armsAdvanced = findViewById(R.id.armsAdvanced);
        armsAdvanced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AdvancedArms.class);
                startActivity(intent);
            }
        });

        legsAdvanced = findViewById(R.id.legsAdvanced);
        legsAdvanced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AdvancedLegs.class);
                startActivity(intent);
            }
        });

        backAdvanced = findViewById(R.id.backAdvanced);
        backAdvanced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AdvancedBack.class);
                startActivity(intent);
            }
        });


    }

    public void abs1(View v) {
        Intent intent = new Intent(MainActivity.this, BeginnerAbs.class);
        startActivity(intent);
    }
}