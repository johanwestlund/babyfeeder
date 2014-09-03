package com.example.babyfeeder;

import com.example.babyfeeder.NameDialog.IEventHandler;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity{
	
	User Oliver;
	User Vilma;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Oliver = new User("Oliver");
        Vilma = new User("Vilma");
        Oliver.setWeight(6000);
        
        TextView oliverWeight = (TextView)(findViewById(R.id.OliverLayout).findViewById(R.id.weightTextView));
        oliverWeight.setText(String.valueOf(Oliver.getWeight()) + " g");
   }

    public void settingsButtonClick(View view){
    	
    	final NameDialog settings = new NameDialog(this);
    		
    	settings.setListner(new IEventHandler() {
			@Override
			public void callback(String result) {
				Intent intent = new Intent(MainActivity.this, Settings.class);
				intent.putExtra("Name", result);
				startActivity(intent);
			}
		});
    	
    	settings.setTitle("Settings");
    	
    	settings.show();
    }
    
    @Override
    protected void onPause(){
    	super.onPause();
    	
    	Log.i("INFO", "PAUSE");
    }

    @Override
    protected void onResume(){
    	super.onResume();
    	
    	Log.i("INFO", "RESUME");
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
