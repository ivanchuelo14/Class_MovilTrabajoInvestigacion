package com.example.movil_taller1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.MediaController;
import android.widget.RatingBar;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;

public class RatingBarExample extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar_example);

        videoView = (VideoView) findViewById(R.id.videoView);
        videoView.setMediaController(new MediaController(this));
        String path = "android.resource://" + getPackageName() + "/" + R.raw.piano;
        videoView.setMediaController(new MediaController(this));
        Uri uri = Uri.parse(path);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();
        // initiate rating bar and a button
        final RatingBar simpleRatingBar = (RatingBar) findViewById(R.id.simpleRatingBar);
        Button submitButton = (Button) findViewById(R.id.btnRatingBar);
        // perform click event on button
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get values and then displayed in a toast
                String totalStars = "Numero Estrellas :: " + simpleRatingBar.getNumStars();
                String rating = "Tu calificacion es de :: " + simpleRatingBar.getRating() + "  Muchas Gracias!";
                Toast.makeText(getApplicationContext(), totalStars + "\n" + rating, Toast.LENGTH_LONG).show();
                Intent inMain = new Intent(RatingBarExample.this, MainActivity.class); // Metodo 1 para instanciar una actividad
                startActivity(inMain);
            }
        });
    }
}