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

public class HealthAdapter extends ArrayAdapter<health_content>{

    public HealthAdapter(@NonNull Context context, int resource, @NonNull health_content[] objects) {
        super(context, resource, objects);
    }

    public HealthAdapter(Health health, int activity_health_layout, int txtAge, ArrayList<health_content> list) {
        super(health, activity_health_layout, txtAge, list);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View itemView = super.getView(position, convertView, parent);

        TextView txtAge = (TextView)itemView.findViewById(R.id.txtAge);
        TextView txtCh = (TextView)itemView.findViewById(R.id.txtCh);

        health_content member = getItem(position);
        txtAge.setText(member.ages);
        txtCh.setText(member.ch);

        return itemView;
    }
}
