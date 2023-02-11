package com.example.workout_plan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BeginnerAbs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner_abs);
        getSupportActionBar().hide();
    }
}