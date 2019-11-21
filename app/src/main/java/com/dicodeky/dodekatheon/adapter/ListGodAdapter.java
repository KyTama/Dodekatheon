package com.dicodeky.dodekatheon.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dicodeky.dodekatheon.R;
import com.dicodeky.dodekatheon.model.God;

import java.util.ArrayList;

public class ListGodAdapter extends RecyclerView.Adapter<ListGodAdapter.ListViewHolder> {
    private ArrayList<God> listGod;

    public ListGodAdapter(ArrayList<God> list) {
        this.listGod = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_gods, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        God god = listGod.get(position);
        Glide.with(holder.itemView.getContext())
                .load(god.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(god.getName());
        holder.tvDetail.setText(god.getDetail());

    }

    @Override
    public int getItemCount() {
        return listGod.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        public ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
