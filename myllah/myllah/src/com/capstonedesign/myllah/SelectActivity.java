package com.capstonedesign.myllah;

import java.util.ArrayList;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ListView;

public class SelectActivity extends Activity {
	ListView list;
	ArrayList<ImgBtn> imgArr;
	myAdapter mAdapter;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.excselect);
		
		list = (ListView) findViewById(R.id.listview);
		
		imgArr = new ArrayList<ImgBtn>();
		imgArr.add(new ImgBtn(BitmapFactory.decodeResource(getResources(), R.drawable.exercise1)));
		imgArr.add(new ImgBtn(BitmapFactory.decodeResource(getResources(), R.drawable.exercise2)));
		imgArr.add(new ImgBtn(BitmapFactory.decodeResource(getResources(), R.drawable.exercise3)));
		imgArr.add(new ImgBtn(BitmapFactory.decodeResource(getResources(), R.drawable.exercise1)));

		mAdapter = new myAdapter(this, R.layout.imgbtn, imgArr);
		list.setAdapter(mAdapter);
	}

}
