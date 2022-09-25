package com.example.price4;

import java.io.*;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Spinner;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.net.Uri;


public class UploadThings extends AppCompatActivity {

    Spinner mySpinner;
    Button myButton;
    TextView myText;
    ImageView myImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_things);

        Button submitButton = findViewById(R.id.submitButton);
        Spinner categorydropdown = findViewById(R.id.categoryDropdown);
        Button uploadButton = findViewById(R.id.imageUploadButton);
        TextView inputTitle = findViewById(R.id.inputTitle);
        TextView inputDescription = findViewById(R.id.inputDescription);
        TextView imageURL = findViewById(R.id.imageURL);

        ArrayAdapter<CharSequence>adapter = ArrayAdapter.createFromResource(this, R.array.categories, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        categorydropdown.setAdapter(adapter);

        uploadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent photoPickerIntent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(photoPickerIntent, 3);
            }
        });

        // SUBMIT BUTTON
        submitButton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UploadThings.this, ProductUploaded.class);
                Bundle bundle = new Bundle();
                String title = inputTitle.getText().toString();
                Log.i("title", title);

                String description = inputDescription.getText().toString();
                Log.i("desc", description);

                String imageuri = imageURL.getText().toString();
                Log.i("imageuri", imageuri);

                String category = categorydropdown.getSelectedItem().toString();

                i.putExtra("title", title);
                i.putExtra("description", description);
                i.putExtra("imageuri", imageuri);
                i.putExtra("category", category);
//                bundle.putString("image", imageurl);
//                i.putExtras(bundle);
//                Log.i("logg title", i.getStringExtra("title"));
                startActivity(i);
            }
        }));
    }

    @Override
    protected void onActivityResult(int reqCode, int resultCode, Intent data) {
        super.onActivityResult(reqCode, resultCode, data);
//        setContentView(R.layout.activity_upload_things);
        if (resultCode == RESULT_OK && data != null) {
            TextView imageURL = findViewById(R.id.imageURL);
            Uri selectedImage = data.getData();
            Log.i("data", String.valueOf(selectedImage));
            imageURL.setText(selectedImage.toString());
            ImageView uploadImage = findViewById(R.id.uploadImage);
            uploadImage.setImageURI(selectedImage);
        }

    }

}