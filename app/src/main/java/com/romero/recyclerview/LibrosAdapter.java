package com.romero.recyclerview;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Sara on 18/4/2018.
 */

public class LibrosAdapter extends RecyclerView.Adapter<LibrosAdapter.LibrosViewHolder> {

    private ArrayList<Libro> libros;

    @Override
    public LibrosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_cardview,parent,false);
        return (new LibrosViewHolder(v));
    }

    @Override
    public void onBindViewHolder(LibrosViewHolder holder, int position) {
        holder.name.setText(libros.get(position).getName());
        holder.img.setImageResource(libros.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return libros.size();
    }

    public static class LibrosViewHolder extends RecyclerView.ViewHolder{
        CardView card;
        TextView name;
        ImageView img;

        public LibrosViewHolder(View itemView){
            super(itemView);
            card=itemView.findViewById(R.id.card_view);
            name=itemView.findViewById(R.id.name);
            img=itemView.findViewById(R.id.img);
        }
    }

    public LibrosAdapter(ArrayList<Libro> libros){this.libros=libros;}

}

