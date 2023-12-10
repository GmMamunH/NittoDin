package com.rsmacademy.resultapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class OpenPage extends AppCompatActivity {

    Button resultSheet, checkVC, bmiCal, digitalTaj;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager. LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams. FLAG_FULLSCREEN);
        setContentView(R.layout.activity_open_page);


        resultSheet = findViewById(R.id.resultS);
        resultSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OpenPage.this, MainActivity.class);
                startActivity(intent);
            }
        });
        //=============================================================================

        checkVC = findViewById(R.id.vac);
        checkVC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OpenPage.this, CheckVC.class);
                startActivity(intent);
            }
        });
        //========================================================================

        bmiCal = findViewById(R.id.bmiCal);
        bmiCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OpenPage.this, BMI_Cal.class);
                startActivity(intent);
            }
        });
        //===============================================================================

        digitalTaj = findViewById(R.id.digitalTaj);
        digitalTaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OpenPage.this, DigTaj.class);
                startActivity(intent);
            }
        });
    }
}