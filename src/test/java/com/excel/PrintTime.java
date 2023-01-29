package com.excel;


import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class PrintTime {
   public String getCurrentTime() {
	
	   Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	   System.out.println(timestamp);	   
	   SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy_hhmmss");
	   System.out.println(dateFormat.format(timestamp));
	   return dateFormat.format(timestamp);
   }
   
   public static void main(String[] args) {
	PrintTime printTime = new PrintTime();
	String time = printTime.getCurrentTime();
	System.out.println(time);
	}
}
