package com.gdelac.ticket;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ticket extends Activity {
	
	private static final String CUR_SERV = "currentService";
	private static final String NUMBER = "currentService_number";
	private static final String MESSAGE = "currentService_message";
	
	
	private TextView mServName;
	private Button mSetData;
	private EditText mInputServName;
	
	
	private OnClickListener mSetDataListener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			
			mServName.setText(mInputServName.getText().toString());
			
		}
	};
	
	
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.main);
        
        mSetData = (Button)findViewById(R.id.Button01);
        mInputServName = (EditText)findViewById(R.id.EditText01);
        mServName = (TextView) findViewById(R.id.TextView02);

        
		mSetData.setOnClickListener(mSetDataListener);
        
        
    }
    
    
    
    
   
    @Override
    public void onResume(){
    	super.onResume();
    	

    	
    	SharedPreferences settings = getPreferences(MODE_PRIVATE);
    	if (settings.contains(CUR_SERV)){
    		
    	}else {
    		TextView t = (TextView)findViewById(R.id.TextView01);
    		t.setText(R.string.noSerSel);
    	}
    	
    
    }
    
    

}