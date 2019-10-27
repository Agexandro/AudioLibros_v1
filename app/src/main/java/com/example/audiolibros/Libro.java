package com.example.audiolibros;

import java.util.Vector;

public class Libro {
    public String titulo;
    public String autor;
    public String urlAudio;
    public String genero;
    public int recursoImagen;
    public Boolean novedad;
    public Boolean leido;
    public final static String G_TODOS = "Todos los géneros";
    public final static String G_Epico = "Poema épico";
    public final static String G_S_XIX = "Literatura siglo XIX";
    public final static String G_SUSPENSE = "Suspense";
    public final static String[] G_ARRAY = new String[]{G_TODOS,G_Epico,G_S_XIX,G_SUSPENSE};

    public Libro(String titulo, String autor, String urlAudio, String genero, int recursoImagen, Boolean novedad, Boolean leido) {
        this.titulo = titulo;
        this.autor = autor;
        this.urlAudio = urlAudio;
        this.genero = genero;
        this.recursoImagen = recursoImagen;
        this.novedad = novedad;
        this.leido = leido;
    }

    public static Vector<Libro> ejemploLibros(){
        final String SERVIDOR = "http://www.dcomg.upv.es/~jtomas/android/audiolibros/";
        Vector<Libro> libros = new Vector<Libro>();
        libros.add(new Libro("Kappa","Akutagawa",SERVIDOR+"kappa.mp3",Libro.G_S_XIX,R.drawable.kappa,false,false));
        libros.add(new Libro("Avecilla","Alas Clarin, Leopoldo",SERVIDOR+"avecilla.mp3",Libro.G_S_XIX,R.drawable.avecilla,true,false));
        libros.add(new Libro("Divina Comedia","Dante",SERVIDOR+"divina_comedia.mp3",Libro.G_Epico,R.drawable.divina_comedia,true,false));
        libros.add(new Libro("Viejo Pancho, El","Alonso y Trellez, José",SERVIDOR+"viejo_pancho.mp3",Libro.G_S_XIX,R.drawable.viejo_pancho,true,true));
        libros.add(new Libro("Canción de Rolando","Anónimo",SERVIDOR+"cancion_rolando.mp3",Libro.G_Epico,R.drawable.cancion_rolando,false,true));
        libros.add(new Libro("Matrimonio de sabuesos","Agata Christie",SERVIDOR+"matrim_sabuesos.mp3",Libro.G_SUSPENSE,R.drawable.matrim_sabuesos,false,false));
        libros.add(new Libro("La iliada","Homero",SERVIDOR+"la_iliada.mp3",Libro.G_Epico,R.drawable.la_iliada,true,false));

        return libros;
    }
}
