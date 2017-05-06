package com.example.android.chilloutmusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TopSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_songs);

        // Find the View that plays the top 1 song in the now playing screen
        View top1Song = findViewById(R.id.top1_song);
        // Set a click listener on that View
        top1Song.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumInfoIntent = new Intent(TopSongsActivity.this, NowPlayingActivity.class);
                startActivity(albumInfoIntent);
            }
        });

        // Find the Button that displays the home page
        View homePage = findViewById(R.id.button_home);
        // Set a click listener on that View
        homePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homePageIntent = new Intent(TopSongsActivity.this, MainActivity.class);
                startActivity(homePageIntent);
                finish();
            }
        });
    }
}
