package com.example.price4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Button;
import android.os.Bundle;

import android.os.Bundle;

public class ProductUploaded extends AppCompatActivity {

    TextView myText;
    ImageView myImageView;
    Button myButton;

    // Extract Data from Bundle
//    Bundle bundle = getIntent().getExtras();

//    String image = bundle.getString("image");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_uploaded);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String description = intent.getStringExtra("description");
        String image = intent.getStringExtra("imageuri");
        String category = intent.getStringExtra("category");

        TextView settitle = findViewById(R.id.uploadedTitle);
        TextView setdescription = findViewById(R.id.uploadedDescription);
        ImageView setimage = findViewById(R.id.uploadedImage);
        TextView setcategory = findViewById(R.id.categoryView);

        settitle.setText(title);
        setdescription.setText(description);
        setimage.setImageURI(Uri.parse(image));
        setcategory.setText(category);

        Button goBackHome = findViewById(R.id.goBackHomeButton);

         //Go Back to Home Page

        goBackHome.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ProductUploaded.this, userprofile2.class);
                startActivity(i);
            }
        }));

    }
}