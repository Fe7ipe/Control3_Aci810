package com.control33;




import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;

import android.widget.EditText;

import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity1 extends Activity {
	
	 public final static String NAME_VALUE = "com.example.control33.NAME_VALUE";        
     public final static String SWITCH_VALUE ="com.example.control3.SWITCH_VALUE";
     public final static String RADIOBUTTON01_VALUE ="com.example.control33.RADIOBUTTON01_VALUE";
     public final static String RADIOBUTTON02_VALUE ="com.example.control33.RADIOBUTTON02_VALUE";
     public final static String RADIOBUTTON03_VALUE ="com.example.control33.RADIOBUTTON03_VALUE";
     public final static String SEEKBAR_VALUE ="com.example.control33.SEEKBAR_VALUE";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main1);
	}
					

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity1, menu);
		return true;
	}
	
	 public void onClick(View view) {               
		 
Intent i = new Intent(this, MainActivity2.class);                                


EditText nombreEditText = (EditText) findViewById(R.id.editText1);
String name = nombreEditText.getText().toString();


Switch switchEdit = (Switch) findViewById(R.id.switchView1);
Boolean switchEditslide = switchEdit.isChecked();


RadioButton rbEditText01 = (RadioButton) findViewById(R.id.r0);
Boolean rbclick0 = rbEditText01.isChecked();


RadioButton rbEditText02 = (RadioButton) findViewById(R.id.r1);
Boolean rbclick1 = rbEditText02.isChecked();


RadioButton rbEditText03 = (RadioButton) findViewById(R.id.r2);
Boolean rbclick2 = rbEditText03.isChecked();


SeekBar Seekbarslide = (SeekBar) findViewById(R.id.seekBar1);
Integer seekbaredit = Seekbarslide.getProgress();



SharedPreferences sharedPref = getSharedPreferences("app", Context.MODE_PRIVATE);                
SharedPreferences.Editor editor = sharedPref.edit();                

editor.putString(NAME_VALUE, name);        
editor.putBoolean(SWITCH_VALUE, switchEditslide);
editor.putBoolean(RADIOBUTTON01_VALUE, rbclick0);
editor.putBoolean(RADIOBUTTON02_VALUE, rbclick1);
editor.putBoolean(RADIOBUTTON03_VALUE, rbclick2);
editor.putInt(SEEKBAR_VALUE, seekbaredit);



editor.commit();


startActivity(i);
	 }

	 
	 

}
