package com.example.asus.kavilipi_project;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Library_CustomVerticalAdapter extends RecyclerView.Adapter<Library_CustomVerticalAdapter.MyViewHolder> {

    private ArrayList<Library_vertical_Data_model> verti_dataSet;


    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView verti_titleName;
        TextView verti_subtitleName;
        TextView verti_titleview;
        TextView verti_titlerate;



        ImageView verti_imageViewLogo;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            this.verti_titleName = (TextView) itemView.findViewById(R.id.verti_title_name);
            this.verti_subtitleName = (TextView) itemView.findViewById(R.id.verti_title_subname);
            this.verti_titleview= (TextView) itemView.findViewById(R.id.verti_titleview);
            this.verti_titlerate = (TextView) itemView.findViewById(R.id.verti_titlerate);


            //this.textViewVersion = (TextView) itemView.findViewById(R.id.textViewVersion);
            this.verti_imageViewLogo= (ImageView) itemView.findViewById(R.id.verti_imgtitle);



        }
    }


    public Library_CustomVerticalAdapter(ArrayList<Library_vertical_Data_model> data) {
        this.verti_dataSet = data;
    }




    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.library_vertical_recyclerview, parent, false);

        //view.setOnClickListener(MainActivity.myOnClickListener);

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {

        TextView verti_titleName = holder.verti_titleName;
        TextView verti_subtitleName = holder.verti_subtitleName;
        TextView verti_titleview = holder.verti_titleview;
        TextView verti_titlerate = holder.verti_titlerate;



        ImageView verti_imageViewLogo = holder.verti_imageViewLogo;


        // TextView textViewVersion = holder.textViewVersion;


        verti_titleName.setText(verti_dataSet.get(listPosition).getVerticalTitleName());
        verti_subtitleName.setText(verti_dataSet.get(listPosition).getVerticalSubTitleName());
        verti_titleview.setText(verti_dataSet.get(listPosition).getVerticalRateName());
        verti_titlerate.setText(verti_dataSet.get(listPosition).getVerticalRateName());
        //textViewVersion.setText(dataSet.get(listPosition).getVersion());
        verti_imageViewLogo.setImageResource(verti_dataSet.get(listPosition).getVerticalImageLogo());
    }

    @Override
    public int getItemCount() {
        return verti_dataSet.size();
    }
}