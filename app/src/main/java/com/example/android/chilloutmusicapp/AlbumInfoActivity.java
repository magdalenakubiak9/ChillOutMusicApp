package com.example.android.chilloutmusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class AlbumInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_info);

        // Find the Button that displays the home page
        View homePage = findViewById(R.id.button_home);
        // Set a click listener on that View
        homePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homePageIntent = new Intent(AlbumInfoActivity.this, MainActivity.class);
                startActivity(homePageIntent);
            }
        });

        // Find the Button that displays the list of all albums
        View albumsList = findViewById(R.id.button_albums_list);
        // Set a click listener on that View
        albumsList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homePageIntent = new Intent(AlbumInfoActivity.this, AlbumsListActivity.class);
                startActivity(homePageIntent);
            }
        });
    }
}
