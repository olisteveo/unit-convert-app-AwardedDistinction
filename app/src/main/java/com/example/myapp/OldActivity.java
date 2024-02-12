package com.example.myapp;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class OldActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_old);
        TextView main = (TextView) findViewById(R.id.TextView_Main);
        ImageView pic = (ImageView) findViewById(R.id.imageView);
        Button btnRoll = (Button) findViewById(R.id.btnRoll);
        btnRoll.setOnClickListener(this);
        generate(main, pic);
        //main.append(scoreText(mark));
        //main.setTextColor(scoreColor(mark));
    }
    @Override
    public void onClick(View view) {
        TextView main = (TextView) findViewById(R.id.TextView_Main);
        ImageView pic = (ImageView) findViewById(R.id.imageView);
        generate(main, pic);
    }

    private void generate(TextView main, ImageView pic)
    {
        int _mark = mark();
        main.setText("hello world");
        main.append("\nYour mark is " + _mark);

        score(main, pic, _mark);
    }
    private int mark() {
        int mark = 0;
        Random r = new Random();
        mark = r.nextInt(100);
        mark++;
        return mark;
    }

    private String scoreText(int mark) {
        if(mark >= 70) {
            return "\nYou got a distinction";
        } else if(mark < 70 && mark >= 50) {
            return "\nYou passed";
        }
        return "\nSorry, you failed";
    }
    private int scoreColor(int mark) {
        if(mark >= 70) {
            return Color.GREEN;
        } else if(mark < 70 && mark >= 50) {
            return Color.BLUE;
        }
        return Color.RED;
    }

    private void score(TextView main, ImageView pic, int mark) {
        main.setTextSize(14f);
        if(mark >= 70) {
            main.append("\nYou got a distinction");
            String green = "presence_audio_online";
            main.setTextColor(Color.GREEN);
            return;
        } else if(mark < 70 && mark >= 50) {
            main.append("\nYou passed");
            String orange = "presence_audio_away";
            main.setTextColor(Color.BLUE);
            return;
        }
        main.setTextColor(Color.RED);
        String red = "presence_audio_busy";
        main.setTextSize(36.0f);
        main.append("\nSorry, you failed");

    }
}