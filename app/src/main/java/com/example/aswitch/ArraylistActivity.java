package com.example.aswitch;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class ArraylistActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arraylist);

         ArrayList<String> input1 = new ArrayList<String>();
         ArrayList<String> input2 = new ArrayList<String>();
         TableRow row;
         TableLayout inflate;
         TextView txtcol1, txtcol2;

            //Populating the arrayList
            input1.add("Device Name ");
            input1.add("Device Name ");
            input1.add("Device Name ");
            input2.add(" 129Ltrs");
            input2.add(" 254Ltrs");
            input2.add(" 4763Ltrs");

            inflate = (TableLayout) ArraylistActivity.this
                    .findViewById(R.id.mytable);

            for (int i = 0, j = 0; i < input1.size() || j < input2.size();) {
                row = new TableRow(ArraylistActivity.this);
                txtcol1 = new TextView(ArraylistActivity.this);
                if (input1.size() > i) {
                    if ((input1.get(i) != null)) {
                        txtcol1.setText(input1.get(i));
                        i++;
                    }
                } else {
                    txtcol1.setText("");
                }
                row.addView(txtcol1);

                txtcol2 = new TextView(ArraylistActivity.this);
                if ((input2.size() > j)) {
                    if (input2.get(j) != null) {
                        txtcol2.setText(input2.get(j));
                        j++;
                    }
                } else {
                    txtcol2.setText("");
                }
                row.addView(txtcol2);

                inflate.addView(row);

            }

        }
    }

