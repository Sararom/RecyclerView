package com.romero.recyclerview;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Sara on 18/4/2018.
 */

public class LibrosAdapter extends RecyclerView.Adapter<LibrosAdapter.LibrosViewHolder> {

    private ArrayList<Libro> libros;

    public static MyAdapterListener onClickListener;

    public interface MyAdapterListener {

        void toastOnClick(View v, int position);
    }


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
        Button toast;

        public LibrosViewHolder(View itemView){
            super(itemView);
            card=itemView.findViewById(R.id.card_view);
            name=itemView.findViewById(R.id.name);
            img=itemView.findViewById(R.id.img);
            toast=itemView.findViewById(R.id.button);

            toast.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    onClickListener.toastOnClick(v, getAdapterPosition());
                }
            });

        }
    }

    public LibrosAdapter(ArrayList<Libro> libros,MyAdapterListener listener){
        this.libros=libros;
        onClickListener=listener;
    }

}

