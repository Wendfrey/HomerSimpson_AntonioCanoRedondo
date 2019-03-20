package com.antonio.homersimpson_antoniocanoredondo;

import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView ull, engr_verd, engr_blau, engr_verm, donut;
    private Animation ullAnimation, donutAnimation, animHorario, animAntiHorario1, animAntiHorario2;
    private MediaPlayer mediaPlayer;
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

        animHorario= AnimationUtils.loadAnimation(this, R.anim.anim_spin_sentido);
        animAntiHorario1 = AnimationUtils.loadAnimation(this,R.anim.anim_spin_contrasentido);
        animAntiHorario2 = AnimationUtils.loadAnimation(this,R.anim.anim_spin_contrasentido);
        donutAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_donut);
        ullAnimation = AnimationUtils.loadAnimation(this,R.anim.anim_ull);

        mediaPlayer = MediaPlayer.create(this,R.raw.the_simpsons);
        mediaPlayer.setLooping(true);
    }

    public void titleClick(View v){
        if(ull.getVisibility() == View.VISIBLE) {

            engr_verm.clearAnimation();
            engr_blau.clearAnimation();
            engr_verd.clearAnimation();

            donut.clearAnimation();

            ull.clearAnimation();

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


            engr_verd.startAnimation(animHorario);
            engr_blau.startAnimation(animAntiHorario1);
            engr_verm.startAnimation(animAntiHorario2);

            donut.startAnimation(donutAnimation);

            ull.startAnimation(ullAnimation);
        }
    }

    public void donutClick(View v){
        if(mediaPlayer.isPlaying()){
            mediaPlayer.pause();
        } else{
            mediaPlayer.start();
        }
        Log.d("Donut", "Clicked");
    }
}
