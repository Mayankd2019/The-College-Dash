package com.hfad.collegedash;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;


public class DashBoardFragment extends Fragment {

    private ViewPager pager;
    private ViewPagerAdapter viewPagerAdapter;
    private TabLayout tabLayout;

    public DashBoardFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dash_board, container, false);


        pager = view.findViewById(R.id.main_view_pager);
        viewPagerAdapter = new ViewPagerAdapter(getChildFragmentManager(),0);
        pager.setAdapter(viewPagerAdapter);

        tabLayout = view.findViewById(R.id.tab_layout_main_view_pager);
        tabLayout.setupWithViewPager(pager);



        return view;
    }

}
