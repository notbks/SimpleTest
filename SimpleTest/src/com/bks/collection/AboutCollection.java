package com.bks.collection;

import java.util.HashMap;
import java.util.Map;

public class AboutCollection {
	
	public static void main(String[] args) {
		test1();
	}
	
	private static void test1() {
		//泛型只能是对象，不能是int这种基本数据类型
		Map<Integer , String> m =new HashMap<>();
		m.put(1, "str1");
		m.put(2, "str3");
		m.put(3, "str2");
		
		//这里用给了int a体现了自动拆装箱
		int a =1;
		m.put(a, "stra");
		System.out.println(m.get(a));
	}
}
