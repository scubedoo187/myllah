package com.capstonedesign.myllah;

import java.util.ArrayList;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class SelectActivity extends Activity implements OnItemClickListener {
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
		list.setOnItemClickListener(this);
	}
	
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		
	}
}