package com.hfad.collegedash;

public class CardClass {

    private int mImageResourceId;
    private String mTextClassName;
    private String mTextAttendance;

    public CardClass(int imgResourceId, String classNameText, String attendanceBarText) {
        this.mImageResourceId = imgResourceId;
        this.mTextClassName = classNameText;
        this.mTextAttendance = attendanceBarText;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public String getmTextClassName() {
        return mTextClassName;
    }

    public String getmTextAttendance() {
        return mTextAttendance;
    }
}
