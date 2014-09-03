package com.example.babyfeeder;

import com.example.babyfeeder.NameDialog.IEventHandler;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;

public class NameDialog extends Dialog implements OnClickListener{

	private IEventHandler listner;

	public NameDialog(Context context) {
		super(context);		
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		this.setContentView(R.layout.activity_dialog);
		
		
		Button oliverButton = (Button)findViewById(R.id.oliverButton);
		Button vilmaButton = (Button)findViewById(R.id.vilmaButton);
		
		oliverButton.setOnClickListener(this);
		vilmaButton.setOnClickListener(this);
	};

	@Override
	public void onClick(View v) {
		
		if(listner == null) {
			this.dismiss();
			Log.e("", "No event listner added");
			return;
		}
		
		switch(v.getId()){
		case R.id.oliverButton:
			listner.callback("Oliver");
			break;
		case R.id.vilmaButton:
			listner.callback("Vilma");
			break;
		}
		
		this.dismiss();
	}
	
	
	public interface IEventHandler{
		void callback(String result);
	
	}

	public void setListner(IEventHandler listner) {
		this.listner = listner;		
	}

}
