package com.example.price4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {


    Button accButton;
    Button logButton;
    TextView main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        accButton = findViewById(R.id.button);
        logButton = findViewById(R.id.button2);

        View.OnClickListener logButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Home.class);
                startActivity(i);

            }
        };

        View.OnClickListener accButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, profile.class);
                startActivity(i);

            }
        };

        accButton.setOnClickListener(accButtonClickListener);
        logButton.setOnClickListener(logButtonClickListener);
    }


}

