package com.hfad.collegedash;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class BulletinFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RemindersAdapter adapter;
    private ArrayList<RemindersCard> data;

    public BulletinFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bulletin, container, false);
        //adding data
        data = new ArrayList<>();
        data.add(new RemindersCard(R.drawable.college_pics,"asdjdf","lajf"));
        data.add(new RemindersCard(R.drawable.college_pics,"asdjdf","lajf"));
        data.add(new RemindersCard(R.drawable.college_pics,"asdjdf","lajf"));

        //defining the recycler view
        recyclerView = view.findViewById(R.id.bulletin_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getContext());
        adapter = new RemindersAdapter(data);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        // Inflate the layout for this fragment

        return view;
    }
}
