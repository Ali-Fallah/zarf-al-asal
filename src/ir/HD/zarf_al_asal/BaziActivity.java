package ir.HD.zarf_al_asal;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.ParseException;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class BaziActivity extends Activity {
	
	public String getSentence(int n) throws FileNotFoundException, IOException, JSONException{
		InputStream inputStream = getAssets().open("sentences.json");
		int sizeOfJSONFile = inputStream.available();
        byte[] bytes = new byte[sizeOfJSONFile];
        inputStream.read(bytes);
        inputStream.close();
        String jsString = new String(bytes, "UTF-8");
        JSONObject jsObj = new JSONObject(jsString);
		JSONArray levelsArr = (JSONArray)jsObj.get("levels");
		JSONObject game = (JSONObject) levelsArr.get(n-1);
		return (String)game.get("sentence");
	}
	
	
	public String getJavab(int n) throws FileNotFoundException, IOException, JSONException{
		InputStream inputStream = getAssets().open("sentences.json");
		int sizeOfJSONFile = inputStream.available();
        byte[] bytes = new byte[sizeOfJSONFile];
        inputStream.read(bytes);
        inputStream.close();
        String jsString = new String(bytes, "UTF-8");
        JSONObject jsObj = new JSONObject(jsString);
		JSONArray levelsArr = (JSONArray)jsObj.get("levels");
		JSONObject game = (JSONObject) levelsArr.get(n-1);
		return (String)game.get("javab");
	}

	
	
	public String getChar(int n) throws FileNotFoundException, IOException, ParseException, JSONException{
		InputStream inputStream = getAssets().open("sentences.json");
		int sizeOfJSONFile = inputStream.available();
        byte[] bytes = new byte[sizeOfJSONFile];
        inputStream.read(bytes);
        inputStream.close();
        String jsString = new String(bytes, "UTF-8");
        JSONObject jsObj = new JSONObject(jsString);
		JSONArray levelsArr = (JSONArray)jsObj.get("levels");
		JSONObject game = (JSONObject) levelsArr.get(n-1);
//		String[] strs = (String[]) game.get("char");
		return (String) game.get("char");
	}
	
	
	
	
	
	
	String jav = null;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bazi);
		TextView tv = (TextView) findViewById(R.id.textView1) ;
		final TextView answer = (TextView) findViewById(R.id.tv_answer);
		final Button btn1 = (Button) findViewById(R.id.button1) ;
		final Button btn2 = (Button) findViewById(R.id.button2) ;
		final Button btn3 = (Button) findViewById(R.id.button3) ;
		final Button btn4 = (Button) findViewById(R.id.button4) ;
		final Button btn5 = (Button) findViewById(R.id.button5) ;
		final Button btn6 = (Button) findViewById(R.id.button6) ;
		final Button btn7 = (Button) findViewById(R.id.button7) ;
		final Button btn8 = (Button) findViewById(R.id.button8) ;
		final Button btn9 = (Button) findViewById(R.id.button9) ;
		final Button remLastChar = (Button)findViewById(R.id.erase);
		Intent intent = getIntent();
		String str = intent.getStringExtra("level") ;
//		Toast.makeText(getApplicationContext(), s, 3000).show();
		final int n = Integer.parseInt(str) ;
		
		try {
			jav = getJavab(n);// javab soal dar JSON
			tv.setText(getSentence(n)) ;
			String ch = getChar(n) ;
			//set buttons chars
			int a[] = new int[9] ;
			for (int i = 0 ; i < 9 ;i++){
				a[i] = (int)(Math.random() * 9 ) ;
				for (int j = 0 ; j < i ;j++ ){
					if ( a[i] == a[j] ){
						i-- ;
						break ;
					}
				}
			}
			btn1.setText(Character.toString(ch.charAt(a[0]))) ;
			btn2.setText(Character.toString(ch.charAt(a[1]))) ;
			btn3.setText(Character.toString(ch.charAt(a[2]))) ;
			btn4.setText(Character.toString(ch.charAt(a[3]))) ;
			btn5.setText(Character.toString(ch.charAt(a[4]))) ;
			btn6.setText(Character.toString(ch.charAt(a[5]))) ;
			btn7.setText(Character.toString(ch.charAt(a[6]))) ;
			btn8.setText(Character.toString(ch.charAt(a[7]))) ;
			btn9.setText(Character.toString(ch.charAt(a[8]))) ;
			//finish set buttons chars
		} catch (FileNotFoundException e) {


			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (JSONException e) {
			Toast.makeText(getApplicationContext(),e.getMessage(), Toast.LENGTH_LONG).show();
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		
		
//		gereftan javab
		answer.setText("");
		
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String ans =  answer.getText().toString() ;
				answer.setText(ans+(btn1.getText().toString()));
				ans =  answer.getText().toString() ;
				Log.d("MILK","answer: "+ans);
				if(jav.equals(ans))
				{
					Toast.makeText(getApplicationContext(), "آفرین، درست بود" , Toast.LENGTH_LONG).show();
					Intent newIntent = new Intent (BaziActivity.this , BaziActivity.class);
					if ( n < 27 )
					{
						newIntent.putExtra("level","" + (n+1)) ;
						startActivity(newIntent);
					}
				}
			}
		});
		btn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String ans =  answer.getText().toString() ;
				answer.setText(ans+(btn2.getText().toString()));
				ans =  answer.getText().toString() ;
				Log.d("MILK","answer: "+ans);
				if(jav.equals(ans))
				{
					Toast.makeText(getApplicationContext(), "آفرین، درست بود" , Toast.LENGTH_LONG).show();
					Intent newIntent = new Intent (BaziActivity.this , BaziActivity.class);
					if ( n < 27 )
					{
						newIntent.putExtra("level","" + (n+1)) ;
						startActivity(newIntent);
					}
				}
			}
		});
		btn3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String ans =  answer.getText().toString() ;
				answer.setText(ans+(btn3.getText().toString()));
				ans =  answer.getText().toString() ;
				Log.d("MILK","answer: "+ans);
				if(jav.equals(ans))
				{
					Toast.makeText(getApplicationContext(), "آفرین، درست بود" , Toast.LENGTH_LONG).show();
					Intent newIntent = new Intent (BaziActivity.this , BaziActivity.class);
					if ( n < 27 )
					{
						newIntent.putExtra("level","" + (n+1)) ;
						startActivity(newIntent);
					}
				}
