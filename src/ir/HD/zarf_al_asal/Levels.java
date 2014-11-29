package ir.HD.zarf_al_asal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Levels extends FragmentActivity {

	SectionsPagerAdapter mSectionsPagerAdapter;
	ViewPager mViewPager;
	int loadLevel ;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_levels);
		mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
		mViewPager = (ViewPager) findViewById(R.id.pager);
		mViewPager.setAdapter(mSectionsPagerAdapter);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.levels, menu);
		return true;
	}

	/**
	 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
	 * one of the sections/tabs/pages.
	 */
	public class SectionsPagerAdapter extends FragmentPagerAdapter {

		public SectionsPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {
			// getItem is called to instantiate the fragment for the given page.
			// Return a DummySectionFragment (defined as a static inner class
			// below) with the page number as its lone argument.
			Fragment fragment = new DummySectionFragment();
			Bundle args = new Bundle();
			args.putInt(DummySectionFragment.ARG_SECTION_NUMBER, position + 1);
			fragment.setArguments(args);
			return fragment;
		}

		@Override
		public int getCount() {
			// Show 3 total pages.
			return 3;
		}

	}

	/**
	 * A dummy fragment representing a section of the app, but that simply
	 * displays dummy text.
	 */
	@SuppressLint("ValidFragment")
	public class DummySectionFragment extends Fragment {
		/**
		 * The fragment argument representing the section number for this
		 * fragment.
		 */
		public static final String ARG_SECTION_NUMBER = "section_number";

		public DummySectionFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_levels_dummy,
					container, false);

