package ir.HD.zarf_al_asal;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class AboutHD extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about_hd);
		TextView tv1 = (TextView)findViewById(R.id.tvhd1);
		TextView tv3 = (TextView)findViewById(R.id.tvhd3);
		TextView tv4 = (TextView)findViewById(R.id.tvhd4);
		TextView tv5 = (TextView)findViewById(R.id.tvhd5);
		TextView tv6 = (TextView)findViewById(R.id.tvhd6);
		Typeface bHelal = Typeface.createFromAsset(getAssets(), "fonts/BHelal.ttf");
		tv1.setTypeface(bHelal);
		tv3.setTypeface(bHelal);
		tv4.setTypeface(bHelal);
		tv5.setTypeface(bHelal);
		tv6.setTypeface(bHelal);
	}
}
