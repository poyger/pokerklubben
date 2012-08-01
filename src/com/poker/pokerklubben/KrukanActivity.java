package com.poker.pokerklubben;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class KrukanActivity extends Activity {
	
	private RadioGroup krukanTurneringar;
	private RadioButton krukanTurnering;
	private Button buttonKrukan;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_krukan);
        krukanTurneringar = (RadioGroup) findViewById(R.id.krukanTurneringar);
        buttonKrukan = (Button) findViewById(R.id.krukanAnmallTurnering);    	
        buttonKrukan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
		    // get selected radio button from radioGroup
			int selectedId = krukanTurneringar.getCheckedRadioButtonId();
 
			// find the radiobutton by returned id
			krukanTurnering = (RadioButton) findViewById(selectedId);
			
			// TODO Plockat ut vald tuneringar, nu ska vi skickat ett SMS och anmälla oss till denna 
			// Turnering
			Toast.makeText(KrukanActivity.this,
					krukanTurnering.getText(), Toast.LENGTH_SHORT).show();
            
            }
        });

    
    }

 

}
