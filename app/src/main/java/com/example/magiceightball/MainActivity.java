package com.example.magiceightball;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button askbutton=findViewById(R.id.ask_Button);
        final ImageView imageball=findViewById(R.id.image_Ball);
       final int[] ballArray=new int[]{
                    R.drawable.ball1,
                    R.drawable.ball2,
                    R.drawable.ball3,
                    R.drawable.ball4,
                    R.drawable.ball5,

        };

        final Random randomNumberGenerator=new Random();


        askbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MagicEightBall","Button is pressed");
                int number=randomNumberGenerator.nextInt(5);
                imageball.setImageResource(ballArray[number]);
            }
        });

    }
}
