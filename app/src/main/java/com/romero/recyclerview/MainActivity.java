package com.romero.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    LibrosAdapter adapter;
    ArrayList<Libro> libros;
    LinearLayoutManager lManager;
    Button toastButton;
    public int lel=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        libros=new ArrayList<>();
        rv=findViewById(R.id.recycler);
        rv.setHasFixedSize(true);

        lManager = new LinearLayoutManager(this);
        rv.setLayoutManager(lManager);

        prepareSeries();
        adapter=new LibrosAdapter(libros, new LibrosAdapter.MyAdapterListener(){
            @Override
            public void toastOnClick(View v, int position) {
                Toast.makeText(getApplicationContext() ,libros.get(position).getDesc()+"\nPages: "+libros.get(position).getChaps() ,Toast.LENGTH_SHORT).show();

            }
        });
        rv.setAdapter(adapter);


    }

    public void prepareSeries(){
        String TAG = "Mensaje";
        libros=new ArrayList<>();
        libros.add(new Libro("La Reina Roja", "474", R.drawable.reinaroja, "First book of the saga written by Victoria Aveyard"));
        libros.add(new Libro("La Espada de Cristal", "548", R.drawable.espadacristal, " Second book of the saga written by Victoria Aveyard"));
        libros.add(new Libro("La Jaula del Rey", "596", R.drawable.jauladelrey, "Third book of the saga written by Victoria Aveyard"));

    }


}
