package com.poker.pokerklubben;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.Preference.OnPreferenceChangeListener;
import android.widget.Toast;
 
public class PreferencesActivity extends PreferenceActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                addPreferencesFromResource(R.xml.preferences);
                
                /* Detta anv�nds ifall man vill lyssna p� en preferences �ndring
                 * vi beh�ver inte det just nu.               
                 * 
                Preference customPref = (Preference) findPreference("namnPref");
                customPref.setOnPreferenceChangeListener(new OnPreferenceChangeListener() {					
					@Override
					public boolean onPreferenceChange(Preference preference,
							Object newValue) {
							   System.out.println("POYAN::" + newValue);	
	                           SharedPreferences customSharedPreference = getSharedPreferences(
	                           "myCustomSharedPrefs", Activity.MODE_PRIVATE);
	                           SharedPreferences.Editor editor = customSharedPreference
	                           .edit();
	                           editor.putString("myCustomPref", "The preference has been clicked");
	                           editor.commit();
	                           return true;
					}
                });	*/
       }         
}