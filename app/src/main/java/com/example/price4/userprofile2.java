package com.example.price4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class userprofile2 extends AppCompatActivity {

    ImageButton homeButton;
    ImageButton chatButton;
    ImageButton likeButton;
    Button wishButton;
    Button outButton;
    ImageButton profButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userprofile2);
        homeButton = findViewById(R.id.imageButton3);
        chatButton = findViewById(R.id.imageButton4);
        likeButton = findViewById(R.id.imageButton7);
        profButton = findViewById(R.id.imageButton8);
        wishButton = findViewById(R.id.button16);
        outButton = findViewById(R.id.button9);




        View.OnClickListener homeButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(userprofile2.this, Home.class);
                startActivity(i);

            }
        };
        View.OnClickListener chatButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(userprofile2.this, Chat.class);
                startActivity(i);

            }
        };
        View.OnClickListener likeButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(userprofile2.this, Like.class);
                startActivity(i);

            }
        };
        View.OnClickListener profButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(userprofile2.this, userprofile2.class);
                startActivity(i);

            }
        };

        View.OnClickListener wishButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(userprofile2.this, Like.class);
                startActivity(i);

            }
        };
        View.OnClickListener outButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(userprofile2.this, MainActivity.class);
                startActivity(i);

            }
        };

        homeButton.setOnClickListener(homeButtonClickListener);
        chatButton.setOnClickListener(chatButtonClickListener);
        likeButton.setOnClickListener(likeButtonClickListener);
        profButton.setOnClickListener(profButtonClickListener);
        wishButton.setOnClickListener(wishButtonClickListener);
        outButton.setOnClickListener(outButtonClickListener);
    }
}