//			  BtnListener listener = new BtnListener();
//		      ((Button) rootView.findViewById(R.id.btn1)).setOnClickListener(listener);
//		      ((Button) rootView.findViewById(R.id.btn2)).setOnClickListener(listener);
//			  ((Button)	rootView.findViewById(R.id.btn3)).setOnClickListener(listener);
//		      ((Button) rootView.findViewById(R.id.btn4)).setOnClickListener(listener);
//		      ((Button) rootView.findViewById(R.id.btn5)).setOnClickListener(listener);
//		      ((Button) rootView.findViewById(R.id.btn6)).setOnClickListener(listener);
//		      ((Button) rootView.findViewById(R.id.btn7)).setOnClickListener(listener);
//		      ((Button) rootView.findViewById(R.id.btn8)).setOnClickListener(listener);
//		      ((Button) rootView.findViewById(R.id.btn9)).setOnClickListener(listener);
			
			final int n = getArguments().getInt(ARG_SECTION_NUMBER) ;
			
			
			
			ImageView img1 = (ImageView)rootView.findViewById(R.id.imgV1);
			ImageView img2 = (ImageView)rootView.findViewById(R.id.imgV2);
			ImageView img3 = (ImageView)rootView.findViewById(R.id.imgV3);
			ImageView img4 = (ImageView)rootView.findViewById(R.id.imgV4);
			ImageView img5 = (ImageView)rootView.findViewById(R.id.imgV5);
			ImageView img6 = (ImageView)rootView.findViewById(R.id.imgV6);
			ImageView img7 = (ImageView)rootView.findViewById(R.id.imgV7);
			ImageView img8 = (ImageView)rootView.findViewById(R.id.imgV8);
			ImageView img9 = (ImageView)rootView.findViewById(R.id.imgV9);
			ImageView img10 = (ImageView)rootView.findViewById(R.id.imgV10);
			ImageView img11 = (ImageView)rootView.findViewById(R.id.imgV11);
			ImageView img12 = (ImageView)rootView.findViewById(R.id.imgV12);
			ImageView img13 = (ImageView)rootView.findViewById(R.id.imgV13);
			ImageView img14 = (ImageView)rootView.findViewById(R.id.imgV14);
			ImageView img15 = (ImageView)rootView.findViewById(R.id.imgV15);
			
			
			Button but1 = (Button)rootView.findViewById(R.id.btn1);
			Button but2 = (Button)rootView.findViewById(R.id.btn2);
			Button but3 = (Button)rootView.findViewById(R.id.btn3);
			Button but4 = (Button)rootView.findViewById(R.id.btn4);
			Button but5 = (Button)rootView.findViewById(R.id.btn5);
			Button but6 = (Button)rootView.findViewById(R.id.btn6);
			Button but7 = (Button)rootView.findViewById(R.id.btn7);
			Button but8 = (Button)rootView.findViewById(R.id.btn8);
			Button but9 = (Button)rootView.findViewById(R.id.btn9);
			Button but10 = (Button)rootView.findViewById(R.id.btn10);
			Button but11 = (Button)rootView.findViewById(R.id.btn11);
			Button but12 = (Button)rootView.findViewById(R.id.btn12);
			Button but13 = (Button)rootView.findViewById(R.id.btn13);
			Button but14 = (Button)rootView.findViewById(R.id.btn14);
			Button but15 = (Button)rootView.findViewById(R.id.btn15);
			//set font
			Typeface bNazanin = Typeface.createFromAsset(getAssets(),
					"fonts/BNazanin.ttf");
			but1.setTypeface(bNazanin);
			but2.setTypeface(bNazanin);
			but3.setTypeface(bNazanin);
			but4.setTypeface(bNazanin);
			but5.setTypeface(bNazanin);
			but6.setTypeface(bNazanin);
			but7.setTypeface(bNazanin);
			but8.setTypeface(bNazanin);
			but9.setTypeface(bNazanin);
			but10.setTypeface(bNazanin);
			but11.setTypeface(bNazanin);
			but12.setTypeface(bNazanin);
			but13.setTypeface(bNazanin);
			but14.setTypeface(bNazanin);
			but15.setTypeface(bNazanin);
			//finish set font
			String idAsStr1 = String.valueOf(but1.getTag());
			String idAsStr2 = String.valueOf(but2.getTag());
			String idAsStr3 = String.valueOf(but3.getTag());
			String idAsStr4 = String.valueOf(but4.getTag());
			String idAsStr5 = String.valueOf(but5.getTag());
			String idAsStr6 = String.valueOf(but6.getTag());
			String idAsStr7 = String.valueOf(but7.getTag());
			String idAsStr8 = String.valueOf(but8.getTag());
			String idAsStr9 = String.valueOf(but9.getTag());
			String idAsStr10 = String.valueOf(but10.getTag());
			String idAsStr11 = String.valueOf(but11.getTag());
			String idAsStr12 = String.valueOf(but12.getTag());
			String idAsStr13 = String.valueOf(but13.getTag());
			String idAsStr14 = String.valueOf(but14.getTag());
			String idAsStr15 = String.valueOf(but15.getTag());
			
			
			
			
			final int id1 = Integer.parseInt(idAsStr1);
			final int id2 = Integer.parseInt(idAsStr2);
			final int id3 = Integer.parseInt(idAsStr3);
			final int id4 = Integer.parseInt(idAsStr4);
			final int id5 = Integer.parseInt(idAsStr5);
			final int id6 = Integer.parseInt(idAsStr6);
			final int id7 = Integer.parseInt(idAsStr7);
			final int id8 = Integer.parseInt(idAsStr8);
			final int id9 = Integer.parseInt(idAsStr9);
			final int id10 = Integer.parseInt(idAsStr10);
			final int id11 = Integer.parseInt(idAsStr11);
			final int id12 = Integer.parseInt(idAsStr12);
			final int id13 = Integer.parseInt(idAsStr13);
			final int id14 = Integer.parseInt(idAsStr14);
			final int id15 = Integer.parseInt(idAsStr15);
			
			
			
			
			but1.setText("کندوی " +((n-1)*15 + id1 )) ;
			but2.setText("کندوی " +((n-1)*15 + id2 )) ;
			but3.setText("کندوی " +((n-1)*15 + id3 )) ;
			but4.setText("کندوی " +((n-1)*15 + id4 )) ;
			but5.setText("کندوی " +((n-1)*15 + id5 )) ;
			but6.setText("کندوی " +((n-1)*15 + id6 )) ;
			but7.setText("کندوی " +((n-1)*15 + id7 )) ;
			but8.setText("کندوی " +((n-1)*15 + id8 )) ;
			but9.setText("کندوی " +((n-1)*15 + id9 )) ;
			but10.setText("کندوی " +((n-1)*15 + id10 )) ;
			but11.setText("کندوی " +((n-1)*15 + id11 )) ;
			but12.setText("کندوی " +((n-1)*15 + id12 )) ;
			but13.setText("کندوی " +((n-1)*15 + id13 )) ;
			but14.setText("کندوی " +((n-1)*15 + id14 )) ;
			but15.setText("کندوی " +((n-1)*15 + id15 )) ;
			
			
