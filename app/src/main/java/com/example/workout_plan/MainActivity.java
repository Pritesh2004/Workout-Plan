package com.example.workout_plan;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Dialog mDialog;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();



    }

    public void beginner(View v) {
        Intent intent = new Intent(MainActivity.this, beginner.class);
        startActivity(intent);
    }
    public void intermediate(View v) {
        Intent intent = new Intent(MainActivity.this, intermediate.class);
        startActivity(intent);
    }
    public void advanced(View v) {
        Intent intent = new Intent(MainActivity.this, advanced.class);
        startActivity(intent);
    }


}