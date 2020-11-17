package com.payn.pattern.singleton;

/**
 * 懒汉模式
 *
 * @author: payn
 * @date: 2020/11/16 17:28
 */
public class SingletonLanHan01 {

	private SingletonLanHan01() {
	}

	private static SingletonLanHan01 singletonLanHan01;

	//1.这种方式线程不安全，不可用，可能得到两个不同的实例
	public SingletonLanHan01 getInstance() {
		if (null == singletonLanHan01) {
			singletonLanHan01 = new SingletonLanHan01();
		}
		return singletonLanHan01;
	}

	/*
	 * 2.懒汉线程安全，效率低下，不推荐使用
	 * 缺点：效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步。
	 * 而其实这个方法只执行一次实例化代码就够了，
	 * 后面的想获得该类实例，直接return就行了。方法进行同步效率太低要改进。
	 * */
	private static SingletonLanHan01 singletonLanHan02;

	public synchronized SingletonLanHan01 getInstance02() {
		if (null == singletonLanHan02) {
			singletonLanHan01 = new SingletonLanHan01();
		}
		return singletonLanHan01;
	}

	/*
	 * 3.懒汉模式，线程不安全
	 * 虽然加了锁，但是等到第一个线程执行完instance=new Singleton()跳出这个锁时，
	 * 另一个进入if语句的线程同样会实例化另外一个Singleton对象
	 * */
	private static SingletonLanHan01 singletonLanHan03;

	public synchronized SingletonLanHan01 getInstance03() {
		if (null == singletonLanHan03) {
			synchronized (SingletonLanHan01.class) {//这里是线程不安全的
				singletonLanHan01 = new SingletonLanHan01();
			}
		}
		return singletonLanHan01;
	}

	/*
	 * 4.懒汉模式双重校验锁，推荐使用
	 * 懒汉式变种,属于懒汉式的最好写法,保证了:延迟加载和线程安全
	 * */
	private static SingletonLanHan01 singletonLanHan04;

	public synchronized SingletonLanHan01 getInstance04() {
		if (null == singletonLanHan04) {
			synchronized (SingletonLanHan01.class) {//这里是线程不安全的
				if (null == singletonLanHan04) {
					singletonLanHan01 = new SingletonLanHan01();
				}
			}
		}
		return singletonLanHan01;
	}

}
