package com.hfad.collegedash;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class ClassesFragment extends Fragment {

    ArrayList<CardClass> cardDataList;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView recyclerView;
    private ClassCardAdapter adapter;

    public ClassesFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_classes, container, false);

        //inserting default data into the recycler view
        inserData();


        recyclerView = view.findViewById(R.id.classes_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new GridLayoutManager(getContext(),2);
        adapter = new ClassCardAdapter(cardDataList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        return view;
    }

    private void inserData() {
        cardDataList = new ArrayList<>();
        cardDataList.add(new CardClass(R.drawable.college_pics,"Physics","50 percent"));
        cardDataList.add(new CardClass(R.drawable.college_pics,"Maths","90percent"));
        cardDataList.add(new CardClass(R.drawable.college_pics,"English","0 percent"));
        cardDataList.add(new CardClass(R.drawable.college_pics,"Physics","50 percent"));
        cardDataList.add(new CardClass(R.drawable.college_pics,"Maths","90percent"));
        cardDataList.add(new CardClass(R.drawable.college_pics,"English","0 percent"));
        cardDataList.add(new CardClass(R.drawable.college_pics,"Physics","50 percent"));
        cardDataList.add(new CardClass(R.drawable.college_pics,"Maths","90percent"));
        cardDataList.add(new CardClass(R.drawable.college_pics,"English","0 percent"));
        cardDataList.add(new CardClass(R.drawable.college_pics,"Physics","50 percent"));
        cardDataList.add(new CardClass(R.drawable.college_pics,"Maths","90percent"));
        cardDataList.add(new CardClass(R.drawable.college_pics,"English","0 percent"));
        cardDataList.add(new CardClass(R.drawable.college_pics,"Physics","50 percent"));
        cardDataList.add(new CardClass(R.drawable.college_pics,"Maths","90percent"));
        cardDataList.add(new CardClass(R.drawable.college_pics,"English","0 percent"));
    }
}
