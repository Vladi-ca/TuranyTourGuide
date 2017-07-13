package com.example.android.turanytourguide;

public class Item {

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private String mItemName;

    private String mItemDescription;

    private String mItemStars;

    public Item(String itemName, String itemDescription, String itemStars) {
        mItemName = itemName;
        mItemDescription = itemDescription;
        mItemStars = itemStars;
    }

    public Item(String itemName, String itemDescription, String itemStars, int imageResourceId) {
        mItemName = itemName;
        mItemDescription = itemDescription;
        mItemStars = itemStars;
        mImageResourceId = imageResourceId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getItemName() {
        return mItemName;
    }

    public String getItemDescription() {
        return mItemDescription;
    }

    public String getItemStars() {
        return mItemStars;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;

    }

}
