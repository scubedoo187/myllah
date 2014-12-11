package com.capstonedesign.myllah;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
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
	MsgString msgObj;
	boolean sockFlag;

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
				
				sockFlag = true;
				String tmpStr = "start";
				if (sockFlag) {
					msgObj = new MsgString();
					ThreadSocket ts = new ThreadSocket(msgObj);
					msgObj.setActivityStr(tmpStr);
					
					try {
						ts.start();
					} catch(Exception e) {
						e.printStackTrace();
					}
					while(sockFlag) {
						int count = 0;
						if (msgObj.isThreadChange()) {
							tmpStr = msgObj.getThreadStr();
							if (tmpStr.equals("start")) {
								try {
									while (count < 8) {
										cnt.setText(count+"");
										Thread.sleep(2000);
									}
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								break;
							} else if(tmpStr.equals("quit")) {
								break;
							}
						}
					}
				}
			}
		});
		
		stopBtn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				startBtn.setVisibility(0);
				timer.stop();
				
				sockFlag = false;
				String tmpStr = "quit";
				try {
					if(!sockFlag) {
						msgObj.setActivityStr(tmpStr);
					}
				} catch(Exception e){e.printStackTrace();}
			}
		});	
	}
	
	void OnBackPressed() {
		AlertDialog.Builder ab = null;
		ab = new AlertDialog.Builder(ExcCount.this);
		ab.setMessage("종료하시겠습니까?");
		ab.setNegativeButton("확인", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				finish();
				sockFlag = false;
			}
		}); 
		ab.show();
	}
}