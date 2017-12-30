package com.bks.memory;
/**
 * 对象的默认值都是null
 * 8种基本数据类型：6种数字都是0，char是/u0000(java用unicode)，boolean是false(0就是false)
 * 
 * 另外 1byte =1b =8bit
 * 		short	2位
 * 		int		4位	范围：2的31(4*8-1)次方
 * 		long	8位
 * @author whj82
 *
 */
public class DefaultValue {

	//静态方法只能调用静态属性		a,c都是成员变量
	static int a;
	int c;
	
	public void print() {
		System.out.println(c);
	}
	
	public static void main(String[] args) {

		System.out.println(a);
		
		int b;
		//b是局部变量，在声明时必须 初始化
		//System.out.println(b);
		
	}

}
