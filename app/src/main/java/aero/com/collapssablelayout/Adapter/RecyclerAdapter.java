package aero.com.collapssablelayout.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import aero.com.collapssablelayout.R;

/**
 * Created by WaiYan on 8/9/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>{
private ArrayList<String> stringArrayList;
    private Context mContext;

    public RecyclerAdapter(ArrayList<String> stringArrayList, Context mContext) {
        this.stringArrayList = stringArrayList;
        this.mContext = mContext;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.MyViewHolder holder, int position) {
holder.title.setText(stringArrayList.get(position));
        if(position%2==0)
            holder.title.setTextColor(Color.BLUE);
    }

    @Override
    public int getItemCount() {
        return  stringArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView title;

        public MyViewHolder(View itemView) {
            super(itemView);
            title=(TextView)itemView.findViewById(R.id.textView);

        }
    }



}
