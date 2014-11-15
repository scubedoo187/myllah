package com.capstonedesign.myllah;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings.PluginState;

public class ExcInfoWebView extends Activity {
	WebView webview;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.infoweb);
		
		Intent intent = getIntent();
		String url = intent.getExtras().getString("url");
		
		webview = (WebView) findViewById(R.id.webview);
		webview.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
		webview.setWebViewClient(new MyWebViewClient());
		
		WebSettings set = webview.getSettings();
		set.setJavaScriptEnabled(true);
		set.setPluginState(PluginState.ON);
		set.setSupportMultipleWindows(true);
		set.setBuiltInZoomControls(true);
		set.setSupportZoom(true);
		webview.loadUrl(url);
	}
	
	class MyWebViewClient extends WebViewClient {
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			view.loadUrl(url);
			return true;
		}
	}
}
