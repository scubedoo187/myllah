package com.capstonedesign.myllah;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ThreadSocket extends Thread{
	Socket socket = null;
	private static String str = "";
	private String tmpStr;
	
	PrintWriter pw;
	BufferedReader br;
	MsgString msgStr;
	
	public ThreadSocket(MsgString m) {
		msgStr = m;
	}
	
	public void run() {
		try {
			socket = new Socket("192.168.43.173", 30001);
			OutputStream out = socket.getOutputStream();
			InputStream in = socket.getInputStream();
			
			pw = new PrintWriter(new OutputStreamWriter(out));
			br = new BufferedReader(new InputStreamReader(in));
			
			while (true) {
				if (msgStr.isActivityChange()) {
					str = msgStr.getActivityStr();
					pw.println(str);
					pw.flush();
					tmpStr = br.readLine();
					
					str = tmpStr;
					msgStr.setThreadStr(str);
					if (str.toString().equals("quit")) {
						break;
					}
					str = "";
				}
				try {
					Thread.sleep(100);
				} catch(Exception e) {e.printStackTrace();}
			}
		} catch(Exception e) {
		} finally {
			try {
				pw.close();
				br.close();
				socket.close();
			} catch(Exception e) {e.printStackTrace();}
		}
	}
}
