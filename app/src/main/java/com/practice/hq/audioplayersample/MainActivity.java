package com.practice.hq.audioplayersample;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer player = MediaPlayer.create(this , R.raw.theendofallthings);

        final Button playButton = (Button) findViewById(R.id.ButtonPlay);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.start();
            }
        });

        Button pauseButton = (Button) findViewById(R.id.ButtonPause);
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.pause();
            }
        });
        //this is some
        int x = 5 + 6;
    }


}
