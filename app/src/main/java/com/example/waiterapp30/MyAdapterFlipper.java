package com.example.waiterapp30;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapterFlipper extends BaseAdapter {
    Context context;
    int[] image;
    String[] name;
    LayoutInflater inflater;

    public MyAdapterFlipper(Context context, int[] image, String[] name) {
        this.context = context;
        this.image = image;
        this.name = name;
        inflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        view= inflater.inflate(R.layout.flipper_items,null);

        TextView textView = view.findViewById(R.id.names);
        ImageView imageView = view.findViewById(R.id.images);

        textView.setText(name[position]);
        imageView.setImageResource(image[position]);
        return view;
    }
}


