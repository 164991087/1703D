package com.bawei.Test;

import java.sql.Date;

import org.junit.Test;

import com.bawei.Utils.DateUtil;

public class DateTest {
	Date src = null;
	Date departed = null;
	DateUtil d=new DateUtil();
	//测试第一个
	@Test
	public void fun1test(){
		
		DateUtil.getAge(src);
	}
	//测试第二个
	public void fun2test(){
	
		DateUtil.getDateByMonthInit(src);
	}
	//测试第三个
	public void fun3test(){
		
		DateUtil.getDateByMonthLast(src);
	}
	//测试第四个
	public void fun4test(){
		DateUtil.getDaysByDeparted(departed);
	}
	//测试第五个
	public void fun5test(){
		
		DateUtil.getDaysByDeparted(departed);
	}
}
