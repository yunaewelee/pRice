package com.example.price4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Home extends AppCompatActivity {

    ImageButton homeButton;
    ImageButton chatButton;
    ImageButton likeButton;
    ImageButton profButton;
    ImageButton itemButton;
    Button searchButton;
    Button uploadButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        homeButton = findViewById(R.id.imageButton);
        chatButton = findViewById(R.id.imageButton5);
        likeButton = findViewById(R.id.imageButton6);
        profButton = findViewById(R.id.imageButton2);
        itemButton = findViewById(R.id.imageButton19);
        searchButton = findViewById(R.id.button4);
        uploadButton = findViewById(R.id.button10);

        View.OnClickListener homeButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Home.this, Home.class);
                startActivity(i);

            }
        };
        View.OnClickListener chatButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Home.this, Chat.class);
                startActivity(i);

            }
        };
        View.OnClickListener likeButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Home.this, Like.class);
                startActivity(i);

            }
        };
        View.OnClickListener profButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Home.this, userprofile2.class);
                startActivity(i);

            }

        };
        View.OnClickListener itemButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Home.this, itemdescription.class);
                startActivity(i);

            }
        };
        View.OnClickListener searchButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Home.this, Search.class);
                startActivity(i);

            }
        };
        View.OnClickListener uploadButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Home.this, UploadThings.class);
                startActivity(i);

            }
        };
        homeButton.setOnClickListener(homeButtonClickListener);
        chatButton.setOnClickListener(chatButtonClickListener);
        likeButton.setOnClickListener(likeButtonClickListener);
        profButton.setOnClickListener(profButtonClickListener);
        itemButton.setOnClickListener(itemButtonClickListener);
        searchButton.setOnClickListener(searchButtonClickListener);
        uploadButton.setOnClickListener(uploadButtonClickListener);

}}