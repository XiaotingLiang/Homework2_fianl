package com.example.homework2;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class adapter_chart extends RecyclerView.Adapter<adapter_chart.UserViewholder> {

    ArrayList<Orderitem>arrayList= detail.addorderitem;


    @NonNull
    @Override
    public UserViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chartviewholder,parent,false);
        UserViewholder customviewholder = new UserViewholder(view);
        return customviewholder;
    }
    public class UserViewholder extends RecyclerView.ViewHolder{

        public View view;
        public ImageView image;
        public TextView name;
        public TextView price;
        public TextView count;
        public TextView x;


        public  UserViewholder(View v){

            super(v);
            view =v;
            image = v.findViewById(R.id.chartimage);
            name = v.findViewById(R.id.chartname);
            price = v.findViewById(R.id.chartprice);
            count = v.findViewById(R.id.chartnumber);
            x = v.findViewById(R.id.chartx);

        }

    }

    @Override
    public void onBindViewHolder(@NonNull UserViewholder holder, int position) {

                holder.image.setImageResource(arrayList.get(position).getImageID());
                holder.name.setText(arrayList.get(position).getItemname());
                holder.price.setText("$" + String.valueOf(arrayList.get(position).getItemprice()));
                holder.count.setText(String.valueOf(arrayList.get(position).getOrdernumber()));

        }



    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
