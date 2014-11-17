package com.capstonedesign.myllah;

import java.util.ArrayList;

import com.capstonedesign.myllah.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;


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
	
	public String getItem(int position) {
		return myAptArr.get(position).toString();
	}
	
	public long getItemId(int position) {
		return position;
	}
	
	public View getView(int position, View convertView, ViewGroup parent) {
		final int pos = position;
		
		if (convertView == null) {
			convertView = Inflater.inflate(layoutId, parent, false);
		}
		
		ImageButton imgBtn = (ImageButton)convertView.findViewById(R.id.imageBtn);
		imgBtn.setImageBitmap(myAptArr.get(position).myImg);

		return convertView;
	}
}
