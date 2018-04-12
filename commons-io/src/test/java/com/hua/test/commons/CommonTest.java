/**
 * 描述: 
 * CommonTest.java
 * @author qye.zheng
 * 
 *  version 1.0
 */
package com.hua.test.commons;

import java.util.Properties;
import java.util.Random;

import org.junit.Test;

import com.hua.test.BaseTest;

/**
 * 描述: 
 * @author qye.zheng
 * 
 * CommonTest
 */
public final class CommonTest extends BaseTest
{
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testClassPathTool() {
		try {
			
			
		} catch (Exception e) {
			log.error("testClassPathTool =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testTemp() {
		try {
			// 验证码的最小长度
			final int codeMinLength = 5;
			String code = "";
			Random r = new Random();
			String str = "";
			for (int i = 0; i < 4; i++)
			{
				str += "9";
			}
			int num = Integer.parseInt(str);
			while (code.length() < codeMinLength)
			{
				code  += r.nextInt(num);
			}
			
			log.info("testTemp =====> code = " + code);
			
		} catch (Exception e) {
			log.error("testTemp=====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testCommon() {
		try {
			//log.info("testTemp =====> project root path : " + System.getProperty("user.dir"));
			//log.info("testTemp =====> project lib path : " + System.getProperty("user.lib"));
			log.info("testTemp =====> project lib path : " + System.getProperty("java.class.path"));
			Properties props = System.getProperties();
			//props.list(System.out);
			//log.info("testCommon =====> " + WebPathUtil.);
		} catch (Exception e) {
			log.error("testCommon =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testSimple() {
		try {
			
			
		} catch (Exception e) {
			log.error("testSimple =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testBase() {
		try {
			
			
		} catch (Exception e) {
			log.error("testBase =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void test() {
		try {
			
			
		} catch (Exception e) {
			log.error("test =====> ", e);
		}
	}
}
