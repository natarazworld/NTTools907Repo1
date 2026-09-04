package com.nt.service;

public class StringUtil {
	
	public boolean isPallendrome(String str) {
	    StringBuilder builder=new StringBuilder(str);
	    System.out.println(str+"...."+builder);
	    return builder.reverse().toString().equals(str);
	}

}
