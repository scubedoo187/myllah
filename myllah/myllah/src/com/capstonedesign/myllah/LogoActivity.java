package com.capstonedesign.myllah;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Window;
import android.view.WindowManager;

public class LogoActivity extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.logo);
		
	requestWindowFeature(Window.FEATURE_NO_TITLE);
	getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
			WindowManager.LayoutParams.FLAG_FULLSCREEN);
	
	Handler mHandler = new Handler() {
		public void handleMessage(Message msg) {
			finish();
		}
	};
	
	mHandler.sendEmptyMessageDelayed(0, 3000);
	}
}
