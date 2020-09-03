package com.hfad.collegedash;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {


    private final int pages = 2;

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0 : return new ClassesFragment();

            case 1 : return new AttendanceCounterFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return pages;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titleGenerator(position);
    }

    public String titleGenerator(int position) {
        switch (position) {
            case 0: return "Classes";

            case 1: return "Attendance ";
        }
        return null;
    }
}
