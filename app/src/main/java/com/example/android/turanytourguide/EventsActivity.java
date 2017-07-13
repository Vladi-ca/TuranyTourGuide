package com.example.android.turanytourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.the_list);

        // Create a list of items in museum
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(getString(R.string.events_one), getString(R.string.events_one_d), getString(R.string.stars_four)));
        items.add(new Item(getString(R.string.events_two), getString(R.string.events_two_d), getString(R.string.stars_three)));
        items.add(new Item(getString(R.string.events_three), getString(R.string.events_three_d), getString(R.string.stars_four)));
        items.add(new Item(getString(R.string.events_four), getString(R.string.events_four_d), getString(R.string.stars_four)));
        items.add(new Item(getString(R.string.events_five), getString(R.string.events_every_year), getString(R.string.stars_three)));
        items.add(new Item(getString(R.string.events_six), getString(R.string.events_every_year), getString(R.string.stars_four)));
        items.add(new Item(getString(R.string.events_seven), getString(R.string.events_every_year), getString(R.string.stars_four)));
        items.add(new Item(getString(R.string.events_eight), getString(R.string.events_every_year), getString(R.string.stars_four)));
        ItemAdapter adapter = new ItemAdapter(this, items);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
