package com.capstonedesign.myllah;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends Activity {
	ImageButton excStart;
	ImageButton excLog;
	ImageButton excInfo;
	
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        startActivity(new Intent(this, LogoActivity.class));
        
        excStart = (ImageButton) findViewById(R.id.excStart);
        excLog = (ImageButton) findViewById(R.id.excLog);
        excInfo = (ImageButton) findViewById(R.id.excInfo);

    }
}