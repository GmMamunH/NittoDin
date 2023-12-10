package com.rsmacademy.resultapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMI_Cal extends AppCompatActivity {

    EditText edKg, edFeet, edInch;
    Button calBtn;
    TextView bmi;

    Animation zoom_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bmi_cal);


        edKg = findViewById(R.id.edKg);
        edFeet = findViewById(R.id.edFeet);
        edInch = findViewById(R.id.edInch);
        calBtn = findViewById(R.id.calBtn);
        bmi = findViewById(R.id.bmiCal);

        zoom_in = AnimationUtils.loadAnimation(this, R.anim.zoom_in);
        calBtn.setAnimation(zoom_in);

        calBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sKg = edKg.getText().toString();
                String sFeet = edFeet.getText().toString();
                String sInch = edInch.getText().toString();

                float kg = Float.parseFloat(sKg);
                float feet = Float.parseFloat(sFeet);
                float inch = Float.parseFloat(sInch);

                float height = (float) (feet * 0.3048 + inch * 0.0254);
                float bmiIndex = kg / (height * height);

                if (bmiIndex > 30) {
                    bmi.setText("Your BIM Index is " + bmiIndex + "\n না খেয়ে কেউ মরেনা। তাই তোমার কম খেতে হবে। ");

                } else if (bmiIndex > 24) {
                    bmi.setText("Your BIM Index is " + bmiIndex + "\n খাওয়া নিয়ন্ত্রণ করতে হবে। ");

                } else if (bmiIndex > 18) {
                    bmi.setText("Your BIM Index is " + bmiIndex + "\n যেভাবে আছো ভালো আছো। ");

                } else {
                    bmi.setText("Your BIM Index is " + bmiIndex + "\n তোমাকে কি কেউ খেতে দেয়না? ");
                }

            }

        });
    }
}