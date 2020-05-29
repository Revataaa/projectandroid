package com.example.gamingstore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {
    private Context context;
    private ArrayList<Menu>  menus;

    public MenuAdapter(Context mcontext, ArrayList<Menu> menusgame){
        context=mcontext;
        menus=menusgame;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.item_menu,parent,false);
        return new MenuViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {
        Menu menubaru= menus.get(position);
        String gambarbaru= menubaru.getGambar();
        String deskripsi= menubaru.getDes();
        String nama= menubaru.getNama();

        holder.tvnamadata.setText(nama);
        holder.tvdeskripsidata.setText(deskripsi);

        Glide
                .with(context)
                .load(gambarbaru)
                .centerCrop()
                .into(holder.imdata);
    }

    @Override
    public int getItemCount() {
        return menus.size();
    }

    public class MenuViewHolder extends RecyclerView.ViewHolder {
        public ImageView imdata;
        public TextView  tvdeskripsidata;
        public TextView tvnamadata;

        public MenuViewHolder(@NonNull View itemView) {
            super(itemView);
            imdata= itemView.findViewById(R.id.img_menu);
            tvdeskripsidata= itemView.findViewById(R.id.tv_des);
            tvnamadata=itemView.findViewById(R.id.tv_nama);


        }
    }
}
