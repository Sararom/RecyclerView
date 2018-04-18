package com.romero.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    LibrosAdapter adapter;
    ArrayList<Libro> libros;
    LinearLayoutManager lManager;
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
        adapter=new LibrosAdapter(libros);
        rv.setAdapter(adapter);
    }

    public void prepareSeries(){
        String TAG = "Mensaje";
        libros=new ArrayList<>();
        libros.add(new Libro("La Reina Roja", "474", R.drawable.reinaroja, "Book saga written by Victoria Aveyard"));
        libros.add(new Libro("La Espada de Cristal", "548", R.drawable.espadacristal, "Book saga written by Victoria Aveyard"));
        libros.add(new Libro("La Jaula del Rey", "596", R.drawable.jauladelrey, "Book saga written by Victoria Aveyard"));

    }
}
