package com.thelarion.gimara_soundboard;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class maurice_page extends AppCompatActivity {

    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maurice_page);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("GiMaRa Soundboard");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        bt = (Button) findViewById(R.id.splitpush);
        final MediaPlayer splitpush = MediaPlayer.create(this, R.raw.splitpush);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                splitpush.start();
            }
        });

        bt = (Button) findViewById(R.id.bereit);
        final MediaPlayer bereit = MediaPlayer.create(this, R.raw.bereit);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bereit.start();
            }
        });

        bt = (Button) findViewById(R.id.buttplug);
        final MediaPlayer buttplug = MediaPlayer.create(this, R.raw.buttplug);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttplug.start();
            }
        });

        bt = (Button) findViewById(R.id.alta_geil);
        final MediaPlayer alta_geil = MediaPlayer.create(this, R.raw.alta_geil);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alta_geil.start();
            }
        });

        bt = (Button) findViewById(R.id.ja_gg);
        final MediaPlayer ja_gg = MediaPlayer.create(this, R.raw.ja_gg);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ja_gg.start();
            }
        });

        bt = (Button) findViewById(R.id.traenen);
        final MediaPlayer traenen = MediaPlayer.create(this, R.raw.traenen);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                traenen.start();
            }
        });

        bt = (Button) findViewById(R.id.asozial);
        final MediaPlayer asozial = MediaPlayer.create(this, R.raw.asozial);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                asozial.start();
            }
        });

        bt = (Button) findViewById(R.id.sumpf);
        final MediaPlayer sumpf = MediaPlayer.create(this, R.raw.sumpf);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumpf.start();
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