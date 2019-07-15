package com.zhaoxuhui.common.utils;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;

//断言工具类
public class AssertUtil {

	/**
	 * 方法1：断言为真
	 * @param condition
	 * @param message
	 */
	public static void isTrue(Boolean condition,String message){
		if(!Boolean.TRUE.equals(condition)){
			throw new DRuntimeException(message);
		}
	}
	/**
	 * 方法2：断言为假
	 * @param condition
	 * @param message
	 */
	public static void isFalse(Boolean condition,String message){
		if(!Boolean.FALSE.equals(condition)){
			throw new DRuntimeException(message);
		}
	}
	/**
	 * 方法3：断言对象不为空
	 * @param obj
	 * @param message
	 */
	public static void notnull(Object obj,String message){
		if(obj==null){
			throw new DRuntimeException(message);
		}
			
	}
	/**
	 * 方法4：断言对象必须空
	 * @param obj
	 * @param message
	 */
	public static void isnull(Object obj,String message){
		if(obj!=null){
			throw new DRuntimeException(message);
		}
	}
	/**
	 * 方法5：断言集合不为空
	 * @param coll
	 * @param message
	 */
	public static void notEmpty(Collection<?> coll,String message){
		if(coll.size()==0){
			throw new DRuntimeException(message);
		}
	}
	/**
	 * 方法6：断言集合不为空
	 * @param map
	 * @param message
	 */
	public static void notEmpty(Map<?, ?> map,String message){
		if(map.size()==0){
			throw new DRuntimeException(message);
		}
	}
	/**
	 * 方法7：断言字符串必须有值，去掉空格后，判断长度是否大于0
	 * @param condition
	 * @param message
	 */
	public static void hasText(String condition,String message){
		if(!(condition.trim().length()>0)){
			throw new DRuntimeException(message);
		}
	}
	/**
	 * 方法8：断言值必须大于0
	 * @param value
	 * @param message
	 */
	public static void greaterThanZero(BigDecimal value, String message){
		if(value.intValue()<=0){
			throw new DRuntimeException(message);
		}
	}
	
}
