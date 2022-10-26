package com.example.ejerciciointents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Main2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad2_main);
        Bundle extras = getIntent().getExtras();
        TextView texto = (TextView) findViewById(R.id.textoIncial);
        String usuario;
        if (extras != null) {
            usuario= extras.getString("enviar");
            texto.setText(usuario+"");
        }else{
            texto.setText("Problema al recoger tus datos");
        }
    }

    public void recogerDatosRegistro(View view){
        EditText usuario = (EditText) findViewById(R.id.responder);

        Intent intent = new Intent(this, MainActivity.class);

        intent.putExtra("respuesta",usuario.getText().toString());
        startActivity(intent);
        finish();

    }
}
