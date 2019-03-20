package com.antonio.homersimpson_antoniocanoredondo;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView simpsonTitle = findViewById(R.id.img_simpsontitle);
        AnimationDrawable animationDrawable = (AnimationDrawable) simpsonTitle.getDrawable();
        animationDrawable.start();
    }
}
