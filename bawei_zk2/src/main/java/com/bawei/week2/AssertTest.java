package com.bawei.week2;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

public class AssertTest {

	@Test
	public void fun1Test(){
		try {
			AssertUtil.isTrue(false,"这不是true");
		} catch (DRuntimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun2Test(){
		try {
			AssertUtil.isFalse(true,"这不是false");
		} catch (DRuntimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun3Test(){
		try {
			AssertUtil.ifNotNull("","这不是一个字符串");
		} catch (DRuntimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun4Test(){
		try {
			AssertUtil.ifNull("我我ad","这是一个字符串");
		} catch (DRuntimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun5Test(){
		try {
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			arrayList.add(5);
			AssertUtil.collectionNotNull(arrayList,"这不是一个集合");
		} catch (DRuntimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun6Test(){
		try {
			HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
			hashMap.put(5, "sd ");
			AssertUtil.mapNotNull(hashMap,"这不是一个map");
		} catch (DRuntimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun7Test(){
		try {

			AssertUtil.hasTest("","这没有值");
		} catch (DRuntimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun8Test(){
		try {

			AssertUtil.absInt(0,"这不是正数");
		} catch (DRuntimeException e) {
			e.printStackTrace();
		}
	}
	
}
