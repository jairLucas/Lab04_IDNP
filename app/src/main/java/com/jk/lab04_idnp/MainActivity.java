package com.jk.lab04_idnp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private ListView listView1;
    private Button btnAgregar;

    ArrayList<String> lista_estudiantes= new ArrayList<String>();
    ArrayAdapter myAdapter;

    String item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView1 =  (ListView) findViewById(R.id.listView1);
        btnAgregar = (Button) findViewById(R.id.btnAgregar);

        lista_estudiantes.add("alejandro");
        lista_estudiantes.add("daniel");
        //configurando listview
        myAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, lista_estudiantes);
        listView1.setAdapter(myAdapter);

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this,ActivityRegistro.class);

                startActivity(i);
            }
        });

    }
}