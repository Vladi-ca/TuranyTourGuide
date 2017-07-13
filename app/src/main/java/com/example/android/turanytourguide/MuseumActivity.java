package com.example.android.turanytourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.the_list);

        // Create a list of items in museum
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(getString(R.string.museum_one), getString(R.string.museum_one_d), getString(R.string.stars_five), R.drawable.the_night_in_museum_three));
        items.add(new Item(getString(R.string.museum_two), getString(R.string.museum_two_d), getString(R.string.stars_five), R.drawable.snp));
        items.add(new Item(getString(R.string.museum_three), getString(R.string.museum_three_d), getString(R.string.stars_five), R.drawable.the_night_in_museum_two));
        items.add(new Item(getString(R.string.museum_four), getString(R.string.museum_four_d), getString(R.string.stars_five), R.drawable.the_night_in_museum_one));
        items.add(new Item(getString(R.string.museum_five), getString(R.string.museum_five_d), getString(R.string.stars_four), R.drawable.nature));
        ItemAdapter adapter = new ItemAdapter(this, items);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
