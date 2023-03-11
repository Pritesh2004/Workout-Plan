package com.example.workout_plan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class IntermediateBack extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate_back);
        getSupportActionBar().hide();
    }
}