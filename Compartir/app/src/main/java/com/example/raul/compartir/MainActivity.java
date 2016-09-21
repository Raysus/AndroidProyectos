package com.example.raul.compartir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button  botonFacebook, botonTwitter, botonWhatsapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //asignamos a los botones e la actividad los botones del diseño.
        //el error se corregir al parsear

        botonFacebook = (Button) findViewById(R.id.buttonFacebook);
        botonTwitter = (Button) findViewById(R.id.buttontwitter);
        botonWhatsapp = (Button) findViewById(R.id.buttonwhatsapp);

        //ahora le asignamos la accion a relizar a los botones


        botonFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");

                intent.setPackage("com.facebook.katana");
                startActivity(intent);
            }
        });

        botonTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");

                //Para especificar la red social especifica se le asigna en esta parte
                intent.setPackage("com.twitter.android");
                startActivity(intent);
            }
        });

        botonWhatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");

                intent.setPackage("com.whatsapp");
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}