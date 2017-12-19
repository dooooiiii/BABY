package com.recursivesoft.babybaby;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class HealthDetail extends AppCompatActivity {
    String[] ages = {"0~3개월", "3~6개월", "6~12개월",
            "12~18개월","18~24개월",
            "만 2세~"};

    String[] vaccin = {"결핵","B형 간염","뇌수막염",
            "소아마비", "폐렴구균","디프테리아",
            "파상풍", "백일해","수두",
            "홍역", "유행성이하선염","풍진",
            "일본뇌염","인풀루엔자","장티푸스"};
    String[] vAge = {"생후 4주 이내", "생후 6개월 이내", "2~15개월",
            "2개월~만 6세","2~59개월","2개월~만 12세",
            "2개월~만 12세", "2개월~만 12세","12~15개월",
            "12~15개월","12~15개월","12~15개월",
            "12~35개월","6개월~만 4세","24개월~만 12세"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_detail);
        Intent intent = getIntent();
        String age = intent.getStringExtra("age_put");

        TextView textView = (TextView)findViewById(R.id.txt);
        textView.setText(age);

        ListView listView = (ListView) findViewById(R.id.vaccinlist);

        int j = 0;
        for(int i=0;i<6;i++){
            if(age.equals(ages[i])) j=i;

        }
        ArrayList<vaccin_content> list = new ArrayList<>();
//        for(int i = 0; i < j; i++){
//            vaccin_content vaC = new vaccin_content(vAge[i],vaccin[i]);
//            list.add(vaC);
//        }
        if(j == 0){
            for(int i = 0; i < 8; i++){
              vaccin_content vaC = new vaccin_content(vAge[i],vaccin[i]);
             list.add(vaC);
             }
             vaccin_content vaC = new vaccin_content(vAge[13],vaccin[13]);
            list.add(vaC);
        }
        if(j == 1){
            for(int i = 1; i < 8; i++){
                vaccin_content vaC = new vaccin_content(vAge[i],vaccin[i]);
                list.add(vaC);
            }

            vaccin_content vaC = new vaccin_content(vAge[13],vaccin[13]);
            list.add(vaC);
        }
        if(j == 2){
            for(int i = 2; i < 14; i++){
                vaccin_content vaC = new vaccin_content(vAge[i],vaccin[i]);
                list.add(vaC);
            }
        }
        if(j == 3){
            for(int i = 2; i < 14; i++){
                vaccin_content vaC = new vaccin_content(vAge[i],vaccin[i]);
                list.add(vaC);
            }
        }
        if(j == 4){
            for(int i = 3; i < 8; i++){
                vaccin_content vaC = new vaccin_content(vAge[i],vaccin[i]);
                list.add(vaC);
            }
            vaccin_content vaC = new vaccin_content(vAge[13],vaccin[13]);
            list.add(vaC);
        }
        if(j == 5){
            for(int i = 3; i < 8; i++){
                vaccin_content vaC = new vaccin_content(vAge[i],vaccin[i]);
                list.add(vaC);
            }
            vaccin_content vaC = new vaccin_content(vAge[12],vaccin[12]);
            list.add(vaC);
            vaC = new vaccin_content(vAge[13], vaccin[13]);
            list.add(vaC);
            vaC = new vaccin_content(vAge[14],vaccin[14]);
            list.add(vaC);
        }

        VaccinAdapter adapter = new VaccinAdapter(this, R.layout.activity_health1_layout, R.id.txtAge1, list);

        listView.setAdapter(adapter);

    }
}
