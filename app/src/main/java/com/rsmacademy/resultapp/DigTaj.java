package com.rsmacademy.resultapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class DigTaj extends AppCompatActivity {

    Button btnAdd, btnSub, btnReset;
    TextView tvResult;
    int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager. LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams. FLAG_FULLSCREEN);
        setContentView(R.layout.activity_dig_taj);


        tvResult = findViewById(R.id.tvResult);

        btnAdd = findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                tvResult.setText("" + count);
            }
        });
        //=========================================

        btnSub = findViewById(R.id.btnSub);
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                tvResult.setText("" + count);
            }
        });
        //================================================

        btnReset = findViewById(R.id.btnReset);
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count = 0;
                tvResult.setText("" + count);
            }
        });
    }
}