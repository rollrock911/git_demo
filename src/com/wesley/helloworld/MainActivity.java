package com.wesley.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class MainActivity extends Activity {

	private CheckBox eatBox;
	private CheckBox sleepBox;
	private CheckBox dotaBox;
	private CheckBox allBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_main);
        
        eatBox=(CheckBox)findViewById(R.id.eatbox);
        sleepBox=(CheckBox)findViewById(R.id.sleepbox);        
        dotaBox=(CheckBox)findViewById(R.id.dotabox);
        allBox=(CheckBox)findViewById(R.id.allbox);
       AllCheckBoxListener allcheckedListener=new AllCheckBoxListener();
       allBox.setOnCheckedChangeListener(allcheckedListener);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    class AllCheckBoxListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(CompoundButton arg0, boolean isChecked) {
			// TODO Auto-generated method stub
	        eatBox.setChecked(isChecked);
	        sleepBox.setChecked(isChecked);   
	        dotaBox.setChecked(isChecked);
	        //allBox.setChecked(isChecked);
		}
    	
    }
    
}
