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

public class christopf_page extends AppCompatActivity {

    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_christopf_page);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("GiMaRa Soundboard");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        bt = (Button) findViewById(R.id.fotze);
        final MediaPlayer fotze = MediaPlayer.create(this, R.raw.fotze);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fotze.start();
            }
        });

        bt = (Button) findViewById(R.id.ashe);
        final MediaPlayer ashe = MediaPlayer.create(this, R.raw.ashe);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ashe.start();
            }
        });

        bt = (Button) findViewById(R.id.behindert);
        final MediaPlayer behindert = MediaPlayer.create(this, R.raw.behindert);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                behindert.start();
            }
        });

        bt = (Button) findViewById(R.id.isecht);
        final MediaPlayer isecht = MediaPlayer.create(this, R.raw.isecht);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isecht.start();
            }
        });

        bt = (Button) findViewById(R.id.mrchrispy);
        final MediaPlayer mrchrispy = MediaPlayer.create(this, R.raw.mrchrispy);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mrchrispy.start();
            }
        });

        bt = (Button) findViewById(R.id.nichts);
        final MediaPlayer nichts = MediaPlayer.create(this, R.raw.nichts);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nichts.start();
            }
        });

        bt = (Button) findViewById(R.id.peinlich);
        final MediaPlayer peinlich = MediaPlayer.create(this, R.raw.peinlich);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peinlich.start();
            }
        });

        bt = (Button) findViewById(R.id.schnelllaufen);
        final MediaPlayer schnelllaufen = MediaPlayer.create(this, R.raw.schnelllaufen);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                schnelllaufen.start();
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