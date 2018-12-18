package com.example.asus.kavilipi_project;




import android.content.Intent;
import android.graphics.Movie;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class Compose_Tab1Fragment extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<Compose_Data_Model> horizontalList;
    private Compose_Horizontal_CustomAdapter horizontalAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.compose_tab_1,container,false);
        recyclerView= (RecyclerView)v. findViewById(R.id.recycler_view);
        horizontalList = new ArrayList<Compose_Data_Model>();
        for (int i = 0; i < Compose_MyData.TITLES.length; i++) {
            horizontalList.add(new Compose_Data_Model(
                    Compose_MyData.TITLES[i],
                    Compose_MyData.IMAGES[i]
            ));
        }
        horizontalAdapter=new Compose_Horizontal_CustomAdapter(horizontalList);
        LinearLayoutManager horizontalLayoutManagaer
                = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(horizontalLayoutManagaer);
        recyclerView.setAdapter(horizontalAdapter);




recyclerView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
    @Override
    public boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {

Intent intent = new Intent(getContext(), Compose_Navigation_main_activity.class);
startActivity(intent);
        return false;
    }

    @Override
    public void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {

    }

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean b) {

    }
});



        return v;
    }
}