//				Toast.makeText(getApplicationContext(), "آفرین، درست بود" , Toast.LENGTH_LONG).show();
			}
		});
		btn4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String ans =  answer.getText().toString() ;
				answer.setText(ans+(btn4.getText().toString()));
				ans =  answer.getText().toString() ;
				Log.d("MILK","answer: "+ans);
				if(jav.equals(ans))
				{
					Toast.makeText(getApplicationContext(), "آفرین، درست بود" , Toast.LENGTH_LONG).show();
					Intent newIntent = new Intent (BaziActivity.this , BaziActivity.class);
					if ( n < 27 )
					{
						newIntent.putExtra("level","" + (n+1)) ;
						startActivity(newIntent);
					}
				}
			}
		});
		btn5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String ans =  answer.getText().toString() ;
				answer.setText(ans+(btn5.getText().toString()));
				ans =  answer.getText().toString() ;
				Log.d("MILK","answer: "+ans);
				if(jav.equals(ans))
				{
					Toast.makeText(getApplicationContext(), "آفرین، درست بود" , Toast.LENGTH_LONG).show();
					Intent newIntent = new Intent (BaziActivity.this , BaziActivity.class);
					if ( n < 27 )
					{
						newIntent.putExtra("level","" + (n+1)) ;
						startActivity(newIntent);
					}
				}
			}
		});
		btn6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String ans =  answer.getText().toString() ;
				answer.setText(ans+(btn6.getText().toString()));
				ans =  answer.getText().toString() ;
				Log.d("MILK","answer: "+ans);
				if(jav.equals(ans))
				{
					Toast.makeText(getApplicationContext(), "آفرین، درست بود" , Toast.LENGTH_LONG).show();
					Intent newIntent = new Intent (BaziActivity.this , BaziActivity.class);
					if ( n < 27 )
					{
						newIntent.putExtra("level","" + (n+1)) ;
						startActivity(newIntent);
					}
				}
			}
		});
		btn7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String ans =  answer.getText().toString() ;
				answer.setText(ans+(btn7.getText().toString()));
				ans =  answer.getText().toString() ;
				Log.d("MILK","answer: "+ans);
				if(jav.equals(ans))
				{
					Toast.makeText(getApplicationContext(), "آفرین، درست بود" , Toast.LENGTH_LONG).show();
					Intent newIntent = new Intent (BaziActivity.this , BaziActivity.class);
					if ( n < 27 )
					{
						newIntent.putExtra("level","" + (n+1)) ;
						startActivity(newIntent);
					}
				}
			}
		});
		btn8.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String ans =  answer.getText().toString() ;
				answer.setText(ans+(btn8.getText().toString()));
				ans =  answer.getText().toString() ;
				Log.d("MILK","answer: "+ans);
				if(jav.equals(ans))
				{
					Toast.makeText(getApplicationContext(), "آفرین، درست بود" , Toast.LENGTH_LONG).show();
					Intent newIntent = new Intent (BaziActivity.this , BaziActivity.class);
					if ( n < 27 )
					{
						newIntent.putExtra("level","" + (n+1)) ;
						startActivity(newIntent);
					}
				}
			}
		});
		btn9.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String ans =  answer.getText().toString() ;
				answer.setText(ans+(btn9.getText().toString()));
				ans =  answer.getText().toString() ;
				Log.d("MILK","answer: "+ans);
				if(jav.equals(ans))
				{
					Toast.makeText(getApplicationContext(), "آفرین، درست بود" , Toast.LENGTH_LONG).show();
					Intent newIntent = new Intent (BaziActivity.this , BaziActivity.class);
					if ( n < 27 )
					{
						newIntent.putExtra("level","" + (n+1)) ;
						startActivity(newIntent);
					}
				}
			}
		});
		//payan gereftan javab
		remLastChar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String ans = answer.getText().toString();
				if ( ans.length() > 0 	){
					answer.setText(ans.substring(0, ans.length()-1)) ;
				}
			}
		});
		
		
		//debugging
//		String ans = answer.getText().toString() ; // javabe vared shode user
//		Log.d("MILK","javab: "+jav);
		// finish debugging
				
	}
	
	public void onBackPressed()
	{
		Intent myIntent = new Intent(BaziActivity.this , Levels.class);
		startActivity(myIntent);
	}
	
	
	

}
