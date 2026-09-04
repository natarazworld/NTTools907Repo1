package com.nt.test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.nt.service.StringUtil;

public class StringUtilTest {
	private static  StringUtil util;
	
	@BeforeAll
	public static void setupOnce() {
		util=new StringUtil();
	}

	@Test
	public   void isPallendromePositive() {
		assertTrue(util.isPallendrome("madam"));
	}
	
	@Test
	public   void isPallendromeNegetive() {
		assertFalse(util.isPallendrome("madam1"));
	}
	
	
	@AfterAll
	public static  void tearDown() {
		util=null;
	}
	

}
