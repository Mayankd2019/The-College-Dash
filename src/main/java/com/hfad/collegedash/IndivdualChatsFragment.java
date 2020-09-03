package com.hfad.collegedash;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class IndivdualChatsFragment extends Fragment {

    private ArrayList<RemindersCard> data;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private  RemindersAdapter remindersAdapter;

    public IndivdualChatsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_indivdual_chats, container, false);

        //initialisation of data
        data = new ArrayList<>();
        data.add(new RemindersCard(R.drawable.college_pics,"NAME","Message"));
        data.add(new RemindersCard(R.drawable.college_pics,"NAME","Message"));
        data.add(new RemindersCard(R.drawable.college_pics,"NAME","Message"));

        //recycler view initializing
        recyclerView = view.findViewById(R.id.group_chats_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getContext());
        remindersAdapter = new RemindersAdapter(data);

        recyclerView.setAdapter(remindersAdapter);
        recyclerView.setLayoutManager(layoutManager);

        return view;
    }
}
