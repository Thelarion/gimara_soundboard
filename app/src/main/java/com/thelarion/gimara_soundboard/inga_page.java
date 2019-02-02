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

public class inga_page extends AppCompatActivity {

    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inga_page);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("GiMaRa Soundboard");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        bt = (Button) findViewById(R.id.fresse);
        final MediaPlayer fresse = MediaPlayer.create(this, R.raw.fresse);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fresse.start();
            }
        });

        bt = (Button) findViewById(R.id.hut);
        final MediaPlayer hut = MediaPlayer.create(this, R.raw.hut);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hut.start();
            }
        });

        bt = (Button) findViewById(R.id.laggt);
        final MediaPlayer laggt = MediaPlayer.create(this, R.raw.laggt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                laggt.start();
            }
        });

        bt = (Button) findViewById(R.id.lebe);
        final MediaPlayer lebe = MediaPlayer.create(this, R.raw.lebe);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lebe.start();
            }
        });

        bt = (Button) findViewById(R.id.neinoah);
        final MediaPlayer neinoah = MediaPlayer.create(this, R.raw.neinoah);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                neinoah.start();
            }
        });

        bt = (Button) findViewById(R.id.oah);
        final MediaPlayer oah = MediaPlayer.create(this, R.raw.oah);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oah.start();
            }
        });

        bt = (Button) findViewById(R.id.scheisse);
        final MediaPlayer scheisse = MediaPlayer.create(this, R.raw.scheisse);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scheisse.start();
            }
        });


        bt = (Button) findViewById(R.id.woah);
        final MediaPlayer woah = MediaPlayer.create(this, R.raw.woah);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                woah.start();
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