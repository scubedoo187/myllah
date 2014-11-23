package com.capstonedesign.myllah;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.Toast;


public class myAdapter extends BaseAdapter {
	Context context;
	int layoutId;
	ArrayList<ImgBtn> myAptArr;
	LayoutInflater Inflater;
	myAdapter(Context _context, int _layoutId, ArrayList<ImgBtn> _myAptArr) {
		context = _context;
		layoutId = _layoutId;
		myAptArr = _myAptArr;
		Inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}
	
	public int getCount() {
		return myAptArr.size();
	}
	
	public ImgBtn getItem(int position) {
		return myAptArr.get(position);
	}
	
	public long getItemId(int position) {
		return position;
	}
	
	public View getView(int position, View convertView, ViewGroup parent) {
		final int pos = position;
		final Context context = parent.getContext();
		
		if (convertView == null) {
			convertView = Inflater.inflate(layoutId, parent, false);
		}
		
		ImageButton imgBtn = (ImageButton)convertView.findViewById(R.id.imageBtn);
		imgBtn.setImageBitmap(myAptArr.get(pos).myImg);
		imgBtn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(context, ExcCount.class);
				intent.putExtra("position", pos);
				context.startActivity(intent);
			}
		});
		
		return convertView;
	}
}
