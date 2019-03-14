package com.example.aswitch;

import android.app.Activity;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class Drop extends Activity implements Animation.AnimationListener {

    ImageView drop1img,drop2img;
    Button btnmove;
    View view;
    Animation animMove;


   @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_drop);


       drop1img=findViewById(R.id.dorp_1);
       drop2img=findViewById(R.id.dorp_2);
       btnmove=findViewById(R.id.btnmove);

      final ViewFlipper viewFlipper = (ViewFlipper)findViewById(R.id.flipperid);

       // load the animation
      animMove = AnimationUtils.loadAnimation(getApplicationContext(),
               R.anim.moving);
       // set animation listener
       animMove.setAnimationListener(this);
      // animMove.setDuration(5000);

       // button click event
       btnmove.setOnClickListener(new View.OnClickListener() {

           @Override
           public void onClick(View v) {
               drop1img.setVisibility(View.VISIBLE);
               drop2img.setVisibility(View.VISIBLE);

               // start the animation
               //onAnimationRepeat(animMove);
               viewFlipper.setAnimation(animMove);
               viewFlipper.startFlipping();
             // drop1img.startAnimation(animMove);

           }
       });

   }
    @Override
    public void onAnimationStart(Animation animation) {

        //animMove.setRepeatCount(6);

    }

    @Override
    public void onAnimationEnd(Animation animation) {

        for(int i=1;i<=3;i++) {
            if (animation == animMove) {
                    if(i==3)
                    {
                        break;
                    }
                    else {
                                 drop1img.startAnimation(animMove);
                                // drop2img.startAnimation(animMove);
                    }

            }
        }

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}

