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

public class marvin_page extends AppCompatActivity {

    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marvin_page);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("GiMaRa Soundboard");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        bt = (Button) findViewById(R.id.hoelle);
        final MediaPlayer hoelle = MediaPlayer.create(this, R.raw.hoelle);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hoelle.start();
            }
        });

        bt = (Button) findViewById(R.id.sagen);
        final MediaPlayer sagen = MediaPlayer.create(this, R.raw.sagen);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sagen.start();
            }
        });

        bt = (Button) findViewById(R.id.kein_gott);
        final MediaPlayer kein_gott = MediaPlayer.create(this, R.raw.kein_gott);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kein_gott.start();
            }
        });

        bt = (Button) findViewById(R.id.kirche);
        final MediaPlayer kirche = MediaPlayer.create(this, R.raw.kirche);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kirche.start();
            }
        });

        bt = (Button) findViewById(R.id.lueneburg_town);
        final MediaPlayer lueneburg_town = MediaPlayer.create(this, R.raw.lueneburg_town);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lueneburg_town.start();
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