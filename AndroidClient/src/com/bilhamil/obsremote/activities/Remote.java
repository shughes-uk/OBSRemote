package com.bilhamil.obsremote.activities;

import com.bilhamil.obsremote.R;
import com.bilhamil.obsremote.R.layout;
import com.bilhamil.obsremote.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Remote extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remote);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.remote, menu);
        return true;
    }
    
}