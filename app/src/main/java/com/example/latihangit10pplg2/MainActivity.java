package com.example.latihangit10pplg2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvMakananFav;
    List<String> listDataMakanan;

    AdapterListMakanan adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvMakananFav = findViewById(R.id.rvMakananFav);
        listDataMakanan = new ArrayList<>();
        listDataMakanan.add("Singkong goreng");
        listDataMakanan.add("Ayam Goreng");
        listDataMakanan.add("Ayam Bakar");
        listDataMakanan.add("Nasi goreng");
        listDataMakanan.add("Bubur Ayam");

        // call adapter class
        rvMakananFav.setLayoutManager(new LinearLayoutManager(this));
        adapter = new AdapterListMakanan(listDataMakanan, this);
        rvMakananFav.setAdapter(adapter);

    }
}