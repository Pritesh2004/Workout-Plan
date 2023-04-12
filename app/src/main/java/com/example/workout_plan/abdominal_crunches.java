package com.example.workout_plan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class abdominal_crunches extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abdominal_crunches);
        getSupportActionBar().hide();


    }


    public void jumping_jacks(View v){

        Intent intent=new Intent(abdominal_crunches.this,jumping_jacks.class);
        startActivity(intent);
    }
}