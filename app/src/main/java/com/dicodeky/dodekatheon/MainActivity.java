package com.dicodeky.dodekatheon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.dicodeky.dodekatheon.adapter.ListGodAdapter;
import com.dicodeky.dodekatheon.model.God;
import com.dicodeky.dodekatheon.model.GodsData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvGods;
    private ArrayList<God> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvGods = findViewById(R.id.rv_gods);
        rvGods.setHasFixedSize(true);

        list.addAll(GodsData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvGods.setLayoutManager(new LinearLayoutManager(this));
        ListGodAdapter listGodAdapter = new ListGodAdapter(list);
        rvGods.setAdapter(listGodAdapter);
    }
}
