package com.example.aswitch;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class TableActivity extends AppCompatActivity {

    String DeviceNames[] = {"device1", "device2", "device3", "device4", "device5"};
    String Ltrs[] = {"208ltrs", "376Ltrs", "655Ltrs", "354Ltrs", "425Ltrs"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        //initializingtable();
        addHeaders();
        addData();

    }

    private TextView getTextView(int id, String title, int color, int typeface, int bgColor) {
        TextView tv = new TextView(this);
        tv.setId(id);
        tv.setText(title.toUpperCase());
        tv.setTextColor(color);
        tv.setPadding(40, 40, 40, 40);
        tv.setTypeface(Typeface.DEFAULT, typeface);
        tv.setBackgroundColor(bgColor);
        tv.setLayoutParams(getLayoutParams());
        //tv.setOnClickListener(this);
        return tv;
    }


    @NonNull
    private TableLayout.LayoutParams getLayoutParams() {
        TableLayout.LayoutParams params = new TableLayout.LayoutParams(
                TableLayout.LayoutParams.MATCH_PARENT,
                TableLayout.LayoutParams.WRAP_CONTENT);
        params.setMargins(2, 0, 0, 2);
        return params;
    }

    @NonNull
    private TableLayout.LayoutParams getTblLayoutParams() {
        return new TableLayout.LayoutParams(
                TableLayout.LayoutParams.MATCH_PARENT,
                TableLayout.LayoutParams.WRAP_CONTENT);
    }

    private void addHeaders() {
        TableLayout tl = findViewById(R.id.table_main);
        TableRow tr = new TableRow(this);
        tr.setLayoutParams(getLayoutParams());
        tr.addView(getTextView(0, "Device Name", Color.WHITE, Typeface.BOLD, Color.BLUE));
        tr.addView(getTextView(0, "Ltrs", Color.WHITE, Typeface.BOLD, Color.BLUE));
        tl.addView(tr, getTblLayoutParams());
    }

    public void addData() {
        int numCompanies = DeviceNames.length;
        TableLayout tl = findViewById(R.id.table_main);
        for (int i = 0; i < numCompanies; i++) {
            TableRow tr = new TableRow(this);
            tr.setLayoutParams(getLayoutParams());
            tr.addView(getTextView(i + 1, DeviceNames[i], Color.WHITE, Typeface.NORMAL, ContextCompat.getColor(this, R.color.colorPrimary)));
            tr.addView(getTextView(i + numCompanies, Ltrs[i], Color.WHITE, Typeface.NORMAL, ContextCompat.getColor(this, R.color.colorPrimary)));
            tl.addView(tr, getTblLayoutParams());
        }
    }
}


   /* private void initializingtable() {

        TableLayout stk = (TableLayout) findViewById(R.id.table_main);
        TableRow tbrow0 = new TableRow(this);
        TextView tv0 = new TextView(this);
        tv0.setText(" Device Name ");
        tv0.setTextColor(Color.WHITE);
        tbrow0.addView(tv0);
        TextView tv1 = new TextView(this);
        tv1.setText(" 1200Ltrs ");
        tv1.setTextColor(Color.WHITE);
        tbrow0.addView(tv1);

    }*/


