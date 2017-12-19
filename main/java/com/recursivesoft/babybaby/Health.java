package com.recursivesoft.babybaby;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;


public class Health extends AppCompatActivity {
    String[] ages = {"0~3개월", "3~6개월", "6~12개월",
            "12~18개월","18~24개월",
            "만 2세~"};
    String[] ch = {"턱을 들고 가슴을 들어요", "누워서 발차거나 뒤집기를 해요", "뽈뽈 기어다니거나 느릿하게 걸음마해요",
            "물건을 던지고 계단을 기어 내려올 수 있어요", "점프나 달릴 수 있고 손잡이를 돌려요", "블록쌓기도 장난감도 잘 가지고 놀고 달리기도 잘해요" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);

        ListView listView = (ListView) findViewById(R.id.agelist);

        ArrayList<health_content> list = new ArrayList<>();
        for(int i = 0; i< ages.length; i++){
            health_content age = new health_content(ages[i],ch[i]);
            list.add(age);
        }
        HealthAdapter adapter = new HealthAdapter(this, R.layout.activity_health_layout, R.id.txtAge, list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Health.this, HealthDetail.class);
                intent.putExtra("age_put",ages[i]);

                startActivity(intent);
            }
        });

    }
}
