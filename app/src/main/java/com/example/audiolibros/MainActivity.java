package com.example.audiolibros;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.audiolibros.fragments.DetalleFragment;
import com.example.audiolibros.fragments.SelectorFragment;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if ((findViewById(R.id.contenedor_pequeño)!=null) && (getSupportFragmentManager().findFragmentById(R.id.contenedor_pequeño)==null)){
            SelectorFragment primerFragment = new SelectorFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.contenedor_pequeño,primerFragment).commit();
            }
    }

    public void mostrarDetalle(int id){
        DetalleFragment detalleFragment = (DetalleFragment) getSupportFragmentManager().findFragmentById(R.id.detalle_fragment);

        if (detalleFragment != null){
            detalleFragment.ponInfoLibro(id);
        }else{
            DetalleFragment nuevoFragment = new DetalleFragment();
            Bundle args = new Bundle();
            args.putInt(DetalleFragment.ARG_ID_LIBRO,id);
            nuevoFragment.setArguments(args);
            FragmentTransaction transaccion = getSupportFragmentManager().beginTransaction();
            transaccion.replace(R.id.contenedor_pequeño,nuevoFragment);
            transaccion.addToBackStack(null);
            transaccion.commit();
        }
    }
}
