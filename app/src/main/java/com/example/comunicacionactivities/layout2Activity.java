package com.example.comunicacionactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class layout2Activity extends AppCompatActivity {

    private TextView nombreRecibido;
    private TextView apellidoRecibido;
    private TextView edadRecibida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout2);

        //linkeo los atributos con los elementos del xml
        this.nombreRecibido = findViewById(R.id.activity2TextViewNombre);
        this.apellidoRecibido = findViewById(R.id.activity2TextViewApellido);
        this.edadRecibida = findViewById(R.id.activity2TextViewEdad);

        //traigo los datos del bundle y los agrego a los textView
        Intent intentMainActivity = getIntent();

        //le saco el bundle al intent que recibi
        Bundle bundleRecibido = intentMainActivity.getExtras();

        //le saco al bundle los tres datos que contiene y los guardo en strings
        String nombre = bundleRecibido.getString("nombre");
        String apellido = bundleRecibido.getString("apellido");
        String edad = bundleRecibido.getString("edad");

        //asocio los datos recibidos a los text de los editText
        this.nombreRecibido.setText(" " + nombre);
        this.apellidoRecibido.setText(" " + apellido);
        this.edadRecibida.setText(" " + edad);

    }
}
