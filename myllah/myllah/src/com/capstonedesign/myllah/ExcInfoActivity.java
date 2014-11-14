package com.capstonedesign.myllah;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class ExcInfoActivity extends Activity{
	Button tmpBtn1;
	Button tmpBtn2;
	Button tmpBtn3;
	Button tmpBtn4;
	WebView webview;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.info);
		
		webview = (WebView) findViewById(R.id.webview);
		webview.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
		webview.setWebViewClient(new MyWebViewClient());
		
		WebSettings set = webview.getSettings();
		set.setBuiltInZoomControls(true);
		set.setSupportZoom(true);
		webview.loadUrl("http://www.google.com");
		
		
		//tmpBtn1 = (Button) findViewById(R.id.btn1);
		
		/*tmpBtn1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				//Intent intent = new Intent(ExcInfoActivity.this,);
			}
		});
		*/
	}
	
	class MyWebViewClient extends WebViewClient {
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			view.loadUrl(url);
			return true;
		}
	}
}
