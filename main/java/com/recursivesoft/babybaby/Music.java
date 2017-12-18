package com.recursivesoft.babybaby;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Music extends AppCompatActivity{
    MediaPlayer mp;

    int playstopBtns[] = {R.id.startme , R.id.stopme, R.id.startbackwalk, R.id.stopbackwalk, R.id.startcry, R.id.stopcry,
            R.id.startcure, R.id.stopcure, R.id.startluv, R.id.stopluv, R.id.startrelove, R.id.stoprelove};

    int resMp3[] = {R.raw.sin, R.raw.moon, R.raw.shap, R.raw.sen, R.raw.wind, R.raw.shark};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        for (int btns : playstopBtns) {
            Button btn = (Button) findViewById(btns);
            btn.setOnClickListener(clickListener);
        }

    }

    View.OnClickListener clickListener = new View.OnClickListener() {

        public void onClick(View v) {

            switch (v.getId()) {

                case R.id.startme:
                    Play(0); break;
                case R.id.startbackwalk:
                    Play(1); break;
                case R.id.startcry:
                    Play(2); break;
                case R.id.startcure:
                    Play(3); break;
                case R.id.startluv:
                    Play(4); break;
                case R.id.startrelove:
                    Play(5); break;
                default :
                    Stop();
            }

        }

    };


    private void Play(int selNo){

        Stop();

        mp = MediaPlayer.create(Music.this, resMp3[selNo]);
        mp.start();
    }

    private void Stop(){

        if(mp!=null){
            mp.stop();
            mp = null;
        }

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Stop();
    }

}

