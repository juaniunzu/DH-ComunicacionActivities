package com.example.comunicacionactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nombreIngresado;
    private EditText apellidoIngresado;
    private EditText edadIngresada;
    private Button botonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //linkeo los atributos con los elementos del xml
        this.nombreIngresado = findViewById(R.id.editTextNombre);
        this.apellidoIngresado = findViewById(R.id.editTextApellido);
        this.edadIngresada = findViewById(R.id.editTextEdad);
        this.botonEnviar = findViewById(R.id.buttonEnviar);

        //seteo el listener del boton
        this.botonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //creo intent: desde donde hasta donde
                Intent intent = new Intent(MainActivity.this, layout2Activity.class);

                //creo bundle que va a llevar los datos ingresados
                Bundle datos = new Bundle();

                //agrego datos ingresados al bundle creado
                datos.putString("nombre", nombreIngresado.getText().toString());
                datos.putString("apellido", apellidoIngresado.getText().toString());
                datos.putString("edad", edadIngresada.getText().toString());

                //asocio el bundle con el intent creado arriba
                intent.putExtras(datos);

                //ejecuto el intent
                startActivity(intent);
                
            }
        });




    }
}
