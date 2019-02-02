package com.thelarion.gimara_soundboard;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class passi_page extends AppCompatActivity {

    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passi_page);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("GiMaRa Soundboard");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        bt = (Button) findViewById(R.id.vodka);
        final MediaPlayer vodka = MediaPlayer.create(this, R.raw.vodka);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vodka.start();
            }
        });

        bt = (Button) findViewById(R.id.spiel);
        final MediaPlayer spiel = MediaPlayer.create(this, R.raw.spiel);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spiel.start();
            }
        });

        bt = (Button) findViewById(R.id.geil_alter);
        final MediaPlayer geil_alter = MediaPlayer.create(this, R.raw.geil_alter);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                geil_alter.start();
            }
        });

        bt = (Button) findViewById(R.id.back);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }
}