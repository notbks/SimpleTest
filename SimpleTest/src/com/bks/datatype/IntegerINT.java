package com.bks.datatype;

public class IntegerINT {
	
	public static void main(String[] args) {
		test1();
	}
	
	/**
	 * Integer类有高速缓存 范围：-128~127
	 * 因为较小的数，更可能用到
	 */
	public static void test1() {
		Integer a =-129;
		Integer b =-129;
		
		Integer c =1000;
		Integer d =1000;

		System.out.println(a ==b);
		System.out.println(c ==d);
	}
}
