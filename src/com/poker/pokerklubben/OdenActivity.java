package com.poker.pokerklubben;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class OdenActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oden);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_oden, menu);
        return true;
    }
}
