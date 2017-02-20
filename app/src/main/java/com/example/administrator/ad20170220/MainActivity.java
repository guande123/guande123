package com.example.administrator.ad20170220;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
 private RecyclerView mRecyclerView;
    private RecyclerView mRecyclerView2;
    private MyAdapter mMyAdapter;
    private ArrayList<Dog> mDogList = new ArrayList<Dog>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDogList();
        initRecyclerView();
        initRecyclerView2();
    }

    private void initRecyclerView2() {
        mRecyclerView2 = (RecyclerView) findViewById(R.id.recyclerview2);
        StaggeredGridLayoutManager sglm = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView2.setLayoutManager(sglm);
        mRecyclerView2.setAdapter(mMyAdapter = new MyAdapter(mDogList));
    }

    private void initDogList() {
            mDogList.add(new Dog("dog1",R.mipmap.dog1));
        mDogList.add(new Dog("dog2222222222222222222222",R.mipmap.dog2));
        mDogList.add(new Dog("dog3",R.mipmap.dog3));
        mDogList.add(new Dog("dog4",R.mipmap.dog4));
        mDogList.add(new Dog("dog5",R.mipmap.dog5));
        mDogList.add(new Dog("dog666666666666666666666",R.mipmap.dog6));
        mDogList.add(new Dog("dog7",R.mipmap.dog7));
        mDogList.add(new Dog("dog8",R.mipmap.dog8));
        mDogList.add(new Dog("dog9",R.mipmap.dog9));
        mDogList.add(new Dog("dog10",R.mipmap.dog10));
     }

    private void initRecyclerView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRecyclerView.setLayoutManager(llm);
        mRecyclerView.setAdapter(mMyAdapter = new MyAdapter(mDogList));
    }
}
