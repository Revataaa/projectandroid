package com.example.gamingstore;
import android.content.Context;
import android.content.Intent;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;



import com.bumptech.glide.Glide;

import java.util.ArrayList;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {
    private Context context;
    private ArrayList<Menu> menus;
    private Button btn;

    public MenuAdapter(Context mcontext, ArrayList<Menu> menusgame){
        context= mcontext;
        menus=menusgame;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_menu,parent,false);

        return new MenuViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {
        Menu menubaru= menus.get(position);
        String gambarbaru= menubaru.getGambar();
        String harga= menubaru.getharga();
        String nama= menubaru.getNama();

        holder.tvnamadata.setText(nama);
        holder.tvhargadata.setText(harga);

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
        public TextView  tvhargadata;
        public TextView tvnamadata;
        public TextView tvketeranganbarang;

        public MenuViewHolder(@NonNull View itemView) {
            super(itemView);
            imdata= itemView.findViewById(R.id.img_menu);
            tvhargadata= itemView.findViewById(R.id.tv_harga);
            tvnamadata=itemView.findViewById(R.id.tv_nama);
            tvketeranganbarang= itemView.findViewById(R.id.tv_ket);

            btn = itemView.findViewById(R.id.btn_details);
            btn.setOnClickListener( new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent = new Intent(context, DetailsActivity.class);
                    intent.putExtra(DetailsActivity.nama, menus.get(getAdapterPosition()).getNama());
                    intent.putExtra(DetailsActivity.harga, menus.get(getAdapterPosition()).getharga());
                    intent.putExtra(DetailsActivity.keterangan, menus.get(getAdapterPosition()).getKeterangan());
                    intent.putExtra(DetailsActivity.gambar, menus.get(getAdapterPosition()).getGambar());
                    context.startActivity(intent);
                }

            });
        }
    }
}