package com.jk.lab04_idnp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lista;
    private Adaptador adaptador;
    private ArrayList<Estudiante>arrayAlumnos;

    //private ArrayList <Estudiante>alumnos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista=(ListView)findViewById(R.id.listaAlumnos);
        adaptador=new Adaptador(this,GetArrayItems());
        lista.setAdapter(adaptador);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?>parent, View view,int position, long id){
                Intent i=new Intent(MainActivity.this, Activity_dos.class);
                i.putExtra("objetoData",arrayAlumnos.get(position));
                startActivity(i);
            }
        });
       /* ArrayList<Estudiante>listita=new ArrayList<Estudiante>();
        listita.add(new Estudiante("Cleofe","Huamani","2121"));
       // alumnos=new ArrayList<>();


        ArrayAdapter <Estudiante> adapter=new ArrayAdapter<Estudiante(MainActivity.this,android.R.layout.simple_list_item_1,listita );
        lista.setAdapter(adapter);*/

    }
    private ArrayList<Estudiante>GetArrayItems(){
        ArrayList<Estudiante>listItems=new ArrayList<>();
        listItems.add(new Estudiante("cleofe", "huamani","2323"));
        listItems.add(new Estudiante("cleofe", "huamani","2323"));
        listItems.add(new Estudiante("cleofe", "huamani","2323"));
        return listItems;
    }
}
