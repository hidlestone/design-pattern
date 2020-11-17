package com.payn.pattern.singleton;

/**
 * 饿汉模式
 *
 * @author: payn
 * @date: 2020/11/16 12:28
 */
public class SingletonDemoEHan {

	private SingletonDemoEHan() {
	}

	/*
	 * 1.单例模式的饿汉模式
	 * */
	private static SingletonDemoEHan singletonDemoEHan = new SingletonDemoEHan();

	public static SingletonDemoEHan getInstance() {
		return singletonDemoEHan;
	}

	/*
	 * 2.饿汉模式的变换写法
	 * */
	private static SingletonDemoEHan singletonDemoEHanTwo = null;

	static {
		singletonDemoEHanTwo = new SingletonDemoEHan();
	}

	public static SingletonDemoEHan getInstance02() {
		return singletonDemoEHanTwo;
	}

}
