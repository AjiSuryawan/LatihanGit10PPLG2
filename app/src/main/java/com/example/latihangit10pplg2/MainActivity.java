package com.example.latihangit10pplg2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvMakananFav;
    List<ModelMakananFavorit> listDataMakanan;

    AdapterListMakanan adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvMakananFav = findViewById(R.id.rvMakananFav);
        listDataMakanan = new ArrayList<>();

        ModelMakananFavorit makanan1 = new ModelMakananFavorit();
        makanan1.setNamaMakanan("Singkong Keju");
        makanan1.setDescription("makanan ini terbuat dari singkong campur keju");
        makanan1.setImageFood(R.drawable.singkong);
        listDataMakanan.add(makanan1);

        ModelMakananFavorit makanan2 = new ModelMakananFavorit();
        makanan2.setNamaMakanan("Ayam Goreng");
        makanan2.setDescription("ayam goreng sambel geprek");
        makanan2.setImageFood(R.drawable.singkong);
        listDataMakanan.add(makanan2);


        // call adapter class
        rvMakananFav.setLayoutManager(new LinearLayoutManager(this));
        adapter = new AdapterListMakanan(listDataMakanan, this);
        rvMakananFav.setAdapter(adapter);

    }
}