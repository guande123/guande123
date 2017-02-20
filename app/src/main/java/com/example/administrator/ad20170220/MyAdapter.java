package com.example.administrator.ad20170220;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/2/20 0020.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    private ArrayList<Dog> mDogList;
    public MyAdapter(ArrayList<Dog> mDogList){
        this.mDogList = mDogList;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item,parent,false));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
holder.mImageView.setImageResource(mDogList.get(position).img);
        holder.mTextView.setText(mDogList.get(position).name);
    }

    @Override
    public int getItemCount() {
        return mDogList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
         TextView mTextView;
        ImageView mImageView;
        public MyViewHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.textview);
            mImageView = (ImageView) itemView.findViewById(R.id.imageview);
        }
    }
}
