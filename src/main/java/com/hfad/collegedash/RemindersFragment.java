package com.hfad.collegedash;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class RemindersFragment extends Fragment {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RemindersAdapter remindersAdapter;
    ArrayList<RemindersCard> data;


    public RemindersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_reminders, container, false);

        //writing the data
        data = new ArrayList<>();
        data.add(new RemindersCard(R.drawable.college_pics,"Reminders Title","Time will be represented on the babe's picture"));
        data.add(new RemindersCard(R.drawable.college_pics,"Reminders Title","Time will be represented on the babe's picture"));
        data.add(new RemindersCard(R.drawable.college_pics,"Reminders Title","Time will be represented on the babe's picture"));

        //set up the recycler View
        recyclerView = view.findViewById(R.id.reminders_recycler_view);
        recyclerView.setHasFixedSize(true);
        remindersAdapter = new RemindersAdapter(data);
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(remindersAdapter);

        return view;
    }
}
