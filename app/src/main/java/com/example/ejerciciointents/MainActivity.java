package com.example.ejerciciointents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.time.temporal.Temporal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView usuario = (TextView) findViewById(R.id.respuesta);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            usuario.setText(extras.getString("respuesta"));
        }else{
            usuario.setText("Problema al recoger tus datos");
        }

    }

    public void recogerDatosRegistro(View view){
        EditText usuario = (EditText) findViewById(R.id.input);

        Intent intent = new Intent(this, Main2.class);

        intent.putExtra("enviar",usuario.getText().toString());


        startActivity(intent);
    }

}