package com.example.androidjokeslibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AndroidLibActivity extends AppCompatActivity {

    TextView txt_joke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_lib);

        getSupportActionBar().setTitle("AndroidLibrary");

        txt_joke = findViewById(R.id.txt_lib);
        Intent intent = getIntent();
        txt_joke.setText(intent.getStringExtra("get"));


    }
}
