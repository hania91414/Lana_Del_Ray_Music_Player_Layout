package com.example.hanna.lana_music_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the album4 category
        TextView lustForLife = (TextView) findViewById(R.id.album4);

// Set a click listener on that View
        lustForLife.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent album4Intent = new Intent(MainActivity.this, LustForLifeActivity.class);
                startActivity(album4Intent);
            }
        });

        // Find the View that shows the album3 category
        TextView honeymoon = (TextView) findViewById(R.id.album3);

// Set a click listener on that View
        honeymoon.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent album3Intent = new Intent(MainActivity.this, HoneymoonActivity.class);
                startActivity(album3Intent);
            }
        });

        // Find the View that shows the album2 category
        TextView ultraviolence = (TextView) findViewById(R.id.album2);

// Set a click listener on that View
        ultraviolence.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent album2Intent = new Intent(MainActivity.this, UltraviolenceActivity.class);
                startActivity(album2Intent);
            }
        });

// Find the View that shows the album1 category
        TextView bornToDie = (TextView) findViewById(R.id.album1);

// Set a click listener on that View
        bornToDie.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent album1Intent = new Intent(MainActivity.this, BornToDieActivity.class);
                startActivity(album1Intent);
            }
        });


    }
}
