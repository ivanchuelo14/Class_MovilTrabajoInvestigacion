package com.example.movil_taller1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button btnRatingBarF, btnTabHost, btnGridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnRatingBarF = (Button)findViewById(R.id.btnRatingBar);
        btnTabHost = (Button)findViewById(R.id.btnTabHost);
        btnGridView = (Button)findViewById(R.id.btnGridView);

        btnRatingBarF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inRBE = new Intent(MainActivity.this, RatingBarExample.class); // Metodo 1 para instanciar una actividad
                startActivity(inRBE);
            }
        });

        btnTabHost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inTH = new Intent(MainActivity.this, TabHostExample.class); // Metodo 1 para instanciar una actividad
                startActivity(inTH);
            }
        });

        btnGridView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inGV= new Intent(MainActivity.this, GridViewExample.class); // Metodo 1 para instanciar una actividad
                startActivity(inGV);
            }
        });
    }
}