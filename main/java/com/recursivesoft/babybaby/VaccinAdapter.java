package com.recursivesoft.babybaby;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mac on 2017. 12. 17..
 */

public class VaccinAdapter extends ArrayAdapter<vaccin_content>{

    public VaccinAdapter(@NonNull Context context, int resource, @NonNull vaccin_content[] objects) {
        super(context, resource, objects);
    }

    public VaccinAdapter(HealthDetail healthDetail, int activity_healthD_layout, int txtAge1, ArrayList<vaccin_content> list) {
        super(healthDetail, activity_healthD_layout, txtAge1, list);
    }


    public View getView(int position, View convertView, ViewGroup parent){
        View itemView = super.getView(position, convertView, parent);

        TextView txtAge = (TextView)itemView.findViewById(R.id.txtAge1);
        TextView txtCh = (TextView)itemView.findViewById(R.id.txtCh1);

        vaccin_content member = getItem(position);
        txtAge.setText(member.vaccins);
        txtCh.setText(member.ages);

        return itemView;
    }
}
