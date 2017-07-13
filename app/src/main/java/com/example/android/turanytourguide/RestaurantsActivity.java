package com.example.android.turanytourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.the_list);

        // Create a list of items in museum
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(getString(R.string.restaurant_one), getString(R.string.restaurant_one_description), getString(R.string.stars_four)));
        items.add(new Item(getString(R.string.restaurant_two), getString(R.string.restaurant_two_description), getString(R.string.stars_four)));
        items.add(new Item(getString(R.string.restaurant_three), getString(R.string.restaurant_three_description), getString(R.string.stars_three)));
        items.add(new Item(getString(R.string.restaurant_four), getString(R.string.restaurant_four_description), getString(R.string.stars_three)));
        ItemAdapter adapter = new ItemAdapter(this, items);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
