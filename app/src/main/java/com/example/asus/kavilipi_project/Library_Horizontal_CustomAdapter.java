package com.example.asus.kavilipi_project;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

class Library_Horizontal_CustomAdapter extends RecyclerView.Adapter<Library_Horizontal_CustomAdapter.MyViewHolder> {

    private ArrayList<Library_Data_Model> dataSet;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView titleName;



        ImageView imageViewLogo;


        public MyViewHolder(View itemView) {
            super(itemView);
            this.titleName = (TextView) itemView.findViewById(R.id.titlename);


            //this.textViewVersion = (TextView) itemView.findViewById(R.id.textViewVersion);
            this.imageViewLogo = (ImageView) itemView.findViewById(R.id.imgtitle);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v)
                {




/*
                    if (getPosition()==0)
                    {
                        */
/*Toast.makeText(v.getContext(), " On CLick one", Toast.LENGTH_SHORT).show();*//*



                    } if (getPosition()==1)
                {
                    Toast.makeText(v.getContext(), " On CLick Two", Toast.LENGTH_SHORT).show();

                } if (getPosition()==2)
                {
                    Toast.makeText(v.getContext(), " On CLick Three", Toast.LENGTH_SHORT).show();

                } if (getPosition()==3)
                {
                    Toast.makeText(v.getContext(), " On CLick Fore", Toast.LENGTH_SHORT).show();

                }
*/

                }
            });
        }
    }

    public Library_Horizontal_CustomAdapter(ArrayList<Library_Data_Model> data) {
        this.dataSet = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.library_horizontal_recyclerview, parent, false);

        //view.setOnClickListener(MainActivity.myOnClickListener);

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {

        TextView titleName = holder.titleName;





        // TextView textViewVersion = holder.textViewVersion;
        ImageView imageViewLogo = holder.imageViewLogo;


        titleName.setText(dataSet.get(listPosition).getTitleName());

        //textViewVersion.setText(dataSet.get(listPosition).getVersion());
        imageViewLogo.setImageResource(dataSet.get(listPosition).getImageLogo());

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}