package com.payn.pattern.singleton.inclass;

/**
 * 内部类
 * 内部类的加载:
 * 内部类：内部类是延时加载的，也就是说只会在第一次使用时加载。不使用就不加载。
 * <p>
 * 这种方式跟饿汉式方式采用的机制类似，但又有不同。
 * 两者都是采用了类装载的机制来保证初始化实例时只有一个线程。
 * 不同的地方:
 * 在饿汉式方式是只要Singleton类被装载就会实例化,
 * 内部类是在需要实例化时，调用getInstance方法，才会装载SingletonHolder类
 * <p>
 * 优点：避免了线程不安全，延迟加载，效率高。
 *
 * @author: payn
 * @date: 2020/11/17 9:38
 */
public class SingletonDemoIn {

	private SingletonDemoIn() {
	}

	private static class SingletoneInHolder {
		private static SingletonDemoIn singletonDemoIn = new SingletonDemoIn();
	}

	public SingletonDemoIn getInstance() {
		return SingletoneInHolder.singletonDemoIn;
	}
}
