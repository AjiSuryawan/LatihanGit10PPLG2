package com.example.latihangit10pplg2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterListMakanan extends RecyclerView.Adapter<AdapterListMakanan.ViewHolder>{

    List<ModelMakananFavorit> listData;
    private LayoutInflater mInflater;;

    public AdapterListMakanan(List<ModelMakananFavorit> listData, Context context){
        this.listData = listData;
        this.mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public AdapterListMakanan.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.recyclerview_row, parent, false);
        return new ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull AdapterListMakanan.ViewHolder holder, int position) {
        ModelMakananFavorit makanan = listData.get(position);
        holder.tvMakananFavorite.setText(makanan.getNamaMakanan());
        holder.tvDescription.setText(makanan.getDescription());
        holder.ivMakananFav.setImageResource(makanan.getImageFood());

    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvMakananFavorite;
        TextView tvDescription;
        ImageView ivMakananFav;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvMakananFavorite = itemView.findViewById(R.id.tvMakananFav);
            tvDescription = itemView.findViewById(R.id.tvDescription);
            ivMakananFav = itemView.findViewById(R.id.ivMakananFav);
        }
    }
}
