package com.example.gidviewdemojava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<MyItem> ds=new ArrayList<>();
        ds.add(new MyItem(R.mipmap.ic_launcher_round, "Launcher"));
        ds.add(new MyItem(R.mipmap.ic_launcher_round, "Settings"));
        ds.add(new MyItem(R.mipmap.ic_launcher_round, "Internet"));
        ds.add(new MyItem(R.mipmap.ic_launcher_round, "Location"));
        MyAdapter adapter=new MyAdapter(this,ds);
        ((GridView)findViewById(R.id.gridIcons)).setAdapter(adapter);
    }
}
