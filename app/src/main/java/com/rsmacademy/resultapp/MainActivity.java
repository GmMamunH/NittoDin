package com.rsmacademy.resultapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText put_result;
    Button result_btn;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager. LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams. FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);


        put_result =findViewById(R.id.Put_result);
        result_btn = findViewById(R.id.result_btn);
        tvResult = findViewById(R.id.tvResult);

        result_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myString = put_result.getText().toString();
                int grade = Integer.parseInt(myString);

                if (grade <= 100 && grade >= 80) {
                    tvResult.setText("Your result is \"A+\"\n মিষ্টি খাওয়াবেন নাকি খাবেন?");
                } else if (grade < 80 && grade >= 70) {
                    tvResult.setText("Your result is \"A\"\n আর একটু কষ্ট করতে হতো।");
                } else if (grade < 70 && grade >= 60) {
                    tvResult.setText("Your result is \"A-\"\n আর আফসোস করে কি হবে।");

                } else if (grade < 60 && grade >= 50) {
                    tvResult.setText("Your result is \"B\"\n পড়ার থেকে আড্ডার পরিমান বেশি ছিল।");

                } else if (grade < 50 && grade >= 40) {
                    tvResult.setText("Your result is \"C\"\n আড্ডার পরিমান বেশি ছিল।");

                } else if (grade < 40 && grade >= 33) {
                    tvResult.setText("Your result is \"D\"\n ফাঁকির পরিমান বেশি ছিল।");
                } else if(grade < 33 && grade >= 0){
                    tvResult.setText("Your result is \"F\"\n বাবা তোমার কর্মের ফল। আর এক বার চেষ্টা কর।");

                }else {
                    tvResult.setText("your number is wrong");
                }
            }
        });
    }
}