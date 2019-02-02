package com.thelarion.gimara_soundboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class zweitemain_page extends AppCompatActivity {

    private Button bt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zweitemain_page);


        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("GiMaRa Soundboard");
        setSupportActionBar(toolbar);



        bt = (Button)findViewById(R.id.inga);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinga_page();
            }
        });

        bt = (Button)findViewById(R.id.marcel);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmarcel_page();
            }
        });

        bt = (Button)findViewById(R.id.jörn);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openjoern_page();
            }
        });

        bt = (Button)findViewById(R.id.christopf);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openchristopf_page();
            }
        });

        bt = (Button)findViewById(R.id.timd);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentimd_page();
            }
        });

        bt = (Button)findViewById(R.id.oemer);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openoemer_page();
            }
        });

     /*   bt = (Button)findViewById(R.id.zweitemain);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openzweitemain_page();
            }
        }); */

        bt = (Button)findViewById(R.id.main);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmain();
            }
        });


    }


    public void openinga_page() {
        Intent intent = new Intent(this, inga_page.class);
        startActivity(intent);
    }

    public void openmarcel_page() {
        Intent intent = new Intent(this, marcel_page.class);
        startActivity(intent);
    }

    public void openjoern_page() {
        Intent intent = new Intent(this, joern_page.class);
        startActivity(intent);
    }

    public void openchristopf_page() {
        Intent intent = new Intent(this, christopf_page.class);
        startActivity(intent);
    }

    public void opentimd_page() {
        Intent intent = new Intent(this, timd_page.class);
        startActivity(intent);
    }

    public void openoemer_page() {
        Intent intent = new Intent(this, oemer_page.class);
        startActivity(intent);
    }

    public void openzweitemain_page() {
        Intent intent = new Intent(this, zweitemain_page.class);
        startActivity(intent);
    }

    public void openmain() {
        Intent intent = new Intent(this, MainActivity.class);
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
