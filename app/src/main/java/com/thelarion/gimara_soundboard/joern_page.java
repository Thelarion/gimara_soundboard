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

public class joern_page extends AppCompatActivity {

    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joern_page);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("GiMaRa Soundboard");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        bt = (Button) findViewById(R.id.milfhunters);
        final MediaPlayer milfhunters = MediaPlayer.create(this, R.raw.milfhunters);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                milfhunters.start();
            }
        });

        bt = (Button) findViewById(R.id.fickers);
        final MediaPlayer fickers = MediaPlayer.create(this, R.raw.fickers);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fickers.start();
            }
        });

        bt = (Button) findViewById(R.id.jagdrevier);
        final MediaPlayer jagdrevier = MediaPlayer.create(this, R.raw.jagdrevier);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jagdrevier.start();
            }
        });

        bt = (Button) findViewById(R.id.ganzjaehrig);
        final MediaPlayer ganzjaehrig = MediaPlayer.create(this, R.raw.ganzjaehrig);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ganzjaehrig.start();
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