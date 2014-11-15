package com.capstonedesign.myllah;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {
	ImageButton excStart;
	ImageButton excLog;
	ImageButton excInfo;
	
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        setTitle("메뉴 선택"); 
        
        startActivity(new Intent(this, LogoActivity.class));
        
        excStart = (ImageButton) findViewById(R.id.excStart);
        excLog = (ImageButton) findViewById(R.id.excLog);
        excInfo = (ImageButton) findViewById(R.id.excInfo);

        excStart.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, SelectActivity.class);
				startActivity(intent);

			}
		});
        
        excLog.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				
			}
		});
        
        excInfo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, ExcInfoActivity.class);
				startActivity(intent);
			}
		});
    }
    
    public void onBackPressed() {
    	AlertDialog.Builder ab = null;
    	ab = new AlertDialog.Builder(MainActivity.this);
    	ab.setMessage("종료하시겠습니까?");
    	ab.setTitle("알림");
    	ab.setPositiveButton("확인", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				finish();
			}
		} );
    	ab.show();
    }
}