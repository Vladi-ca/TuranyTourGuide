package com.example.android.turanytourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the view that shows the museum category
        ImageView sports = (ImageView) findViewById(R.id.sports);
        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sportsIntent = new Intent(MainActivity.this, SportsActivity.class);
                startActivity(sportsIntent);
            }
        });

        ImageView museum = (ImageView) findViewById(R.id.museum);
        museum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent museumIntent = new Intent(MainActivity.this, MuseumActivity.class);
                startActivity(museumIntent);
            }
        });

        ImageView events = (ImageView) findViewById(R.id.events);
        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent eventsIntent = new Intent(MainActivity.this, EventsActivity.class);
                startActivity(eventsIntent);
            }
        });

        ImageView restaurants = (ImageView) findViewById(R.id.restaurants);
        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(restaurantsIntent);
            }
        });

    }
}
