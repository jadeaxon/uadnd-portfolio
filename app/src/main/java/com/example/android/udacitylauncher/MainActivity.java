package com.example.android.udacitylauncher;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */
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


    //=============================================================================
    // Button Handlers

    // Responds to Sunshine app button tap.
    public void sunshineButtonHandler(View view) {
        System.out.println("Tapped sunshineButton!");
		this.makeToast("Sunshine");
	}

    // Responds to Spotify Streamer app button tap.
    public void spotifyButtonHandler(View view) {
        System.out.println("Tapped spotifyButton!");
		this.makeToast("Spotify Streamer");
    }

    // Responds to Scores app button tap.
    public void scoresButtonHandler(View view) {
        System.out.println("Tapped scoresButton!");
		this.makeToast("Scores");
    }

    // Responds to Library app button tap.
    public void libraryButtonHandler(View view) {
        System.out.println("Tapped libraryButton!");
		this.makeToast("Library");
    }

    // Responds to Build It Bigger app button tap.
    public void buildItBiggerButtonHandler(View view) {
        System.out.println("Tapped buildItBiggerButton!");
		this.makeToast("Built It Bigger");
    }

    // Responds to XYZ Reader app button tap.
    public void xyzReaderButtonHandler(View view) {
        System.out.println("Tapped xyzReaderButton!");
		this.makeToast("XYZ Reader");
    }

    // Responds to Captstone app button tap.
    public void capstoneButtonHandler(View view) {
        System.out.println("Tapped capstoneButton!");
		this.makeToast("Capstone");
    }


    //=============================================================================
    // Private Utility Methods
	
	// Pops up a simple toast.
	private void makeToast(CharSequence message) {
		// Basic toast.  No butter.
		Context context = getApplicationContext();
		int duration = Toast.LENGTH_SHORT;
		Toast toast = Toast.makeText(context, message, duration);
		toast.show();
	}


} // class MainActivity


