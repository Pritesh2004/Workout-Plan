package com.example.workout_plan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class popup_plank extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_plank);
        getSupportActionBar().hide();
    }
}