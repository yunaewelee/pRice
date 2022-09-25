package com.example.price4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Like extends AppCompatActivity {

    ImageButton homeButton;
    ImageButton chatButton;
    ImageButton likeButton;
    ImageButton profButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_like);
        homeButton = findViewById(R.id.imageButton13);
        chatButton = findViewById(R.id.imageButton15);
        likeButton = findViewById(R.id.imageButton16);
        profButton = findViewById(R.id.imageButton14);


        View.OnClickListener homeButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Like.this, Home.class);
                startActivity(i);

            }
        };
        View.OnClickListener chatButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Like.this, Chat.class);
                startActivity(i);

            }
        };
        View.OnClickListener likeButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Like.this, Like.class);
                startActivity(i);

            }
        };
        View.OnClickListener profButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Like.this, userprofile2.class);
                startActivity(i);

            }
        };

        homeButton.setOnClickListener(homeButtonClickListener);
        chatButton.setOnClickListener(chatButtonClickListener);
        likeButton.setOnClickListener(likeButtonClickListener);
        profButton.setOnClickListener(profButtonClickListener);
    }
}