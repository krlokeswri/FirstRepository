package com.example.aswitch;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.data.Entry;

import java.util.ArrayList;
import java.util.List;

import lecho.lib.hellocharts.model.Axis;
import lecho.lib.hellocharts.model.AxisValue;
import lecho.lib.hellocharts.model.Line;
import lecho.lib.hellocharts.model.LineChartData;
import lecho.lib.hellocharts.model.PointValue;
import lecho.lib.hellocharts.model.Viewport;
import lecho.lib.hellocharts.view.LineChartView;

public class LinechartActivity extends AppCompatActivity {
    LineChartView lineChartView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linechart);

        lineChartView=findViewById(R.id.line_chart);

        String[] xaxisData={"sun","mon","tues","wed","thur","fri","sat"};

        int[] yaxisData= {10, 20, 25, 30, 35 ,40, 45, 50, 55, 60, 65, 70};

        List yaxisvalues =new ArrayList();
        List xaxisvalues =new ArrayList();

        Line line = new Line(yaxisvalues).setColor(Color.parseColor("#9C27B0"));


        /*for(int i=0;i<xaxisData.length;i++)
        {
            //xaxisvaluess.add(i,new AxisValue(i).setLable(xaxisData[i]));
            xaxisvalues.add(i, new AxisValue(i).setLabel(xaxisData[i]));
        }*/

        ArrayList<Entry> values1 = new ArrayList<>();

        /*for (int i = 0; i < count; i++) {
            float val = (float) (Math.random() * (range / 2f)) + 50;
            values1.add(new Entry(i, val));
        }*/


        for(int i=0;i<yaxisData.length;i++)
        {
            //xaxisvaluess.add(i,new AxisValue(i).setLable(xaxisData[i]));

            yaxisvalues.add(new PointValue(i, yaxisData[i]));
        }

        List lines = new ArrayList();
        lines.add(line);


        LineChartData data = new LineChartData();
        data.setLines(lines);

        lineChartView.setLineChartData(data);

        Axis axis = new Axis();
        axis.setValues(xaxisvalues);
        data.setAxisXBottom(axis);

        Axis yAxis = new Axis();
        data.setAxisYLeft(yAxis);

        axis.setTextSize(16);

         //line = new Line(yaxisvalues).setColor(Color.parseColor("#9C27B0"));

        axis.setTextColor(Color.parseColor("#03A9F4"));

        yAxis.setTextColor(Color.parseColor("#03A9F4"));
        yAxis.setTextSize(16);

        yAxis.setName("daily water usage");

        Viewport viewport = new Viewport(lineChartView.getMaximumViewport());
        viewport.top =110;
        lineChartView.setMaximumViewport(viewport);
        lineChartView.setCurrentViewport(viewport);
    }
}
