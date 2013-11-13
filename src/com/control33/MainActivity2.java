package com.control33;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.support.v4.app.NavUtils;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);
	
	
	 SharedPreferences sharedPref = getSharedPreferences("app", Context.MODE_PRIVATE);        
     
     String name = sharedPref.getString(MainActivity1.NAME_VALUE, "not set");        
     Boolean switchEditslide = (Boolean) sharedPref.getBoolean(MainActivity1.SWITCH_VALUE, true);
     Boolean  rbclick0 = (Boolean) sharedPref.getBoolean(MainActivity1.RADIOBUTTON01_VALUE, true);
     Boolean  rbclick1 = (Boolean) sharedPref.getBoolean(MainActivity1.RADIOBUTTON02_VALUE, true);
     Boolean rbclick2 = (Boolean) sharedPref.getBoolean(MainActivity1.RADIOBUTTON03_VALUE, true);
     int sbEdit = sharedPref.getInt(MainActivity1.SEEKBAR_VALUE, 0);

     TextView nameTextView = (TextView) findViewById(R.id.textView1);
     nameTextView.setText(name);

             
     Switch sw1 = (Switch) findViewById(R.id.switchView2);
     sw1.setChecked(switchEditslide);
     
     RadioButton radiobutton01  = (RadioButton) findViewById(R.id.r0result);
     radiobutton01.setChecked(rbclick0);
     

     RadioButton radiobutton02  = (RadioButton) findViewById(R.id.r1result);
     radiobutton02.setChecked(rbclick1);
     
     RadioButton rd03  = (RadioButton) findViewById(R.id.r2result);
     rd03.setChecked(rbclick2);
     
     SeekBar sb01 = (SeekBar) findViewById(R.id.seekBar2);
     sb01.setProgress(sbEdit);
     sb01.setEnabled(false);
}

     
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity2, menu);
		return true;
	}

	 @Override
     public boolean onOptionsItemSelected(MenuItem item) {
             switch (item.getItemId()) {
             case android.R.id.home:
                     
                     NavUtils.navigateUpFromSameTask(this);
                     return true;
             }
             return super.onOptionsItemSelected(item);
     }
}
