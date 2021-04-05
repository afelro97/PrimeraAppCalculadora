package com.example.primeraappcalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondScreenActivity extends AppCompatActivity {

    private Button secondScreenButton1;
    private TextView secondScreenText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        secondScreenButton1 = findViewById(R.id.secondScreenButton1);
        secondScreenText1 = findViewById(R.id.secondScreenText1);

        secondScreenButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}