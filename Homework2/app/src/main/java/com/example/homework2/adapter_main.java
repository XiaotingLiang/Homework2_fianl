package com.example.homework2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public  class adapter_main extends RecyclerView.Adapter<adapter_main.UserViewholder> {

    ArrayList<item>arrayList;

    public void setdata(ArrayList arrayList){
        this.arrayList = arrayList;
    }

    @Override
    public UserViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder,parent,false);
        UserViewholder customviewholder = new UserViewholder(view);
        return customviewholder;
    }

    public class UserViewholder extends RecyclerView.ViewHolder{
        public View view;
        public ImageView image;
        public TextView name;
        public TextView price;




        public UserViewholder(View v){
            super(v);
            view = v;
            image = v.findViewById(R.id.imageView);
            name = v.findViewById(R.id.textView);
            price = v.findViewById(R.id.textView2);



        }

    }

    public void onBindViewHolder (@NonNull final UserViewholder holder, final int position) {

        holder.image.setImageResource(arrayList.get(position).getImageID());
        holder.name.setText(arrayList.get(position).getItemname());
        holder.price.setText("$"+String.valueOf(arrayList.get(position).getItemprice()));
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(context,detail.class);
                intent.putExtra("itemID", arrayList.get(position).getItemID());
                context.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

}
