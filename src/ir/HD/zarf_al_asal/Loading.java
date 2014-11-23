package ir.HD.zarf_al_asal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;

public class Loading extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_loading);
		new CountDownTimer(3000, 1000) {

			@Override
			public void onFinish() {
				Intent myInt = new Intent(Loading.this , MainActivity.class);
				startActivity(myInt);
				
			}

			@Override
			public void onTick(long arg0) {
				// TODO Auto-generated method stub
				
			}
		  }.start();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.loading, menu);
		return true;
	}

}
