package com.jsstech.playwithcolors;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btTouch;
    private View windowView;
    private int[] customcolor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customcolor=new int[]{Color.RED,Color.BLUE,Color.YELLOW,Color.WHITE,Color.MAGENTA,Color.CYAN,
        Color.LTGRAY,Color.DKGRAY};

        windowView=findViewById(R.id.winView);
        btTouch=findViewById(R.id.bt_Touch);

        btTouch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //display output in console

                //Log.d("test","tap");
                int colorArryLength=customcolor.length;
                Random random=new Random();

                int randmno=random.nextInt(colorArryLength);
                windowView.setBackgroundColor(customcolor[randmno]);


            }
        });
    }
}