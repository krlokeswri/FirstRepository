package com.example.aswitch;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

public class BarChartActivity extends AppCompatActivity {
    HorizontalBarChart horizontalBarChart;
    ArrayList<Integer> colors;
    private XAxis xAxis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);
        horizontalBarChart=findViewById(R.id.bar_chart);

        horizontalBarChart.setDrawGridBackground(false);
        horizontalBarChart.getDescription().setEnabled(true);
        horizontalBarChart.getDescription().setText("");
        horizontalBarChart.getDescription().setTextColor(Color.RED);
        horizontalBarChart.getDescription().setTextSize(12);
        horizontalBarChart.setTouchEnabled(false);
        horizontalBarChart.setScrollContainer(true);
        horizontalBarChart.setHorizontalScrollBarEnabled(true);
        horizontalBarChart.setDragEnabled(true);
        horizontalBarChart.setScaleXEnabled(false);
        //horizontalBarChart.setScaleYEnabled(true);
        horizontalBarChart.getAxisRight().setEnabled(true);
        horizontalBarChart.getAxisLeft().setEnabled(false);
        horizontalBarChart.setPinchZoom(false);


        //bottom xaxis
        xAxis = horizontalBarChart.getXAxis();
        xAxis.setEnabled(true);
        xAxis.setDrawGridLines(false);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        // show the desc value of each bar on top
        horizontalBarChart.getXAxis().setEnabled(true);





        colors = new ArrayList<Integer>();
        colors.add(ContextCompat.getColor(this, R.color.orange));
        colors.add(ContextCompat.getColor(this, R.color.green));
        colors.add(ContextCompat.getColor(this, R.color.red));
        colors.add(ContextCompat.getColor(this, R.color.blue));
        colors.add(ContextCompat.getColor(this, R.color.orange));
        colors.add(ContextCompat.getColor(this, R.color.green));
        colors.add(ContextCompat.getColor(this, R.color.red));
        colors.add(ContextCompat.getColor(this, R.color.blue));
        colors.add(ContextCompat.getColor(this, R.color.orange));
        colors.add(ContextCompat.getColor(this, R.color.green));
        colors.add(ContextCompat.getColor(this, R.color.red));
        colors.add(ContextCompat.getColor(this, R.color.blue));

        setData(12,58);
    }

    private void setData(int count, int range) {

        ArrayList<BarEntry> values=new ArrayList<>();
        float barwodth =9f;
        float barSpace = 0.03f;
        float spaceforbar=18f;

        for(int i=0;i<=count;i++)
        {
            float val=(float)(Math.random()*range);
            values.add(new BarEntry(i*spaceforbar,val));
        }

        BarDataSet set1;
        set1=new BarDataSet(values,"data set1");
        set1.setColors(colors);
        //set1.setColor(Color.RED);
        BarData data=new BarData(set1);
        //data.setValueTextColors(colors);
        data.setBarWidth(barwodth);


        // horizontalBarChart.setSpaceMax(barSpace);
        horizontalBarChart.getXAxis().setSpaceMax(1);


        horizontalBarChart.setFitBars(true);
        // set1.setValueTextColor(Color.blue());
        horizontalBarChart.setData(data);

    }
}