package com.bawei.Utils;

import java.sql.Date;

public class DateUtil {

	//方法1
	public static int getAge(Date src){
		Date d=new Date(0);
		int date = d.getDate();
		src.getYear();
		System.out.println(src.getYear()+src.getMonth()+src.getDay());
		return 0;
		
	}
	
	//方法2：
	public static String getDateByMonthInit (Date src) {
		String s="2019-09-19 19:29:39";
		int length = s.length();
		System.out.println(length);
		s="2019-09-01 00:00:00";
		return s;
		//TODO
	}
	
	//方法3
	public static Date getDateByMonthLast(Date src) {
		String  sr="2019-09-19 19:29:39";
		System.out.println(sr);
		return src;
		//TODO
	}
	
	//方法4
	public static int getDayByFuture(Date future){
		Date date = new Date(2020);
		Date date2 = new Date(2019);
		System.out.println(date);
		return 0;
		
	}
	//方法5
	public static int getDaysByDeparted (Date departed){
		Date date = new Date(1119);
		Date date2 = new Date(0);
		System.out.println(date);
		
		return 0;
		
	}

}
