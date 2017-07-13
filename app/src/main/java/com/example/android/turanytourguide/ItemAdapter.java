package com.example.android.turanytourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {

    public ItemAdapter(Activity context, ArrayList<Item> items) {
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Item currentItem = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.list_item_name);
        nameTextView.setText(currentItem.getItemName());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.list_item_description);
        descriptionTextView.setText(currentItem.getItemDescription());

        TextView starsTextView = (TextView) listItemView.findViewById(R.id.list_item_stars);
        starsTextView.setText(currentItem.getItemStars());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if(currentItem.hasImage()) {
            imageView.setImageResource(currentItem.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;

    }
}
