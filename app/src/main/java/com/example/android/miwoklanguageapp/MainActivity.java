package com.example.android.miwoklanguageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbers = new Intent(getApplicationContext(), NumbersActivity.class);
                startActivity(numbers);
            }
        });

        TextView family = findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent family = new Intent(getApplicationContext(), FamilyActivity.class);
                startActivity(family);
            }
        });

        TextView colors = findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colors = new Intent(getApplicationContext(), ColorsActivity.class);
                startActivity(colors);
            }
        });

        TextView phrases = findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phrases = new Intent(getApplicationContext(), PhrasesActivity.class);
                startActivity(phrases);
            }
        });

    }

}