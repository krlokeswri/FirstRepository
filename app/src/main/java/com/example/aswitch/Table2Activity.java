package com.example.aswitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class Table2Activity extends AppCompatActivity {
    Button btn;
    TableLayout table;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table2);

        btn = (Button) findViewById(R.id.button);
        table = (TableLayout) findViewById(R.id.table_main2);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TableRow newRow = new TableRow(Table2Activity.this);
                TextView devicename = new TextView(Table2Activity.this);
                TextView Ltrs = new TextView(Table2Activity.this);


               /* TextView devicename = findViewById(R.id.device_name);
                TextView Ltrs = findViewById(R.id.Ltr_s);
*/
                devicename.setText("Device Name");
                Ltrs.setText("194Ltrs");


                newRow.addView(devicename);
                newRow.addView(Ltrs);

                table.addView(newRow);

            }
        });
    }
}




