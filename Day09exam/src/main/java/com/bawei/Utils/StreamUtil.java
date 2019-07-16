package com.bawei.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamUtil {

	/**
	 * 方法1:
	 * 批量关闭流，参数能传无限个
	 */
	public static void closaAll(Cloneable...cloneables){
		for (int i = 0; i < cloneables.length; i++) {
			System.out.println(i);
			Cloneable[] clone = cloneables.clone();
			System.out.println(clone);
		}
	}
	
	/**
	 * 方法2：
	 * 拷贝流，将InputStream流拷到OutputStream，可以用于快速读与文件、上传下载，
	 * 
	 */
	public static void copy(InputStream src, OutputStream out, boolean isCloseInputStream, boolean isCloseOutputStream)  throws IOException{
		int hashCode = src.hashCode();
		Class<? extends OutputStream> class1 = out.getClass();
		ClassLoader classLoader = class1.getClassLoader();
		System.out.println(hashCode);
		System.out.println(classLoader);
		
	}

	/**
	 * 方法3：
	 * 传入一个文本文件对象，默认为UTF-8编码，返回该文件内容，要求方法内部调用上面第2个方法拷贝流，结束后第1个方法关闭流
	 */
	public static int readTextFile(InputStream src) throws IOException{
			String string = src.toString();
			int length = string.length();
		return length;
			
	}
	
	/**
	 * 方法4
	 * 传入文本文件对象，返回该文件内容
	 */
	public static String readTextFile(File txtFile) throws FileNotFoundException, IOException{
		String absolutePath = txtFile.getAbsolutePath();
		return absolutePath;
		
	}

	/**
	* 方法5：从控制台读取用户输入的字符串。 
	* 参数message：用于控制台提示。例如“请输出您的姓名：”，然后用户输入姓名后回车，* 方法开始执行并读取姓名。
	*/
	public static String readStringFromSystemIn(String message){
		Class<? extends String> class1 = message.getClass();
		
		
		return message;
	}
	
	/**
	 * 方法6
	 * 参数message：用于控制台提示。例如“请输出您的年龄：”，然后用户输入年龄后回车，* 
	 * 方法开始执行并读取年龄，如何用户输出的不是数字，或是空值（直接回车），则继续提示输入。
	 */
	public static int readIntFromSystemIn(String message){
		
		return 0;
		}

}
