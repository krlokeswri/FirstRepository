package com.example.aswitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class DynamicTableActivity extends AppCompatActivity {
    CustomAdapter customAdapter;
   String[] DeviceNames = {"Device Name1", "Device Name2", "Device Name3", "Device Name4", "Device Name5"};
    int[] Ltrs = {343,464,56,755,536};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_table);

        // get the reference of RecyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.Block_list_listview);
        // set a LinearLayoutManager with default vertical orientation
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        //  call the constructor of CustomAdapter to send the reference and data to Adapter
        customAdapter = new CustomAdapter( DeviceNames,Ltrs,getApplicationContext());
        recyclerView.setAdapter(customAdapter); // set the Adapter to RecyclerView







    }
}
