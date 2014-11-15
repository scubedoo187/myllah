package com.capstonedesign.myllah;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class ExcInfoActivity extends Activity implements OnClickListener{
	Button Btn1;
	Button Btn2;
	Button Btn3;
	Button Btn4;
	Button Btn5;
	Button Btn6;
	Button Btn7;
	Button Btn8;
	Button Btn9;
	Button Btn10;
	Button Btn11;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.infomenu);
		
		Btn1 = (Button) findViewById(R.id.btn1);
		Btn1.setOnClickListener(this);
		Btn1.setText("헬스 프로그램");
		
		Btn2 = (Button) findViewById(R.id.btn2);
		Btn2.setOnClickListener(this);
		Btn2.setText("홈 트레이닝");
		
		Btn3 = (Button) findViewById(R.id.btn3);
		Btn3.setOnClickListener(this);
		Btn3.setText("다이어트 가이드");
		
		Btn4 = (Button) findViewById(R.id.btn4);
		Btn4.setOnClickListener(this);
		Btn4.setText("음식 영양성분찾기");
		
		Btn5 = (Button) findViewById(R.id.btn5);
		Btn5.setOnClickListener(this);
		Btn5.setText("운동 칼로리 계산기");
		
		Btn6 = (Button) findViewById(R.id.btn6);
		Btn6.setOnClickListener(this);
		Btn6.setText("다이어트 식단표");
		
		Btn7 = (Button) findViewById(R.id.btn7);
		Btn7.setOnClickListener(this);
		Btn7.setText("푸쉬업 운동법");
		
		Btn8 = (Button) findViewById(R.id.btn8);
		Btn8.setOnClickListener(this);
		Btn8.setText("싯업 운동법");
		
		Btn9 = (Button) findViewById(R.id.btn9);
		Btn9.setOnClickListener(this);
		Btn9.setText("동영상으로 배우는 근력운동");
		
		Btn10 = (Button) findViewById(R.id.btn10);
		Btn10.setOnClickListener(this);
		Btn10.setText("스트레칭");
		
		Btn11 = (Button) findViewById(R.id.btn11);
		Btn11.setOnClickListener(this);
		Btn11.setText("운동 가이드");

	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn1 : {
			String url = "http://health.naver.com/fitness/weightTraining/home.nhn";
			Intent intent = new Intent(ExcInfoActivity.this, ExcInfoWebView.class);
			intent.putExtra("url", url);
			startActivity(intent);
			break;
		}
		case R.id.btn2 : {
			String url = "http://health.naver.com/fitness/homeTraining/home.nhn";
			Intent intent = new Intent(ExcInfoActivity.this, ExcInfoWebView.class);
			intent.putExtra("url", url);
			startActivity(intent);
			break;
		}
		case R.id.btn3 : {
			String url = "http://health.naver.com/diet/home.nhn";
			Intent intent = new Intent(ExcInfoActivity.this, ExcInfoWebView.class);
			intent.putExtra("url", url);
			startActivity(intent);
			break;
		}
		case R.id.btn4 : {
			String url = "http://health.naver.com/nutrition/search.nhn#%7B%22orderOption%22%3A%7B%22orderName%22%3A%22alphabet%22%2C%22order%22%3A%22asc%22%7D%2C%22keyword%22%3A%22%22%2C%22foodNavigator%22%3A%7B%22level%22%3A%220%22%2C%22type%22%3A%22F01%22%2C%22upperCategoryId%22%3A%22-1%22%2C%22categoryId%22%3A%220%22%7D%2C%22componentConfig%22%3A%7B%22calorie%22%3A%5B0%2C146%2Cfalse%5D%2C%22carb%22%3A%5B0%2C146%2Cfalse%5D%2C%22protein%22%3A%5B0%2C146%2Cfalse%5D%2C%22fat%22%3A%5B0%2C146%2Cfalse%5D%2C%22natrium%22%3A%5B0%2C146%2Cfalse%5D%2C%22dietaryFiber%22%3A%5B0%2C146%2Cfalse%5D%2C%22cholesterol%22%3A%5B0%2C146%2Cfalse%5D%7D%2C%22paging%22%3A%7B%22page%22%3A1%7D%7D";
			Intent intent = new Intent(ExcInfoActivity.this, ExcInfoWebView.class);
			intent.putExtra("url", url);
			startActivity(intent);
			break;
		}
		case R.id.btn5 : {
			String url = "http://www.365homecare.com/calculator/CALEX0101.html";
			Intent intent = new Intent(ExcInfoActivity.this, ExcInfoWebView.class);
			intent.putExtra("url", url);
			startActivity(intent);
			break;
		}
		case R.id.btn6 : {
			String url = "http://boomfood.co.kr/index.php?mid=board_SgfK80";
			Intent intent = new Intent(ExcInfoActivity.this, ExcInfoWebView.class);
			intent.putExtra("url", url);
			startActivity(intent);
			break;
		}
		case R.id.btn7 : {
			String url = "http://terms.naver.com/entry.nhn?docId=938871&cid=51030&categoryId=51030";
			Intent intent = new Intent(ExcInfoActivity.this, ExcInfoWebView.class);
			intent.putExtra("url", url);
			startActivity(intent);
			break;
		}
		case R.id.btn8 : {
			String url = "http://terms.naver.com/entry.nhn?docId=938918&cid=51030&categoryId=51030";
			Intent intent = new Intent(ExcInfoActivity.this, ExcInfoWebView.class);
			intent.putExtra("url", url);
			startActivity(intent);
			break;
		}
		case R.id.btn9 : {
			String url = "http://terms.naver.com/list.nhn?cid=48663&categoryId=48671&so=st4.asc";
			Intent intent = new Intent(ExcInfoActivity.this, ExcInfoWebView.class);
			intent.putExtra("url", url);
			startActivity(intent);
			break;
		}
		case R.id.btn10 : {
			String url = "http://health.naver.com/fitness/stretching/home.nhn";
			Intent intent = new Intent(ExcInfoActivity.this, ExcInfoWebView.class);
			intent.putExtra("url", url);
			startActivity(intent);
			break;
		}
		case R.id.btn11 : {
			String url = "http://health.naver.com/fitness/exerciseGuide/home.nhn";
			Intent intent = new Intent(ExcInfoActivity.this, ExcInfoWebView.class);
			intent.putExtra("url", url);
			startActivity(intent);
			break;
		}
		}
	}
}
