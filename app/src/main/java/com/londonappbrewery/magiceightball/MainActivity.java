package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView ballImage;
    Button askButton;
    int ballImageArrayList[] = {R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ballImage = (ImageView) findViewById(R.id.ballImage);
        askButton = (Button) findViewById(R.id.askButton);

        askButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Random randomNumber = new Random();
                int number = randomNumber.nextInt(5);
                ballImage.setImageResource(ballImageArrayList[number]);
            }
        });
    }
}
