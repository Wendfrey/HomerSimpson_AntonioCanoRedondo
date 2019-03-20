package com.antonio.homersimpson_antoniocanoredondo;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ull, engr_verd, engr_blau, engr_verm, donut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView simpsonTitle = findViewById(R.id.img_simpsontitle);
        AnimationDrawable animationDrawable = (AnimationDrawable) simpsonTitle.getDrawable();
        animationDrawable.start();

        ull = findViewById(R.id.img_ull);
        engr_blau = findViewById(R.id.img_engr_blau);
        engr_verd = findViewById(R.id.img_engr_verd);
        engr_verm = findViewById(R.id.img_engr_vemell);
        donut = findViewById(R.id.img_donut);
        
    }

    public void titleClick(View v){
        if(ull.getVisibility() == View.VISIBLE) {
            ull.setVisibility(View.INVISIBLE);
            engr_verm.setVisibility(View.INVISIBLE);
            engr_verd.setVisibility(View.INVISIBLE);
            engr_blau.setVisibility(View.INVISIBLE);
            donut.setVisibility(View.INVISIBLE);
        } else{
            ull.setVisibility(View.VISIBLE);
            engr_verm.setVisibility(View.VISIBLE);
            engr_verd.setVisibility(View.VISIBLE);
            engr_blau.setVisibility(View.VISIBLE);
            donut.setVisibility(View.VISIBLE);
        }
    }
}
