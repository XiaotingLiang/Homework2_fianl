package com.example.homework2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;

import java.util.ArrayList;

public class detail extends AppCompatActivity {

public static ArrayList<Orderitem> addorderitem = new ArrayList<>();
static int ordernumber;
static int total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);
        Intent intent = getIntent();

        int itemID = intent.getIntExtra("itemID",0);
        final item item = itemdatabase.getItemById(itemID);

        TextView price=findViewById(R.id.textView4);
        price.setText("$"+String.valueOf(item.getItemprice()));

        ImageView imageview = findViewById(R.id.imageView2);
        imageview.setImageResource(item.getImageID());

        TextView name=findViewById(R.id.textView7);
        name.setText(item.getItemname());

        TextView detail =findViewById(R.id.textView6);
        detail.setText(item.getItemdetail());

       final ElegantNumberButton elegantNumberButton = findViewById(R.id.number_button);
         elegantNumberButton.setOnClickListener((new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                 ordernumber = Integer.parseInt(elegantNumberButton.getNumber());
             }
        }));


         //add orderitem into chart
        Button addtochart=  findViewById(R.id.button4);

        addtochart.setOnClickListener(new View.OnClickListener(){
                // collect tht orderitem detail
            public void onClick(View v){
                Orderitem kk = new Orderitem(item.getItemname(),item.getItemprice(),ordernumber,item.getImageID());
                addorderitem.add(kk);
                int a = addorderitem.get(addorderitem.size()-1).getItemprice()*ordernumber;
                total = a +total;
                Context context = v.getContext();
                Intent intent = new Intent(context,MainActivity.class);
                context.startActivity(intent);


            }
        });




    }


}
