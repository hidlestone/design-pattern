package com.payn.pattern.adapter;

/**
 * @author: payn
 * @date: 2020/11/17 11:24
 */
public class Demo {

	public void test01(Target t) {
		t.handleReq();
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		Adaptee adaptee = new Adaptee();
		
//		Target t = new Adapter();
		Target t = new Adapter02(adaptee);
		demo.test01(t);
	}
}
