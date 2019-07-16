import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.Test;

import com.bawei.Utils.StreamUtil;

public class StreamTest {

	public static void main(String[] args) throws IOException {
		StreamUtil s=new StreamUtil();
	Cloneable cloneables = null;
	//方法1测试
	s.closaAll(cloneables);
	InputStream src = null;
	OutputStream out = null;
	boolean isCloseInputStream = false;
	boolean isCloseOutputStream = false;
	//方法2测试
	StreamUtil.copy(src, out, isCloseInputStream, isCloseOutputStream);
	//方法3测试
	s.readTextFile(src);
	
	InputStream txtFile = null;
	//方法4测试
	s.readTextFile(txtFile);
	String message = null;
	//方法5测试
	s.readStringFromSystemIn(message);
	
	//方法6测试
	s.readIntFromSystemIn(message);
}	
}
