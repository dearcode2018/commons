/**
 * Commons4Test.java
 * @author qye.zheng
 * 
 * 	version 1.0
 */
package com.hua.test.commons;

import org.junit.Test;

import com.hua.classpath.ClassPathDriver;
import com.hua.test.BaseTest;

/**
 * Commons4Test
 * 描述: 
 * @author qye.zheng
 * 
 */
public final class Commons4Test extends BaseTest
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
			ClassPathDriver.classPathHandler();
			
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
			//System.out.println("abc".substring(0, "abc".length() - 1));
			log.info("testTemp =====> project root path : " + System.getProperty("user.dir"));
			log.info("testTemp =====> project lib path : " + System.getProperty("user.dir.lib"));
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
