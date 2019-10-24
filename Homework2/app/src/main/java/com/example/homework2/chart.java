package com.example.homework2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class chart extends AppCompatActivity {
    int cost = detail.total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chart);
        //import recycleview
        RecyclerView recycleView1 = findViewById(R.id.recyclerView3);
        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(recycleView1.getContext());
        recycleView1.setLayoutManager(layoutManager1);
        adapter_chart chartadapter = new adapter_chart();
        recycleView1.setAdapter(chartadapter);
        //button back to homepage
        Button backtomain=  findViewById(R.id.button2);
        backtomain.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Context context = v.getContext();
                Intent intent = new Intent(context,MainActivity.class);
                context.startActivity(intent);

            }
        });
        //get total price
        TextView total = findViewById(R.id.totalprice);
        total.setText("Total Price:"+"      $"+cost);




    }


}
