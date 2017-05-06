package com.example.android.chilloutmusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class AlbumsListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums_list);

        // Find the View that displays the album 1 details on the list
        View album1List = findViewById(R.id.album1_list);
        // Set a click listener on that View
        album1List.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumInfoIntent = new Intent(AlbumsListActivity.this, AlbumInfoActivity.class);
                startActivity(albumInfoIntent);
            }
        });

        // Find the Button that displays the home page
        View homePage = findViewById(R.id.button_home);
        // Set a click listener on that View
        homePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homePageIntent = new Intent(AlbumsListActivity.this, MainActivity.class);
                startActivity(homePageIntent);
            }
        });
    }
}
