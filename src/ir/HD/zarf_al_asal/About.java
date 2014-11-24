package ir.HD.zarf_al_asal;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class About extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		TextView tv = (TextView)findViewById(R.id.tvAbout1) ;
		Typeface bBaran = Typeface.createFromAsset(getAssets(), "fonts/BBaran.ttf");
		tv.setTypeface(bBaran);

	}
}
