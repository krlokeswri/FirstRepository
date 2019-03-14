package com.example.aswitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.waynell.library.DropAnimationView;

public class WaterDropActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_drop);


        DropAnimationView view = (DropAnimationView) findViewById(R.id.drop_animation_view);
        view.setDrawables(R.drawable.drop1);
                /*R.drawable.drop2,
                R.drawable.drop3,
                R.drawable.drop1,
                R.drawable.drop2,
                R.drawable.drop3);*/
        //view.animate().translationX(10);
        //view.animate().translationY(8);
        view.startAnimation();


    }
}
