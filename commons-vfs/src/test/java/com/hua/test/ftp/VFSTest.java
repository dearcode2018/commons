/**
 * 描述: 
 * VFSTest.java
 * 
 * @author qye.zheng
 *  version 1.0
 */
package com.hua.test.ftp;

// 静态导入
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.commons.vfs.FileContent;
import org.apache.commons.vfs.FileObject;
import org.apache.commons.vfs.FileSystemManager;
import org.apache.commons.vfs.FileType;
import org.apache.commons.vfs.Selectors;
import org.apache.commons.vfs.VFS;
import org.junit.Ignore;
import org.junit.Test;

import com.hua.test.BaseTest;

/**
 * 描述:
 * 
 * @author qye.zheng VFSTest
 */
public final class VFSTest extends BaseTest {

	/**
	 * 
	 * 描述:
	 * 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testVFS() {
		try {
			FileSystemManager fsManager = VFS.getManager();
			FileObject fo = fsManager
					.resolveFile("ftp://xtionweb:xtionweb\\@123@120.132.147.139:22/home/xtionweb/");
			FileObject[] children = fo.getChildren();// 得到远程文件列表
			for (int i = 0; i < children.length; i++) {
				FileObject f = children[i];
				FileContent c = f.getContent();

				File localFile = new File(f.getName().getBaseName());
				FileOutputStream out = new FileOutputStream(localFile);
				org.apache.commons.io.IOUtils.copy(c.getInputStream(), out);// 写入本地

				// 或使用写入
				// FileObject obj =
				// fsManager.resolveFile(this.getTargetResourceURL()+f.getName().getBaseName());
				FileObject obj = fsManager.resolveFile(""
						+ f.getName().getBaseName());
				if (!obj.exists()) {
					obj.createFile();
					obj.copyFrom(f, Selectors.SELECT_SELF);
				}

				final long size = (f.getType() == FileType.FILE) ? c.getSize()
						: -1;
				final long date = (f.getType() == FileType.FILE) ? c
						.getLastModifiedTime() : -1;
				System.out.println(f.getName().getPath() + " date:" + date
						+ " Size:" + size);
			}

		} catch (Exception e) {
			log.error("testVFS =====> ", e);
		}
	}

	/**
	 * 
	 * 描述:
	 * 
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

	/**
	 * 
	 * 描述:
	 * 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testTemp() {
		try {

		} catch (Exception e) {
			log.error("testTemp=====> ", e);
		}
	}

	/**
	 * 
	 * 描述:
	 * 
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
	 * 
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
	 * 
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
	 * 描述: 解决ide静态导入消除问题
	 * 
	 * @author qye.zheng
	 * 
	 */
	@Ignore("解决ide静态导入消除问题 ")
	private void noUse() {
		String expected = null;
		String actual = null;
		Object[] expecteds = null;
		Object[] actuals = null;
		String message = null;

		assertEquals(expected, actual);
		assertEquals(message, expected, actual);
		assertNotEquals(expected, actual);
		assertNotEquals(message, expected, actual);

		assertArrayEquals(expecteds, actuals);
		assertArrayEquals(message, expecteds, actuals);

		assertFalse(true);
		assertTrue(true);
		assertFalse(message, true);
		assertTrue(message, true);

		assertSame(expecteds, actuals);
		assertNotSame(expecteds, actuals);
		assertSame(message, expecteds, actuals);
		assertNotSame(message, expecteds, actuals);

		assertNull(actuals);
		assertNotNull(actuals);
		assertNull(message, actuals);
		assertNotNull(message, actuals);

		assertThat(null, null);
		assertThat(null, null, null);

		fail();
		fail("Not yet implemented");

	}

}
