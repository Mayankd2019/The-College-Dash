package com.hfad.collegedash;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;


public class NoticesFragment extends Fragment {

    private ViewPager viewPager;
    private ViewPagerAdapterTwo adapter;

    public NoticesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_notices, container, false);

        //configuring the view pager
        viewPager = view.findViewById(R.id.notices_view_pager);
        adapter = new ViewPagerAdapterTwo(getChildFragmentManager(),2);
        viewPager.setAdapter(adapter);

        //configuring the tab layout
        TabLayout tabLayout = view.findViewById(R.id.tab_layout_notices_fragment);
        tabLayout.setupWithViewPager(viewPager);


        return view;
    }
}
