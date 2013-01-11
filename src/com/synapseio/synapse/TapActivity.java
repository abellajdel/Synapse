package com.synapseio.synapse;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;


import com.nfcconn.synapse.R;

public class TapActivity extends Activity {	
	public final static String ITEM_ID = "com.nfconn.synapse.MESSAGE";

	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tap);
    }
    
    @Override
    protected void onRestart(){
    	super.onStart();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_tap, menu);
        return true;
    }
    
    public void fetchItem(View view){
    	
    	//To remove when using NFC
    	EditText editText = (EditText) findViewById(R.id.itemId);
    	String message = editText.getText().toString();
    	Intent intent = new Intent(this, ItemActivity.class);
    	intent.putExtra(ITEM_ID, message);
    	startActivity(intent);
    }
    
}
