package com.example.guillermo.ejemploanimatexml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.faceIcon);
    }

    public void onButtonClick(View v) {
        Animation animation =
                AnimationUtils.loadAnimation(this, R.anim.grow);

        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                imageView.setScaleX(2);
                imageView.setScaleY(2);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });

        imageView.startAnimation(animation);
    }
    public void onButtonClick2(View v) {
        Animation animation =
                AnimationUtils.loadAnimation(this, R.anim.rotate);

        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                imageView.setScaleX(2);
                imageView.setScaleY(2);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });

        imageView.startAnimation(animation);
    }

    public void onButtonClick3(View v) {
        Animation animation =
                AnimationUtils.loadAnimation(this, R.anim.slidedown);

        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                imageView.setScaleX(2);
                imageView.setScaleY(2);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });


        imageView.startAnimation(animation);
    }

    public void onButtonClick4(View v) {
        Animation animation =
                AnimationUtils.loadAnimation(this, R.anim.bounce);

        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                imageView.setScaleX(2);
                imageView.setScaleY(2);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });

        imageView.startAnimation(animation);
    }


}
