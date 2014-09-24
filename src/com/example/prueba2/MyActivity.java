package com.example.prueba2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    private TextView texto;
    private Button diHolabt;
    private Button restablecerBt;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        texto = (TextView) findViewById(R.id.texto);
        diHolabt = (Button) findViewById(R.id.decirHolaBt);
        restablecerBt = (Button) findViewById(R.id.restablecerBt);

        diHolabt.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                texto.setText("Hola Mundo");
            }
        });

        restablecerBt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                texto.setText("holaaa");

            }
        });
    }
}
