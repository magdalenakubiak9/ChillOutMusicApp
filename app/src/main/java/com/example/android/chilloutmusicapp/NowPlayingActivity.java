package com.example.android.chilloutmusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        // Find the Button that displays the list of all albums
        View albumsList = findViewById(R.id.button_albums_list);
        // Set a click listener on that View
        albumsList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homePageIntent = new Intent(NowPlayingActivity.this, AlbumsListActivity.class);
                startActivity(homePageIntent);
                finish();
            }
        });

        // Find the Button that displays the top 30 songs list
        View topSongs = findViewById(R.id.button_top_songs_list);
        // Set a click listener on that View
        topSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homePageIntent = new Intent(NowPlayingActivity.this, TopSongsActivity.class);
                startActivity(homePageIntent);
                finish();
            }
        });
    }
}
