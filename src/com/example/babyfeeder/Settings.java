package com.example.babyfeeder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Settings extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);
		
		Intent intent = getIntent();
		
		// Setup name line
		LinearLayout nameLine = (LinearLayout)findViewById(R.id.nameLine);
		ImageView nameImageView = (ImageView)nameLine.findViewById(R.id.settingsLineImage);
		nameImageView.setImageResource(R.drawable.user_icon);
		EditText nameEditText = (EditText)nameLine.findViewById(R.id.settingsLineEditText);
		nameEditText.setText(intent.getStringExtra("Name"));
		nameEditText.setEnabled(false);
		
		// Setup weight line
		LinearLayout weightLine = (LinearLayout)findViewById(R.id.weightLine);
		ImageView weightImageView = (ImageView)weightLine.findViewById(R.id.settingsLineImage);
		weightImageView.setImageResource(R.drawable.scale3);
		EditText weightEditText = (EditText)weightLine.findViewById(R.id.settingsLineEditText);
		weightEditText.requestFocus();
		TextView weightUnitTextView = (TextView)weightLine.findViewById(R.id.settingsLineUnitText);
		weightUnitTextView.setText("g");
		
		// Setup goal line
		LinearLayout goalLine = (LinearLayout)findViewById(R.id.goalLine);
		ImageView goalImageView = (ImageView)goalLine.findViewById(R.id.settingsLineImage);
		goalImageView.setImageResource(R.drawable.bottle_image);
		EditText goalEditText = (EditText)goalLine.findViewById(R.id.settingsLineEditText);
		TextView goalUnitTextView = (TextView)goalLine.findViewById(R.id.settingsLineUnitText);
		goalUnitTextView.setText("/day");
	}
	
	public void saveButtonOnClick(View v){
		Settings.this.finish();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.settings, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
