package provaDate;

import java.util.*;
import java.text.*;

public class DataDaSourceforge {
	
	public static void main(String[] args) {
		
	// SourceForge date, probably read from database
	//int sfDate = 940000000;
	int sfDate = 947617928;
	
	// Create Java Date class from SourceForge date
	// Java Date is milliseconds so multiply by 1000
	long l = (long)sfDate*1000;
	//System.out.println("l vale" + w);
	
	java.util.Date actDate = new java.util.Date(l);
	
	// Create Java Calendar class to manipulate date
	Calendar cal = Calendar.getInstance();
	cal.setTime(actDate);
	
	// print out the date
	DateFormat dd = DateFormat.getDateInstance();
	System.out.println("Activity date: " + dd.format(actDate));
	}
}
