package com.example.price4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;


public class profile extends AppCompatActivity {
            Button mButton;
            TextView mEdit;
            protected TextView mText;

            @Override
            public void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_profile);
                mButton = (Button)findViewById(R.id.button3);



                View.OnClickListener mButtonClickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mEdit = findViewById(R.id.textplain);
                        mText = findViewById(R.id.textView4);
                        mText.setText("Welcome "+mEdit.getText().toString()+"!");

                        System.out.println(mEdit + "success");
                        Intent i = new Intent(profile.this, userprofile2.class);
                        startActivity(i);
                    }
                };
                mButton.setOnClickListener(mButtonClickListener);

            }
}

