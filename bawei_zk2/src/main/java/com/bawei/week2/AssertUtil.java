package com.bawei.week2;

import java.util.Collection;
import java.util.Map;

public class AssertUtil {
	/**
	 * 断言为真
	 * @param exp
	 * @param message
	 */
	public static void isTrue(Boolean exp,String message){
		if(!Boolean.TRUE.equals(exp)){
			throw new DRuntimeException(message);
		}
	}
	
	/**
	 * 断言为假
	 * @param exp  代表true或者false
	 * @param message 代表 抛出的错误信息
	 */
	public static void isFalse(Boolean exp,String message){
		if(!Boolean.FALSE.equals(exp)){
			throw new DRuntimeException(message);
		}
	}
	
	/**
	 * 断言对象不为空
	 * @param exp代表字符串对象
	 * @param message  代表 抛出的错误信息
	 */
	
	public static void ifNotNull(String exp,String message){
		if(exp ==null||exp.length()==0){
			throw new DRuntimeException(message);
		}
	}
	/**
	 * 断言必须为空
	 * @param exp
	 * @param message
	 */
	public static void ifNull(String exp,String message){
		if(exp !=null){
			throw new DRuntimeException(message);
		}
		
	}
	/**
	 * 断言集合为空
	 * @param col
	 * @param message
	 */
	public static void collectionNotNull(Collection<?>col,String message){
		if(col==null||col.size()==0){
			throw new DRuntimeException(message);
		}
	}
	
	
	/**
	 * 断言map为空
	 * @param col
	 * @param message
	 */
	public static void mapNotNull(Map<?,?>map,String message){
		if(map==null||map.size()==0){
			throw new DRuntimeException(message);
		}
	}
	

	/**
	 * 断言字符串必须有值，去掉空格后，长度大于0
	 * @param col
	 * @param message
	 */
	public static void hasTest(String src,String message){
		if(!(src.trim().length()>0)){
			throw new DRuntimeException(message);
		}
	}
	
	/**
	 * 断言值必须是正数(大于0)
	 * @param col
	 * @param message
	 */
	public static void absInt(int src,String message){
		if(src<=0){
			throw new DRuntimeException(message);
		}
	}
}
