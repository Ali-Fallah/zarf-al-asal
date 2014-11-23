package ir.HD.zarf_al_asal;

import java.util.Locale;
import android.annotation.SuppressLint;
import android.content.Intent;
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
import android.widget.TextView;

public class Levels extends FragmentActivity {

	SectionsPagerAdapter mSectionsPagerAdapter;
	ViewPager mViewPager;
	
	public void onBackPressed()
	{
		Intent home = new Intent(Levels.this , MainActivity.class);
		startActivity(home);
	}

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

		@Override
		public CharSequence getPageTitle(int position) {
			Locale l = Locale.getDefault();
			switch (position) {
			case 0:
				return getString(R.string.title_section1).toUpperCase(l);
			case 1:
				return getString(R.string.title_section2).toUpperCase(l);
			case 2:
				return getString(R.string.title_section3).toUpperCase(l);
			}
			return null;
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
			
			
			
			Button but1 = (Button)rootView.findViewById(R.id.btn1);
			Button but2 = (Button)rootView.findViewById(R.id.btn2);
			Button but3 = (Button)rootView.findViewById(R.id.btn3);
			Button but4 = (Button)rootView.findViewById(R.id.btn4);
			Button but5 = (Button)rootView.findViewById(R.id.btn5);
			Button but6 = (Button)rootView.findViewById(R.id.btn6);
			Button but7 = (Button)rootView.findViewById(R.id.btn7);
			Button but8 = (Button)rootView.findViewById(R.id.btn8);
			Button but9 = (Button)rootView.findViewById(R.id.btn9);
			
			String idAsStr1 = String.valueOf(but1.getTag());
			String idAsStr2 = String.valueOf(but2.getTag());
			String idAsStr3 = String.valueOf(but3.getTag());
			String idAsStr4 = String.valueOf(but4.getTag());
			String idAsStr5 = String.valueOf(but5.getTag());
			String idAsStr6 = String.valueOf(but6.getTag());
			String idAsStr7 = String.valueOf(but7.getTag());
			String idAsStr8 = String.valueOf(but8.getTag());
			String idAsStr9 = String.valueOf(but9.getTag());
			
			
			
			
			
			final int id1 = Integer.parseInt(idAsStr1);
			final int id2 = Integer.parseInt(idAsStr2);
			final int id3 = Integer.parseInt(idAsStr3);
			final int id4 = Integer.parseInt(idAsStr4);
			final int id5 = Integer.parseInt(idAsStr5);
			final int id6 = Integer.parseInt(idAsStr6);
			final int id7 = Integer.parseInt(idAsStr7);
			final int id8 = Integer.parseInt(idAsStr8);
			final int id9 = Integer.parseInt(idAsStr9);
			
			
			
			
			
			but1.setText("کندوی " +((n-1)*9 + id1 )) ;
			but2.setText("کندوی " +((n-1)*9 + id2 )) ;
			but3.setText("کندوی " +((n-1)*9 + id3 )) ;
			but4.setText("کندوی " +((n-1)*9 + id4 )) ;
			but5.setText("کندوی " +((n-1)*9 + id5 )) ;
			but6.setText("کندوی " +((n-1)*9 + id6 )) ;
			but7.setText("کندوی " +((n-1)*9 + id7 )) ;
			but8.setText("کندوی " +((n-1)*9 + id8 )) ;
			but9.setText("کندوی " +((n-1)*9 + id9 )) ;
			
			
			but1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					startGame(((n-1)*9 + id1 ));
				}
			});
			but2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					startGame(((n-1)*9 + id2 ));
				}
			});
			but3.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					startGame(((n-1)*9 + id3 ));
				}
			});
			but4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					startGame(((n-1)*9 + id4 ));
				}
			});
			but5.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					startGame(((n-1)*9 + id5 ));
				}
			});
			but6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					startGame(((n-1)*9 + id6 ));
				}
			});
			but7.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					startGame(((n-1)*9 + id7 ));
				}
			});
			but8.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					startGame(((n-1)*9 + id8 ));
				}
			});
			but9.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					startGame(((n-1)*9 + id9 ));
				}
			});
			
			
			
			return rootView;
		}
	
	
	
	
	
	public final void startGame(int id){
		Intent myIntent = new Intent(Levels.this , BaziActivity.class) ;
		myIntent.putExtra("level", ""+id) ;
		startActivity(myIntent);
	}
	
	
	
	

	

	}
}