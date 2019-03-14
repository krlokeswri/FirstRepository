package com.example.aswitch;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;

import lecho.lib.hellocharts.model.AxisValue;

public class MulilinechartActivity extends AppCompatActivity {

    private LineChart mChart;
    private XAxis xAxis;
    ArrayList<Integer> colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulilinechart);

        /*String[] xaxisData={"sun","mon","tues","wed","thur","fri","sat"};

        int[] yaxisData= {10, 20, 25, 30, 35 ,40, 45, 50, 55, 60, 65, 70};
*/

        mChart = findViewById(R.id.chart);
        mChart.setDrawGridBackground(true);
        mChart.getDescription().setEnabled(true);
        mChart.getDescription().setText("");
        mChart.getDescription().setTextColor(Color.RED);
        mChart.getDescription().setTextSize(12);
        mChart.setPinchZoom(false);
        mChart.setTouchEnabled(true);
        mChart.setScrollContainer(true);
        mChart.setHorizontalScrollBarEnabled(true);
        mChart.setDragEnabled(true);
        mChart.setScaleXEnabled(true);
        mChart.setScaleYEnabled(true);

        xAxis = mChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawGridLines(false);
        xAxis.setAxisMinimum(1f);

        YAxis leftAxis = mChart.getAxisLeft();
        leftAxis.setDrawZeroLine(false);
        leftAxis.setAxisMinimum(0f);

        YAxis rightAxis = mChart.getAxisRight();
        rightAxis.setAxisMinimum(1f);
        rightAxis.setDrawZeroLine(false);
        rightAxis.setDrawLabels(false);

        mChart.animateX(2000);
        Legend l = mChart.getLegend();

        l.setForm(Legend.LegendForm.LINE);
        colors = new ArrayList<Integer>();
        colors.add(ContextCompat.getColor(this, R.color.orange));
        colors.add(ContextCompat.getColor(this, R.color.green));
        colors.add(ContextCompat.getColor(this, R.color.red));
        colors.add(ContextCompat.getColor(this, R.color.blue));

        setData(12,50);

        //mChart.setOnChartValueSelectedListener(MulilinechartActivity.this);
        mChart.setHighlightPerTapEnabled(true);

    }
    private ArrayList<String> setXAxisValues(){
        ArrayList<String> xVals = new ArrayList<String>();
        xVals.add("sun");
        xVals.add("mon");
        xVals.add("tues");
        xVals.add("wed");
        xVals.add("thur");

        return xVals;
    }
    private ArrayList<Entry> setYAxisValues(){
        ArrayList<Entry> yVals = new ArrayList<Entry>();
        yVals.add(new Entry(60, 0));
        yVals.add(new Entry(48, 1));
        yVals.add(new Entry(70.5f, 2));
        yVals.add(new Entry(100, 3));
        yVals.add(new Entry(180.9f, 4));

        return yVals;
    }


    private void setData(int count,int range) {

        ArrayList<Entry> values1 = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            float val = (float) (Math.random() * (range / 2f)) + 50;
            values1.add(new Entry(i, val));
        }

        ArrayList<Entry> values2 = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            float val = (float) (Math.random() * range) + 450;
            values2.add(new Entry(i, val));
        }
        LineDataSet set1, set2;


            set1 = (LineDataSet) mChart.getData().getDataSetByIndex(0);
            set2 = (LineDataSet) mChart.getData().getDataSetByIndex(1);
            //set3 = (LineDataSet) mChart.getData().getDataSetByIndex(2);
            set1.setValues(values1);
            set2.setValues(values2);
           // set3.setValues(values3);
            mChart.getData().notifyDataChanged();
            mChart.notifyDataSetChanged();

        // create a data object with the data sets
        LineData data = new LineData(set1, set2);
        data.setValueTextColor(Color.WHITE);
        data.setValueTextSize(9f);

        // set data
        mChart.setData(data);

       /* ArrayList<String> xVals = setXAxisValues();

        ArrayList<Entry> yVals = setYAxisValues();

        LineDataSet set1;

        set1 = new LineDataSet(yVals, "DataSet");
        set1.setFillAlpha(110);

        set1.setColor(Color.BLACK);
        set1.setCircleColor(Color.BLACK);
        set1.setLineWidth(1f);
        set1.setCircleRadius(3f);
        set1.setDrawCircleHole(false);
        set1.setValueTextSize(9f);
        //set1.setDrawFilled(true);

        //LineDataSet dataSet = new LineDataSet(entries, "# of Calls");

        ArrayList<ILineDataSet> dataSets = new ArrayList<ILineDataSet>();
        dataSets.add(set1); // add the datasets
        //LineDataSet dataSet = new LineDataSet(yVals, "# of Calls");

       //LineData lineData = new LineData(dataSets);

        // create a data object with the datasets
        LineData data = new LineData( xVals,dataSets);

        // set data
        mChart.setData(data);
*/

       /* LineDataSet dataSet = new LineDataSet(entries, "# of Calls");
        ArrayList<ILineDataSet> dataSetList = new ArrayList<ILineDataSet>();
        dataSets.add(dataSet ); // add the datasets
        LineData lineData = new LineData(dataSetList);*/

       // graph.setData(lineData);


    }
}
