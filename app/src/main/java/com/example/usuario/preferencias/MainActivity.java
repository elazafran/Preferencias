package com.example.usuario.preferencias;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // lo hacemos aqui para pq ya tiene todos los elementos con los id
        btn = (Button) findViewById(R.id.verPreferencias);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences misPreferencias = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
                //ponemos defalutl por si nos equivocamos en la key
                Boolean rebote = misPreferencias.getBoolean("rebote",false);

                String mostrarPreferencias = rebote.toString();

                Toast.makeText(MainActivity.this, mostrarPreferencias , Toast.LENGTH_SHORT).show();

            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_settings, menu);

        //siempre que ponemos codigo delvolvemos un true
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.settings) {
            //Toast.makeText(this, "pulsamos en settings", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this, OpcionesActivity.class));
            return true;
        } 
        return super.onOptionsItemSelected(item);
    }
    
       
}
