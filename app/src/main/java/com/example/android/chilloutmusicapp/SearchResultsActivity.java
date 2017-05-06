package com.example.android.chilloutmusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SearchResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_results);

        // Find the Button that displays the home page
        View homePage = findViewById(R.id.button_home);
        // Set a click listener on that View
        homePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homePageIntent = new Intent(SearchResultsActivity.this, MainActivity.class);
                startActivity(homePageIntent);
            }
        });
    }
}
