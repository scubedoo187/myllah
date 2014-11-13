package com.capstonedesign.myllah;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class ExcInfoActivity extends Activity{
	Button tmpBtn1;
	Button tmpBtn2;
	Button tmpBtn3;
	Button tmpBtn4;
	WebView webview;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.infomenu);
		
		webview = (WebView) findViewById(R.id.webview);
		WebView wb = new WebView(getApplicationContext());
		WebSettings set = webview.getSettings();
		set.setJavaScriptEnabled(true);
		set.setBuiltInZoomControls(true);
		webview.loadUrl("http://www.google.com");
		
		tmpBtn1 = (Button) findViewById(R.id.btn1);
		
		tmpBtn1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				//Intent intent = new Intent(ExcInfoActivity.this,);
			}
		});
		
	}
}
