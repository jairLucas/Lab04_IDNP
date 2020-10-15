package com.jk.lab04_idnp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class ActivityRegistro extends AppCompatActivity {

    EditText nombre,apellido,dni,cui,correo,edad,facultad,escuela;
    Button enviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre      = (EditText)findViewById(R.id.editNombre);
        apellido    = (EditText)findViewById(R.id.editApellido);
        dni         = (EditText)findViewById(R.id.editDni);
        cui         = (EditText)findViewById(R.id.editCui);
        correo      = (EditText)findViewById(R.id.editCorreo);
        edad        = (EditText)findViewById(R.id.editEdad);
        facultad    = (EditText)findViewById(R.id.editFacultad);
        escuela     = (EditText)findViewById(R.id.editEscuela);
        enviar      = (Button)findViewById(R.id.btnEnviar);

    }
}