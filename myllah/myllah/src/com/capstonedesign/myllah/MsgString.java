package com.capstonedesign.myllah;

import java.io.Serializable;

public class MsgString implements Serializable{
	private static final long serialVersionUID = 1L;
	private static String threadStr;
	private static String activityStr;
	private static boolean newActivityStr;
	private static boolean newThreadStr;
	
	public MsgString() {
		newActivityStr = false;
		newThreadStr = false;
		activityStr = "";
		threadStr = "";
	}
	
	public void setThreadStr(String s) {
		newThreadStr = true;
		threadStr = s;
	}
	
	public void setActivityStr(String s) {
		newActivityStr = true;
		activityStr = s;
	}
	
	public String getThreadStr() {
		newThreadStr = false;
		return threadStr;
	}
	
	public String getActivityStr() {
		newActivityStr = false;
		return activityStr;
	}
	
	public boolean isActivityChange() {
		return newActivityStr;
	}
	
	public boolean isThreadChange() {
		return newThreadStr;
	}
}
