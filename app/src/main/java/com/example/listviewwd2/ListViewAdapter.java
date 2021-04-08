package com.example.listviewwd2;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.listviewwd2.model.Technology;

import java.util.ArrayList;
import java.util.List;

public class ListViewAdapter extends ArrayAdapter<Technology> {
    private Activity activity;
    private List<Technology> mlist;
    public ListViewAdapter(@NonNull Activity context, @NonNull List<Technology> list) {
        super(context, R.layout.list_custom, list);
        this.activity = context;
        this.mlist = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View v = inflater.inflate(R.layout.list_custom,parent,false);
        TextView tx1 = v.findViewById(R.id.title1);
        TextView tx2 = v.findViewById(R.id.sub1);
        TextView tx3 = v.findViewById(R.id.content1);
        ImageView i = v.findViewById(R.id.image1);

        Technology t = mlist.get(position);
        i.setImageResource(t.getImage());
        tx1.setText(t.getTitle());
        tx2.setText(t.getSub());
        tx3.setText(t.getContent());

        return v;
    }
}
