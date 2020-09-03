package com.hfad.collegedash;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapterThree extends FragmentPagerAdapter {

    private final int PAGES = 2;

    public ViewPagerAdapterThree(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new GroupsChatFragment();

            case 1: return new IndivdualChatsFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return PAGES;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: return "Groups";

            case 1: return "Individuals";
        }
        return null;
    }
}
