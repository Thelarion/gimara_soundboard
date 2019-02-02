package com.thelarion.gimara_soundboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bt;


    @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("GiMaRa Soundboard");
        setSupportActionBar(toolbar);



        bt = (Button)findViewById(R.id.jonas);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openjonas_page();
            }
        });

        bt = (Button)findViewById(R.id.nik);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennik_page();
            }
        });

        bt = (Button)findViewById(R.id.marvin);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmarvin_page();
            }
        });

        bt = (Button)findViewById(R.id.maurice);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmaurice_page();
            }
        });

        bt = (Button)findViewById(R.id.lucas);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlucas_page();
            }
        });

        bt = (Button)findViewById(R.id.passi);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpassi_page();
            }
        });

        bt = (Button)findViewById(R.id.zweitemain);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openzweitemain_page();
            }
        });


        }


    public void openjonas_page() {
        Intent intent = new Intent(this, jonas_page.class);
        startActivity(intent);
        }

    public void opennik_page() {
        Intent intent = new Intent(this, nik_page.class);
        startActivity(intent);
        }

    public void openmarvin_page() {
        Intent intent = new Intent(this, marvin_page.class);
        startActivity(intent);
        }

    public void openmaurice_page() {
        Intent intent = new Intent(this, maurice_page.class);
        startActivity(intent);
        }

    public void openlucas_page() {
        Intent intent = new Intent(this, lucas_page.class);
        startActivity(intent);
    }

    public void openpassi_page() {
        Intent intent = new Intent(this, passi_page.class);
        startActivity(intent);
    }

    public void openzweitemain_page() {
        Intent intent = new Intent(this, zweitemain_page.class);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
