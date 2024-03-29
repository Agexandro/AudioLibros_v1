package com.example.audiolibros;

import android.app.Application;

import androidx.recyclerview.widget.RecyclerView;

import java.util.Vector;

public class Aplicacion extends Application {
private Vector<Libro> vectorLibros;
private AdaptadorLibros adaptador;

@Override
    public void  onCreate() {
    super.onCreate();
    vectorLibros = Libro.ejemploLibros();
    adaptador = new AdaptadorLibros(this, vectorLibros);

}

public AdaptadorLibros getAdaptador(){
    return adaptador;
}

public Vector<Libro> getVectorLibros(){
return vectorLibros;
}

}
