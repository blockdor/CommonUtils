package com.blocktopus.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.blocktopus.common.types.LinkedCaseInsensitiveMap;

public class CollectionUtils {
	public static <T> List<T> newList(){
		return new ArrayList<T>();
	}
	public static <T> Set<T> newSet(){
		return new HashSet<T>();
	}
	public static <K,V> Map<K,V> newMap(){
		return new LinkedHashMap<K,V>();
	}
	public static <V> Map<String,V> newCaseInsensitiveMap(){
		return new LinkedCaseInsensitiveMap<V>();
	}
	public static String arrayToString(Object[] objects){
		List<Object> x = newList();
		x.addAll(Arrays.asList(objects));
		return x.toString();
		/*
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(Object o:objects){
			if(o==null){
				sb.append("null");
			} else {
				sb.append(o.getClass().getName());
				sb.append("("+o+")");
			}
			sb.append(":");
		}
		sb.append("]");
		return sb.toString();*/
	}
}
