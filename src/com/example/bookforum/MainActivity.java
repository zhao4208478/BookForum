package com.example.bookforum;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

	private Button register;
	private String registername;
	private String registerkey;
	private EditText user1;
	private EditText password1;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		register=(Button)findViewById(R.id.register);
	    listen();
	}
	

	private void listen() {
		// TODO Auto-generated method stub
		register.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				inputTitleDialog();
			}
		});
	}

	private void inputTitleDialog() {

		LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.register, null);
        
        registername = new String();
        registerkey = new String();
        
        user1 = (EditText)findViewById(R.id.user);
        password1 = (EditText)findViewById(R.id.password);        
        
        Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("×¢²á").setIcon(
                R.drawable.ic_launcher).setView(layout);
        builder.setPositiveButton("×¢²á", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
            /*	Log.i("11", ""+user1);
            	registername = user1.getText().toString();
            	Log.i("11", registername);
            	registerkey = password1.getText().toString();
            	Log.i("11", registerkey);*/
        }});
        builder.setNegativeButton("È¡Ïû", new DialogInterface.OnClickListener() {
            
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
            }
        });
        builder.show();
    }
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
