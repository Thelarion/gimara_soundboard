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

public class oemer_page extends AppCompatActivity {

    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oemer_page);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("GiMaRa Soundboard");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        bt = (Button) findViewById(R.id.lacheoemer);
        final MediaPlayer lacheoemer = MediaPlayer.create(this, R.raw.lacheoemer);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lacheoemer.start();
            }
        });

        bt = (Button) findViewById(R.id.abgelehnt);
        final MediaPlayer abgelehnt = MediaPlayer.create(this, R.raw.abgelehnt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abgelehnt.start();
            }
        });

        bt = (Button) findViewById(R.id.lacheoemer2);
        final MediaPlayer lacheoemer2 = MediaPlayer.create(this, R.raw.lacheoemer2);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lacheoemer2.start();
            }
        });

        bt = (Button) findViewById(R.id.neeein);
        final MediaPlayer neeein = MediaPlayer.create(this, R.raw.neeein);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                neeein.start();
            }
        });

        bt = (Button) findViewById(R.id.ohnein);
        final MediaPlayer ohnein = MediaPlayer.create(this, R.raw.ohnein);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ohnein.start();
            }
        });

        bt = (Button) findViewById(R.id.omg);
        final MediaPlayer omg = MediaPlayer.create(this, R.raw.omg);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                omg.start();
            }
        });

        bt = (Button) findViewById(R.id.upsupsups);
        final MediaPlayer upsupsups = MediaPlayer.create(this, R.raw.upsupsups);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                upsupsups.start();
            }
        });

        bt = (Button) findViewById(R.id.wieso);
        final MediaPlayer wieso = MediaPlayer.create(this, R.raw.wieso);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wieso.start();
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