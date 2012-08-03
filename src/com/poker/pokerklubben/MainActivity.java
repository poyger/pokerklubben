package com.poker.pokerklubben;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Starta Krukan Activity
        final Button buttonKrukan = (Button) findViewById(R.id.krukan);
        buttonKrukan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), KrukanActivity.class);
                startActivity(intent);           
            }
        });
        // Starta Oden Activity
        final Button buttonOden = (Button) findViewById(R.id.oden);
        buttonOden.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), OdenActivity.class);
                startActivity(intent);           
            }
        });
    }

    /* This is for settings menu*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public boolean onOptionsItemSelected (MenuItem item){    	
    	//check selected menu item
    	if(item.getItemId() == R.id.menu_settings)
    	{
            Intent settingsActivity = new Intent(getBaseContext(),PreferencesActivity.class);
            startActivity(settingsActivity);
    		return true;
    	}            	
    	return false;
    }	
}
