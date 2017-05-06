package com.example.android.chilloutmusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that displays the search results
        SearchView searchView = (SearchView) findViewById(R.id.search_view);
        // Set a click listener on that View
        searchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchResultsIntent = new Intent(MainActivity.this, SearchResultsActivity.class);
                startActivity(searchResultsIntent);
            }
        });

        // Find the View that displays the list of albums
        View albums = findViewById(R.id.albums_list);
        // Set a click listener on that View
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumsListIntent = new Intent(MainActivity.this, AlbumsListActivity.class);
                startActivity(albumsListIntent);
            }
        });

        // Find the View that displays the list of albums ("MORE")
        TextView albumsMore = (TextView) findViewById(R.id.more);
        // Set a click listener on that View
        albumsMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumsListIntent = new Intent(MainActivity.this, AlbumsListActivity.class);
                startActivity(albumsListIntent);
            }
        });

        // Find the View that displays the list of bestselling albums
        TextView bestsellingAlbums = (TextView) findViewById(R.id.bestselling_albums);
        // Set a click listener on that View
        bestsellingAlbums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumsListIntent = new Intent(MainActivity.this, AlbumsListActivity.class);
                startActivity(albumsListIntent);
            }
        });

        // Find the View that displays the list of special offers in albums
        TextView specialOffers = (TextView) findViewById(R.id.special_offers);
        // Set a click listener on that View
        specialOffers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumsListIntent = new Intent(MainActivity.this, AlbumsListActivity.class);
                startActivity(albumsListIntent);
            }
        });

        // Find the View that displays the album 1 info
        ImageView album1Info = (ImageView) findViewById(R.id.album1);
        // Set a click listener on that View
        album1Info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumInfoIntent = new Intent(MainActivity.this, AlbumInfoActivity.class);
                startActivity(albumInfoIntent);
            }
        });

        // Find the View that displays the album 2 info
        ImageView album2Info = (ImageView) findViewById(R.id.album2);
        // Set a click listener on that View
        album2Info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumInfoIntent = new Intent(MainActivity.this, AlbumInfoActivity.class);
                startActivity(albumInfoIntent);
            }
        });

        // Find the View that displays the album 3 info
        ImageView album3Info = (ImageView) findViewById(R.id.album3);
        // Set a click listener on that View
        album3Info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumInfoIntent = new Intent(MainActivity.this, AlbumInfoActivity.class);
                startActivity(albumInfoIntent);
            }
        });

        // Find the View that displays the album 4 info
        ImageView album4Info = (ImageView) findViewById(R.id.album4);
        // Set a click listener on that View
        album4Info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumInfoIntent = new Intent(MainActivity.this, AlbumInfoActivity.class);
                startActivity(albumInfoIntent);
            }
        });

        // Find the View that displays the list of top songs
        View topSongs = findViewById(R.id.top_songs_list);
        // Set a click listener on that View
        topSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent topSongsIntent = new Intent(MainActivity.this, TopSongsActivity.class);
                startActivity(topSongsIntent);
            }
        });

        // Find the View that displays now playing screen for top songs
        View topSong1 = findViewById(R.id.top1_song);
        // Set a click listener on that View
        topSong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        // Find the View that displays now playing screen for top songs
        View topSong2 = findViewById(R.id.top2_song);
        // Set a click listener on that View
        topSong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        // Find the View that displays now playing screen for top songs
        View topSong3 = findViewById(R.id.top3_song);
        // Set a click listener on that View
        topSong3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        // Find the View that displays now playing screen
        View nowPlaying = findViewById(R.id.now_playing);
        // Set a click listener on that View
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

    }
}
