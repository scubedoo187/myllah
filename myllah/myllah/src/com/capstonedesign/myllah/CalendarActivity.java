package com.capstonedesign.myllah;

import java.util.ArrayList;
import java.util.Date;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

public class CalendarActivity extends Activity implements OnClickListener, OnItemClickListener {
	ArrayList<String> mItems;
	ArrayAdapter<String> adapter;
	TextView textYear;
	TextView textMon;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calendar);
	
		textYear = (TextView) this.findViewById(R.id.edit1);
		textMon = (TextView) this.findViewById(R.id.edit2);
	
		mItems = new ArrayList<String>();
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mItems);
	
		GridView gird = (GridView) this.findViewById(R.id.grid1);
		gird.setAdapter(adapter);
		gird.setOnItemClickListener(this);
	
		Date date = new Date();// ���ÿ� ��¥�� ���� ���ش�.
		int year = date.getYear() + 1900;
		int mon = date.getMonth() + 1;
		textYear.setText(year + "");
		textMon.setText(mon + "");
	
		fillDate(year, mon);
	
		Button btnmove = (Button) this.findViewById(R.id.bt1);
		btnmove.setOnClickListener(this);
	
	}
	
	public void onClick(View arg0) {
		if (arg0.getId() == R.id.bt1) {
			int year = Integer.parseInt(textYear.getText().toString());
			int mon = Integer.parseInt(textMon.getText().toString());
			fillDate(year, mon);
		}
	}
	
	private void fillDate(int year, int mon) {
		mItems.clear();
	
		mItems.add("��");
		mItems.add("��");
		mItems.add("ȭ");
		mItems.add("��");
		mItems.add("��");
		mItems.add("��");
		mItems.add("��");
	
		Date current = new Date(year - 1900, mon - 1, 1);
		int day = current.getDay(); // ���ϵ� int�� ����.
	
		for (int i = 0; i < day; i++) {
			mItems.add("");
		}
	
		current.setDate(32);// 32�ϱ��� �Է��ϸ� 1�Ϸ� �ٲ��ش�.
		int last = 32 - current.getDate();
	
		for (int i = 1; i <= last; i++) {
			mItems.add(i + "");
		}
		adapter.notifyDataSetChanged();
	}
	
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		if (mItems.get(arg2).equals("")) {
			;
		} else {
			Intent intent = new Intent(this, ExToday.class);
			intent.putExtra("Param1", textYear.getText().toString() + "/"
					+ textMon.getText().toString() + "/" + mItems.get(arg2));
			startActivity(intent);
		}
	}
}