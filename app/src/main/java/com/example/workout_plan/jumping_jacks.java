package com.example.workout_plan;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class jumping_jacks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jumping_jacks);
        getSupportActionBar().hide();


    }


    public void abdominal_crunches_page(View v){
        Intent intent=new Intent(jumping_jacks.this,abdominal_crunches.class);
        startActivity(intent);
    }
}