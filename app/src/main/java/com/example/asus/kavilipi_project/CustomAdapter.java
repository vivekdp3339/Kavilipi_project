package com.example.asus.kavilipi_project;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    private ArrayList<Data_Model> dataSet;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView titleName;
        TextView titleView;
        TextView titleRate;
        TextView titleDiet;


        ImageView imageViewLogo;
        ImageView imageViewupdate;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.titleName = (TextView) itemView.findViewById(R.id.textViewName);
            this.titleView = (TextView) itemView.findViewById(R.id.textViewtime);
            this.titleRate = (TextView) itemView.findViewById(R.id.textViewdate);


            //this.textViewVersion = (TextView) itemView.findViewById(R.id.textViewVersion);
            this.imageViewLogo = (ImageView) itemView.findViewById(R.id.imageLogo);
            this.imageViewupdate = (ImageView) itemView.findViewById(R.id.imageViewUser);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v)
                {
                    if (getPosition()==0)
                    {
                        Toast.makeText(v.getContext(), " On CLick one", Toast.LENGTH_SHORT).show();

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

                }
            });
        }
    }

    public CustomAdapter(ArrayList<Data_Model> data) {
        this.dataSet = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.update_footer_cardview, parent, false);

        //view.setOnClickListener(MainActivity.myOnClickListener);

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {

        TextView titleName = holder.titleName;
        TextView titleView = holder.titleView;
        TextView titleRate = holder.titleRate;




        // TextView textViewVersion = holder.textViewVersion;
        ImageView imageViewLogo = holder.imageViewLogo;
        ImageView imageViewupdate = holder.imageViewupdate;

        titleName.setText(dataSet.get(listPosition).getTitleName());

        //textViewVersion.setText(dataSet.get(listPosition).getVersion());
        imageViewLogo.setImageResource(dataSet.get(listPosition).getImageLogo());
        imageViewupdate.setImageResource(dataSet.get(listPosition).getImageUpdate());
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}