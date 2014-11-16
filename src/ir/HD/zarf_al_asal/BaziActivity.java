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
			String jav = getJavab(n);
			tv.setText(getSentence(n)) ;
			String ch = getChar(n) ;
			btn1.setText(Character.toString(ch.charAt(0))) ;
			btn2.setText(Character.toString(ch.charAt(1))) ;
			btn3.setText(Character.toString(ch.charAt(2))) ;
			btn4.setText(Character.toString(ch.charAt(3))) ;
			btn5.setText(Character.toString(ch.charAt(4))) ;
			btn6.setText(Character.toString(ch.charAt(5))) ;
			btn7.setText(Character.toString(ch.charAt(6))) ;
			btn8.setText(Character.toString(ch.charAt(7))) ;
			btn9.setText(Character.toString(ch.charAt(8))) ;
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
			}
		});
		btn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String ans =  answer.getText().toString() ;
				answer.setText(ans+(btn2.getText().toString()));
			}
		});
		btn3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String ans =  answer.getText().toString() ;
				answer.setText(ans+(btn3.getText().toString()));
//				Toast.makeText(getApplicationContext(), answer.getText().toString(), 3000).show();
			}
		});
		btn4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String ans =  answer.getText().toString() ;
				answer.setText(ans+(btn4.getText().toString()));
			}
		});
		btn5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String ans =  answer.getText().toString() ;
				answer.setText(ans+(btn5.getText().toString()));
			}
		});
		btn6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String ans =  answer.getText().toString() ;
				answer.setText(ans+(btn6.getText().toString()));
			}
		});
		btn7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String ans =  answer.getText().toString() ;
				answer.setText(ans+(btn7.getText().toString()));
			}
		});
		btn8.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String ans =  answer.getText().toString() ;
				answer.setText(ans+(btn8.getText().toString()));
			}
		});
		btn9.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String ans =  answer.getText().toString() ;
				answer.setText(ans+(btn9.getText().toString()));
			}
		});
		//payan gereftan javab
		remLastChar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String ans = answer.getText().toString();
				if ( ans != ""){
					answer.setText(ans.substring(0, ans.length()-1)) ;
				}
			}
		});
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
