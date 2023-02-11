package com.example.workout_plan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BeginnerBack extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner_back);
        getSupportActionBar().hide();
    }
}