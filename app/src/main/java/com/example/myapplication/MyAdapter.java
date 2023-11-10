package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
    private final MainActivity.Data[]data;
    private final Activity activity;
    private final int view;
    public MyAdapter (Activity activity, MainActivity.Data[] data , int view) {
        this.data =data;
        this.view =view;
        this.activity = activity;
    }
    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = activity.getLayoutInflater().inflate(view, parent,false);
        TextView name = convertView.findViewById(R.id.name);
        name.setText(data[position].name);
        ImageView imageView = convertView.findViewById(R.id.imageView);
        imageView.setImageResource(data[position].photo);
        return convertView;
    }

}
