package com.tuling.cglib;

/**
 * @author 周瑜
 */
public class UserService {

	public void test(String name){
		System.out.println(String.format("hello, %s", name));
	}

	public void a(String name){
		System.out.println(String.format("hello, %s", name));
	}

	public static void b(String name){
		System.out.println(String.format("hello, %s", name));
	}
}
