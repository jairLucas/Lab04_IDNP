package com.jk.lab04_idnp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity_dos extends AppCompatActivity {
    private EditText nombre, apellidos, cui;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos);
      /*  nombre=(EditText)findViewById(R.id.nombre);
        apellidos=(EditText)findViewById(R.id.apellidos);
        cui=(EditText)findViewById(R.id.cui);*/
    }

 /*   public void Registrarse(View view){
        Intent i=new Intent(this, MainActivity.class);
        Intent intent=new Intent(this, MainActivity.class);
        intent.putExtra("dato1",nombre.getText().toString());
        intent.putExtra("dato2",apellidos.getText().toString());
        intent.putExtra("dato3", cui.getText().toString());
        startActivity(i);
    }*/
}
