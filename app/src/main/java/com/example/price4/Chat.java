package com.example.price4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Chat extends AppCompatActivity {

    ImageButton homeButton;
    ImageButton chatButton;
    ImageButton likeButton;
    ImageButton profButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        homeButton = findViewById(R.id.imageButton9);
        chatButton = findViewById(R.id.imageButton11);
        likeButton = findViewById(R.id.imageButton12);
        profButton = findViewById(R.id.imageButton10);


        View.OnClickListener homeButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Chat.this, Home.class);
                startActivity(i);

            }
        };
        View.OnClickListener chatButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Chat.this, Chat.class);
                startActivity(i);

            }
        };
        View.OnClickListener likeButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Chat.this, Like.class);
                startActivity(i);

            }
        };
        View.OnClickListener profButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Chat.this, userprofile2.class);
                startActivity(i);

            }
        };

        homeButton.setOnClickListener(homeButtonClickListener);
        chatButton.setOnClickListener(chatButtonClickListener);
        likeButton.setOnClickListener(likeButtonClickListener);
        profButton.setOnClickListener(profButtonClickListener);
    }
}