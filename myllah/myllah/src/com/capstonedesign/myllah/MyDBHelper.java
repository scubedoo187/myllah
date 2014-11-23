package com.capstonedesign.myllah;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDBHelper extends SQLiteOpenHelper {

	public MyDBHelper(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
	}

	public void onCreate(SQLiteDatabase db) {

		db.execSQL("CREATE TABLE today(_id INTEGER PRIMARY KEY AUTOINCREMENT, "
				+ "title TEXT, " + "date TEXT , " + "time TEXT, "
				+ "memo TEXT );");

	}

	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE IF EXIST today;");
		onCreate(db);
	}

}