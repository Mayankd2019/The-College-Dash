package com.hfad.collegedash;

public class RemindersCard {

    private int mImageResourceId;
    private String title;
    private String desc;
    public RemindersCard(int imageResourceId, String titleText, String descTExt){
        mImageResourceId = imageResourceId;
        title = titleText;
        desc = descTExt;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }
}
