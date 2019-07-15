package zhaoxuhui_common.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.zhaoxuhui.common.utils.AssertUtil;
import com.zhaoxuhui.common.utils.DRuntimeException;

public class AssertTest {

	//测试第一个方法
	@Test
	public void fun1Test(){
		try {
			AssertUtil.isTrue(false, "这不是true");
		} catch (DRuntimeException e) {
			e.printStackTrace();
		}
	}
	//测试第二个方法
	@Test
	public void fun2Test(){
		try {
			AssertUtil.isFalse(true, "这不是false");
		} catch (DRuntimeException e) {
			e.printStackTrace();
		}
	}
	//测试第三个方法
	@Test
	public void fun3Test(){
		try {
			AssertUtil.notnull(null, "这不是null");
		} catch (DRuntimeException e) {
			e.printStackTrace();
		}
	}
	//测试第四个方法
	@Test
	public void fun4Test(){
		try {
			AssertUtil.isnull("坎坎坷坷", "这是null");
		} catch (DRuntimeException e) {
			e.printStackTrace();
		}
	}
	//测试第五个方法
	@Test
	public void fun5Test(){
		try {
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			arrayList.add(5);
			AssertUtil.notEmpty(arrayList, "这不是集合");
		} catch (DRuntimeException e) {
			e.printStackTrace();
		}
	}
	//测试第6个方法
	@Test
	public void fun6Test(){
		try {
			HashMap<Integer,String> map = new HashMap<>();
			map.put(99,"ll");
			AssertUtil.notEmpty(map, "这不是map");
		} catch (DRuntimeException e) {
			e.printStackTrace();
		}
	}
	
	//测试第7个方法
	@Test
	public void fun7Test(){
		try {
			
			AssertUtil.hasText("", "必须大于0");
		} catch (DRuntimeException e) {
			e.printStackTrace();
		}
	}
	//测试第8个方法
	@Test
	public void fun8Test(){
		try {
			
			BigDecimal value = null;
			AssertUtil.greaterThanZero(value, "值必须大于0");
		} catch (DRuntimeException e) {
			e.printStackTrace();
		}
	}
}
