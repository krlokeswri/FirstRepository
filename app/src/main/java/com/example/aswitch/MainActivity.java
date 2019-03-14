package com.example.aswitch;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import cc.cloudist.acplibrary.ACProgressConstant;
import cc.cloudist.acplibrary.ACProgressCustom;
import cc.cloudist.acplibrary.ACProgressFlower;
import cc.cloudist.acplibrary.ACProgressPie;

public class MainActivity extends AppCompatActivity {

    private AnimationDrawable animationDrawable;
    private ImageView mProgressBar;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv= findViewById(R.id.netsesskey);
        String para="e searched and searched to find lbar to  to ) sctView without having t t";
        tv.setText(para);
        tv.setMovementMethod(new ScrollingMovementMethod());
        button=findViewById(R.id.next_screen);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(MainActivity.this,Table2Activity.class);
                Intent intent=new Intent(MainActivity.this,MulilinechartActivity.class);
                startActivity(intent);
            }
        });



        mProgressBar=findViewById(R.id.main_progress);
        mProgressBar.setBackgroundResource(R.drawable.progressbar_lines);
        animationDrawable = (AnimationDrawable)mProgressBar.getBackground();
        mProgressBar.setVisibility(View.VISIBLE);
        animationDrawable.stop();
        //animationDrawable.start();
        // mProgressBar.setVisibility(View.GONE);
        //animationDrawable.stop();



      /*  ACProgressPie dialog = new ACProgressPie.Builder(this)
                .ringColor(Color.WHITE)
                .pieColor(Color.WHITE)
                .updateType(ACProgressConstant.PIE_AUTO_UPDATE)
                .build();
        dialog.show();
*/
        /*AressFlowerCProg dialog = new ACProgressFlower.Builder(this)
                .direction(ACProgressConstant.DIRECT_CLOCKWISE)
                .themeColor(Color.WHITE)
                .text("please wait")
                .fadeColor(Color.BLUE).build();
        dialog.show();
*/
        /*ACProgressFlower dialog = new ACProgressFlower.Builder(this)
                .direction(ACProgressConstant.DIRECT_CLOCKWISE)
                .themeColor(Color.WHITE)
                .fadeColor(Color.BLUE).build();
        dialog.show();*/
//        ACProgressCustom dialog = new ACProgressCustom.Builder(this)
//                .useImages(R.drawable.thumb)
//                .build();
//        dialog.show();




    }
}
