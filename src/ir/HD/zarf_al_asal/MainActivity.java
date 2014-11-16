package ir.HD.zarf_al_asal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	OnClickListener showerOfAbout = new OnClickListener() {

		@Override
		public void onClick(View v) {
			Intent showAbout = new Intent(MainActivity.this, About.class);
			startActivity(showAbout);
		}
	};
	OnClickListener showerOfAboutHD = new OnClickListener() {

		@Override
		public void onClick(View v) {
			Intent showAboutHD = new Intent(MainActivity.this, AboutHD.class);
			startActivity(showAboutHD);
		}
	};
	OnClickListener showerOfMenu = new OnClickListener() {

		@Override
		public void onClick(View v) {
			Intent showAbout = new Intent(MainActivity.this, Levels.class);
			startActivity(showAbout);
		}
	};
	OnClickListener exit = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			finish();
			System.exit(0) ;
		}
	};

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Button help = (Button) findViewById(R.id.btn_help);
		Button menu = (Button)findViewById(R.id.btn_start) ;
		Button about_hd = (Button) findViewById(R.id.btn_about);
		Button b_exit = (Button) findViewById(R.id.btn_exit) ;
		help.setOnClickListener(showerOfAbout);
		about_hd.setOnClickListener(showerOfAboutHD);
		menu.setOnClickListener(showerOfMenu) ;
		b_exit.setOnClickListener(exit) ;
	}
}