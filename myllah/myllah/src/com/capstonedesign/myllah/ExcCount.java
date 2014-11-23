package com.capstonedesign.myllah;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;


public class ExcCount extends Activity {
	TextView cnt;
	Button startBtn;
	Button stopBtn;
	Chronometer timer;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.exccount);
		
		Intent intent = getIntent();
		int i = intent.getIntExtra("position", 1);
		
		System.out.println("선택된 메뉴 : " + i);
		
		switch(i) {
			case 0: {setTitle("윗몸일으키기"); break;}
			case 1: {setTitle("바벨들기"); break;}
			case 2: {setTitle("덤벨들기"); break;}
			case 3: {setTitle("테스트"); break;}
		}
		
		cnt = (TextView) findViewById(R.id.cnt);
		startBtn = (Button) findViewById(R.id.startBtn);
		stopBtn = (Button) findViewById(R.id.stopBtn);
		timer = (Chronometer) findViewById(R.id.clock);

		startBtn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				startBtn.setVisibility(100);
				timer.setBase(SystemClock.elapsedRealtime());
				timer.start();
				
			}
		});
		
		stopBtn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				startBtn.setVisibility(0);
				timer.stop();
			}
		});	
	}
}