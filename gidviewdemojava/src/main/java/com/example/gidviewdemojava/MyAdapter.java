package com.example.gidviewdemojava;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by LENOVO on 01/04/2018.
 */

public class MyAdapter extends BaseAdapter{
    private final Context context;
    private final ArrayList<MyItem> ds;
    private LayoutInflater inflater;
    public MyAdapter(Context context, ArrayList<MyItem> ds){
        this.context=context;
        this.ds=ds;

        inflater=LayoutInflater.from(context);
    }
    @Override
    public int getCount() {

        return ds.size();
    }

    @Override
    public Object getItem(int position) {

        return ds.get(position);
    }

    @Override
    public long getItemId(int position) {

        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=inflater.inflate(R.layout.grid_item,parent,false);
       /* View view=null;
        if(convertView==null)
                view=inflater.inflate(R.layout.grid_item,parent,false);
        else view=convertView;*/

        ((ImageView)view.findViewById(R.id.imgIc)).setImageResource(ds.get(position).img);
        ((TextView)view.findViewById(R.id.txtNm)).setText(ds.get(position).txt);
        return view;
    }
}
