package com.hfad.collegedash;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapterTwo extends FragmentPagerAdapter {

    private final int mPages = 3;
    public ViewPagerAdapterTwo(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new BulletinFragment();

            case 1: return new RemindersFragment();

            case 2: return new AssignmentsReminderFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return mPages;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        return titleGenerator(position);
    }

    private CharSequence titleGenerator(int position) {
        switch (position) {
            case 0: return "Bulletin";

            case 1: return "Reminders";

            case 2: return "Assignments";
        }
        return null;
    }
}
