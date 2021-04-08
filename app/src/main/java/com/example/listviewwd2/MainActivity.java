package com.example.listviewwd2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.listviewwd2.model.Technology;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
 private ListView listView;
 private ListViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);
        adapter = new ListViewAdapter(this, getAll());
        listView.setAdapter(adapter);
    }

    private List<Technology> getAll() {
        List<Technology> t = new ArrayList<>();
        t.add(new Technology(R.drawable.ip13,"iphin","dasd","asd"));
        t.add(new Technology(R.drawable.ip13,"iphin","dasd","asd"));
        t.add(new Technology(R.drawable.ip13,"iphin","dasd","asd"));
        t.add(new Technology(R.drawable.ip13,"iphin","dasd","asd"));
        t.add(new Technology(R.drawable.ip13,"iphin","dasd","asd"));
        t.add(new Technology(R.drawable.ip13,"iphin","dasd","asd"));
        return t;
    }
}