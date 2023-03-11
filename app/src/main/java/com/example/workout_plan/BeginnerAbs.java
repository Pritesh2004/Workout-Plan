package com.example.workout_plan;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BeginnerAbs extends AppCompatActivity {

     Button startAbsBeginner;
Dialog mDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner_abs);
        getSupportActionBar().hide();

        startAbsBeginner=findViewById(R.id.startAbsBeginner);
        startAbsBeginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BeginnerAbs.this,jumping_jacks.class);
                startActivity(intent);
            }
        });



        mDialog=new Dialog(BeginnerAbs.this);
    }

    public void jumping_jacks(View v){
        mDialog.setContentView(R.layout.activity_popup_jumping_jacks);

        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.show();
    }

    public void abdominal_crunches(View v){
        mDialog.setContentView(R.layout.activity_popup_abdominal_crunches);

        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.show();
    }
    public void russian_twist(View v){
        mDialog.setContentView(R.layout.activity_popup_russian_twist);

        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.show();
    }

    public void heel_touches(View v){
        mDialog.setContentView(R.layout.activity_popup_heel_touch);

        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.show();
    }

    public void mountain_climber(View v){
        mDialog.setContentView(R.layout.activity_popup_mountain_climber);

        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.show();
    }

    public void leg_raises(View v){
        mDialog.setContentView(R.layout.activity_popup_leg_raises);

        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.show();
    }

    public void plank(View v){
        mDialog.setContentView(R.layout.activity_popup_plank);

        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.show();
    }


}