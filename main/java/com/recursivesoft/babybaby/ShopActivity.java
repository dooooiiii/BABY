package com.recursivesoft.babybaby;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ShopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        ImageButton img1 = (ImageButton)findViewById(R.id.imageButton);
        ImageButton img2 = (ImageButton)findViewById(R.id.imageButton2);
        ImageButton img3 = (ImageButton)findViewById(R.id.imageButton3);

        img1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShopActivity.this, Shop1.class);
                startActivity(intent);
            }
        });

        img2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(ShopActivity.this, Shop2.class);
                startActivity(intent2);
            }
        });

        img3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(ShopActivity.this, Shop3.class);
                startActivity(intent3);
            }
        });

    }



}
