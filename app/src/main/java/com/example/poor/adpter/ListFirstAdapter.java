package com.example.poor.adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.poor.R;


public class ListFirstAdapter extends BaseAdapter {
    Context context;
    public ListFirstAdapter(Context context1) {
        context=context1;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
//        View view1= LayoutInflater.from(context).inflate(R.layout.fristlist,null);
        return null;
    }
}
