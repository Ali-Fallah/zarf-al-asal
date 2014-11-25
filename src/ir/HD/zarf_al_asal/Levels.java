package ir.HD.zarf_al_asal;

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

public class Levels extends FragmentActivity {

	SectionsPagerAdapter mSectionsPagerAdapter;
	ViewPager mViewPager;
	

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
			return 1;
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
			Button but10 = (Button)rootView.findViewById(R.id.btn10);
			Button but11 = (Button)rootView.findViewById(R.id.btn11);
			Button but12 = (Button)rootView.findViewById(R.id.btn12);
			Button but13 = (Button)rootView.findViewById(R.id.btn13);
			Button but14 = (Button)rootView.findViewById(R.id.btn14);
			Button but15 = (Button)rootView.findViewById(R.id.btn15);
			
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
			
			
			
			but1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					startGame(((n-1)*15 + id1 ));
				}
			});
			but2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					startGame(((n-1)*15 + id2 ));
				}
			});
			but3.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					startGame(((n-1)*15 + id3 ));
				}
			});
			but4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					startGame(((n-1)*15 + id4 ));
				}
			});
			but5.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					startGame(((n-1)*15 + id5 ));
				}
			});
			but6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					startGame(((n-1)*15 + id6 ));
				}
			});
			but7.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					startGame(((n-1)*15 + id7 ));
				}
			});
			but8.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					startGame(((n-1)*15 + id8 ));
				}
			});
			but9.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					startGame(((n-1)*15 + id9 ));
				}
			});
			but10.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					startGame(((n-1)*15 + id10 ));
				}
			});
			but11.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					startGame(((n-1)*15 + id11 ));
				}
			});
			but12.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					startGame(((n-1)*15 + id12 ));
				}
			});
			but13.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					startGame(((n-1)*15 + id13 ));
				}
			});
			but14.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					startGame(((n-1)*15 + id14 ));
				}
			});
			but15.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					startGame(((n-1)*15 + id15 ));
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