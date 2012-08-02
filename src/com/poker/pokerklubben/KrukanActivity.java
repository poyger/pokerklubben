package com.poker.pokerklubben;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

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
			// Skicka iväg en sms intent.			
            sendSmsIntent(krukanTurnering.getText());					
            }
        });    
    }    
    private void sendSmsIntent(CharSequence charSequence){
		Uri uri = Uri.parse("smsto:" + getString(R.string.krukanTelefonNummer)); 
		Intent intent = new Intent(Intent.ACTION_SENDTO, uri); 
		intent.putExtra("sms_body", charSequence);   
		startActivity(intent);
    }
}
