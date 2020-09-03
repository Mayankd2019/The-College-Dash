package com.hfad.collegedash;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;


public class ChatsFragment extends Fragment {

    private ViewPager viewPager;
    private ViewPagerAdapterThree adapter;
    private TabLayout tabLayout;

    public ChatsFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chats, container, false);

        //set up the viewPager
        viewPager = view.findViewById(R.id.chats_view_pager);
        tabLayout = view.findViewById(R.id.tab_layout_chats_fragment);
        tabLayout.setupWithViewPager(viewPager);
        adapter = new ViewPagerAdapterThree(getChildFragmentManager(),3);

        viewPager.setAdapter(adapter);


        return view;
    }
}