//			loadLevel = loadInt() ;
			
			if ((n-1)*15 + id1 <=loadInt()){
				img1.setVisibility(View.INVISIBLE);
			}
			if ((n-1)*15 + id2 <=loadInt()){
				img2.setVisibility(View.INVISIBLE);
			}	
			if ((n-1)*15 + id3 <=loadInt()){
				img3.setVisibility(View.INVISIBLE);
			}
			if ((n-1)*15 + id4 <=loadInt()){
				img4.setVisibility(View.INVISIBLE);
			}
			if ((n-1)*15 + id5 <=loadInt()){
				img5.setVisibility(View.INVISIBLE);
			}
			if ((n-1)*15 + id6 <=loadInt()){
				img6.setVisibility(View.INVISIBLE);
			}
			if ((n-1)*15 + id7 <=loadInt()){
				img7.setVisibility(View.INVISIBLE);
			}
			if ((n-1)*15 + id8 <=loadInt()){
				img8.setVisibility(View.INVISIBLE);
			}
			if ((n-1)*15 + id9 <=loadInt()){
				img9.setVisibility(View.INVISIBLE);
			}
			if ((n-1)*15 + id10 <=loadInt()){
				img10.setVisibility(View.INVISIBLE);
			}
			if ((n-1)*15 + id11 <=loadInt()){
				img11.setVisibility(View.INVISIBLE);
			}
			if ((n-1)*15 + id12 <=loadInt()){
				img12.setVisibility(View.INVISIBLE);
			}
			if ((n-1)*15 + id13 <=loadInt()){
				img13.setVisibility(View.INVISIBLE);
			}
			if ((n-1)*15 + id14 <=loadInt()){
				img14.setVisibility(View.INVISIBLE);
			}
			if ((n-1)*15 + id15 <=loadInt()){
				img15.setVisibility(View.INVISIBLE);
			}
			
			
			but1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					loadLevel = loadInt() ;
					// TODO Auto-generated method stub
					if ((n-1)*15 + id1<=loadLevel){
						startGame(((n-1)*15 + id1 ));
					}
					else
					{
						Toast.makeText(getApplicationContext(), "ای بابا، قفله" , Toast.LENGTH_LONG).show();
					}
				}
			});
			but2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					loadLevel = loadInt() ;
					// TODO Auto-generated method stub
					if ((n-1)*15 + id2<=loadLevel){
						startGame(((n-1)*15 + id2 ));
					}
					else
					{
						Toast.makeText(getApplicationContext(), "ای بابا، قفله" , Toast.LENGTH_LONG).show();
					}
				}
			});
			but3.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					loadLevel = loadInt() ;
					// TODO Auto-generated method stub
					if ((n-1)*15 + id3<=loadLevel){
						startGame(((n-1)*15 + id3 ));
					}
					else
					{
						Toast.makeText(getApplicationContext(), "ای بابا، قفله" , Toast.LENGTH_LONG).show();
					}
				}
			});
			but4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					loadLevel = loadInt() ;
					// TODO Auto-generated method stub
					if ((n-1)*15 + id4<=loadLevel){
						startGame(((n-1)*15 + id4 ));
					}
					else
					{
						Toast.makeText(getApplicationContext(), "ای بابا، قفله" , Toast.LENGTH_LONG).show();
					}
				}
			});
			but5.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					loadLevel = loadInt() ;
					// TODO Auto-generated method stub
					if ((n-1)*15 + id5<=loadLevel){
						startGame(((n-1)*15 + id5 ));
					}
					else
					{
						Toast.makeText(getApplicationContext(), "ای بابا، قفله" , Toast.LENGTH_LONG).show();
					}
				}
			});
			but6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					loadLevel = loadInt() ;
					// TODO Auto-generated method stub
					if ((n-1)*15 + id6<=loadLevel){
						startGame(((n-1)*15 + id6 ));
					}
					else
					{
						Toast.makeText(getApplicationContext(), "ای بابا، قفله" , Toast.LENGTH_LONG).show();
					}
				}
			});
			but7.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					loadLevel = loadInt() ;
					// TODO Auto-generated method stub
					if ((n-1)*15 + id7<=loadLevel){
						startGame(((n-1)*15 + id7 ));
					}
					else
					{
						Toast.makeText(getApplicationContext(), "ای بابا، قفله" , Toast.LENGTH_LONG).show();
					}
				}
			});
			but8.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					loadLevel = loadInt() ;
					// TODO Auto-generated method stub
					if ((n-1)*15 + id8<=loadLevel){
						startGame(((n-1)*15 + id8 ));
					}
					else
					{
						Toast.makeText(getApplicationContext(), "ای بابا، قفله" , Toast.LENGTH_LONG).show();
					}
				}
			});
			but9.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					loadLevel = loadInt() ;
					// TODO Auto-generated method stub
					if ((n-1)*15 + id9<=loadLevel){
						startGame(((n-1)*15 + id9 ));
					}
					else
					{
						Toast.makeText(getApplicationContext(), "ای بابا، قفله" , Toast.LENGTH_LONG).show();
					}
				}
			});
			but10.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					loadLevel = loadInt() ;
					// TODO Auto-generated method stub
					if ((n-1)*15 + id10<=loadLevel){
						startGame(((n-1)*15 + id10 ));
					}
					else
					{
						Toast.makeText(getApplicationContext(), "ای بابا، قفله" , Toast.LENGTH_LONG).show();
					};
				}
			});
			but11.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					loadLevel = loadInt() ;
					// TODO Auto-generated method stub
					if ((n-1)*15 + id11<=loadLevel){
						startGame(((n-1)*15 + id11 ));
					}
					else
					{
						Toast.makeText(getApplicationContext(), "ای بابا، قفله" , Toast.LENGTH_LONG).show();
					}
				}
			});
			but12.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					loadLevel = loadInt() ;
					// TODO Auto-generated method stub
					if ((n-1)*15 + id12<=loadLevel){
						startGame(((n-1)*15 + id12 ));
					}
					else
					{
						Toast.makeText(getApplicationContext(), "ای بابا، قفله" , Toast.LENGTH_LONG).show();
					}
				}
			});
			but13.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					loadLevel = loadInt() ;
					// TODO Auto-generated method stub
					if ((n-1)*15 + id13<=loadLevel){
						startGame(((n-1)*15 + id13 ));
					}
					else
					{
						Toast.makeText(getApplicationContext(), "ای بابا، قفله" , Toast.LENGTH_LONG).show();
					}
				}
			});
			but14.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					loadLevel = loadInt() ;
					// TODO Auto-generated method stub
					if ((n-1)*15 + id14<=loadLevel){
						startGame(((n-1)*15 + id14 ));
					}
					else
					{
						Toast.makeText(getApplicationContext(), "ای بابا، قفله" , Toast.LENGTH_LONG).show();
					}
				}
			});
			but15.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					loadLevel = loadInt() ;
					// TODO Auto-generated method stub
					if (((n-1)*15 + id15)<=loadLevel){
						startGame(((n-1)*15 + id15 ));
					}
					else
					{
						Toast.makeText(getApplicationContext(), "ای بابا، قفله" , Toast.LENGTH_LONG).show();
					}
				}
			});
			
			
			
			return rootView;
		}
	
	
		public int loadInt(){
	    	SharedPreferences sp = getSharedPreferences("your_prefs", Activity.MODE_PRIVATE);
	    	int myIntValue = sp.getInt("Level", 1);
	    	return myIntValue ;
	    }
	
	
	public final void startGame(int id){
		Intent myIntent = new Intent(Levels.this , BaziActivity.class) ;
		myIntent.putExtra("level", ""+id) ;
		startActivity(myIntent);
	}
	
	
	
	

	

	}
}