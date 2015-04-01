package com.galileoguzman.coffeedroid;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import java.lang.String;

import com.parse.*;

public class MainActivity extends ActionBarActivity {

    private EditText nombre;
    private EditText descripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.nombre = (EditText)findViewById(R.id.txtNombrePanaderia);
        this.descripcion = (EditText)findViewById(R.id.txtDescripcionPanaderia);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void btnGuardarEnParseSender(View view){

        //Crear un objeto de la clase ParseObject
        ParseObject testObject = new ParseObject("panaderia");
        //asignar valores a nuestro objeto


        String name = String.valueOf(this.nombre.getText());

        String desc = String.valueOf(this.descripcion.getText());

        testObject.put("nombrePanaderia", name );
        testObject.put("descripcion", desc);
        testObject.saveInBackground();


    }

}
