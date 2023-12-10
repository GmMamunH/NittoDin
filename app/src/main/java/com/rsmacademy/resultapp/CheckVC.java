package com.rsmacademy.resultapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CheckVC extends AppCompatActivity {

    EditText put_result;
    Button result_btn;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager. LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams. FLAG_FULLSCREEN);
        setContentView(R.layout.activity_check_vc);


        put_result =findViewById(R.id.Put_result);
        result_btn = findViewById(R.id.result_btn);
        tvResult = findViewById(R.id.tvResult);

        result_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkVowelConsonant();
            }
        });
    }

    private void checkVowelConsonant() {
        String input = put_result.getText().toString().toLowerCase();

        if (input.length() == 1) {
            char ch = input.charAt(0);

            if ((ch >= 'a' && ch <= 'z')) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    tvResult.setText(ch + " is a Vowel.");
                } else {
                    tvResult.setText(ch + " is a Consonant.");
                }
            } else {
                tvResult.setText("Please enter a valid alphabet.");
            }
        } else {
            tvResult.setText("Please enter only one alphabet.");
        }
    }
}