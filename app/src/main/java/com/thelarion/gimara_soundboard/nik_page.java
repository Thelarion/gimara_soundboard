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

public class nik_page extends AppCompatActivity {

    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nik_page);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("GiMaRa Soundboard");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        bt = (Button) findViewById(R.id.plays);
        final MediaPlayer plays = MediaPlayer.create(this, R.raw.plays);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plays.start();
            }
        });

        bt = (Button) findViewById(R.id.boy);
        final MediaPlayer boy = MediaPlayer.create(this, R.raw.boy);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boy.start();
            }
        });

        bt = (Button) findViewById(R.id.junge);
        final MediaPlayer junge = MediaPlayer.create(this, R.raw.junge);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                junge.start();
            }
        });

        bt = (Button) findViewById(R.id.lauft);
        final MediaPlayer lauft = MediaPlayer.create(this, R.raw.lauft);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lauft.start();
            }
        });

        bt = (Button) findViewById(R.id.schnell);
        final MediaPlayer schnell = MediaPlayer.create(this, R.raw.schnell);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                schnell.start();
            }
        });

        bt = (Button) findViewById(R.id.baron_nashor);
        final MediaPlayer baron_nashor = MediaPlayer.create(this, R.raw.baron_nashor);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                baron_nashor.start();
            }
        });

        bt = (Button) findViewById(R.id.easy_peasy);
        final MediaPlayer easy_peasy = MediaPlayer.create(this, R.raw.easy_peasy);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                easy_peasy.start();
            }
        });

        bt = (Button) findViewById(R.id.lache_1);
        final MediaPlayer lache_1 = MediaPlayer.create(this, R.raw.lache_1);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lache_1.start();
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