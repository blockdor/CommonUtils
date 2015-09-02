package com.blocktopus.common;

import java.io.PrintWriter;
import java.io.StringWriter;

public class Utils {
	/**
	 * plsql has one or two useful functions and this is one of them.
	 * @param object
	 * @param defaultValue
	 * @return
	 */
	public static <T> T nvl(T object,T defaultValue){
		return object!=null?object:defaultValue;
	}
	/**
	 * mostly useful when dealing with xml.
	 * @param s
	 * @return
	 */
	public static boolean isNullString(String s){
		if(s!=null){
			if(s.length()>0) {
				return true;
			}
		}
		return false;
	}
	
	public static String getStackTrace(Throwable t){
		StringWriter sw = new StringWriter();
		
		t.printStackTrace(new PrintWriter(sw));
		return sw.toString();
	}
}
