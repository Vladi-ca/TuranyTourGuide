package com.example.android.turanytourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SportsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.the_list);

        // Create a list of items in museum
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(getString(R.string.sport_one), getString(R.string.sport_one_d), getString(R.string.stars_four)));
        items.add(new Item(getString(R.string.sport_two), getString(R.string.sport_two_d), getString(R.string.stars_four)));
        items.add(new Item(getString(R.string.sport_three), getString(R.string.sport_three_d), getString(R.string.stars_five)));
        items.add(new Item(getString(R.string.sport_four), getString(R.string.sport_four_d), getString(R.string.stars_four)));
        items.add(new Item(getString(R.string.sport_five), getString(R.string.sport_five_d), getString(R.string.stars_four)));
        items.add(new Item(getString(R.string.sport_six), getString(R.string.sport_six_d), getString(R.string.stars_four)));
        items.add(new Item(getString(R.string.sport_seven), getString(R.string.sport_seven_d), getString(R.string.stars_four)));
        items.add(new Item(getString(R.string.sport_eight), getString(R.string.sport_eight_d), getString(R.string.stars_five)));
        ItemAdapter adapter = new ItemAdapter(this, items);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
