package com.recursivesoft.babybaby;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageButton btn = (ImageButton)findViewById(R.id.vaccin);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, Health.class);

                startActivity(intent);
            }
        });

        ImageButton btn2 = (ImageButton)findViewById(R.id.info);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this,Grow.class);
                startActivity(intent);
            }
        });

        ImageButton btn3 = (ImageButton)findViewById(R.id.music);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this,Music.class);
                startActivity(intent);
            }
        });


        ImageButton btn4 = (ImageButton)findViewById(R.id.shop);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this,ShopActivity.class);
                startActivity(intent);
            }
        });

    }



}