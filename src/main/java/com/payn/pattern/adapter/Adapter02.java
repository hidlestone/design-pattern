package com.payn.pattern.adapter;

/**
 * 适配器
 * 对象适配器方式，使用组合的方式跟被适配对象整合
 *
 * @author: payn
 * @date: 2020/11/17 12:09
 */
public class Adapter02 implements Target {

	private Adaptee adaptee;

	public void handleReq() {
		adaptee.request();
	}

	//组合
	public Adapter02(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}
}
