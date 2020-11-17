package com.payn.pattern.adapter;

/**
 * 适配器
 * (相当于usb和ps/2的转接器)
 *
 * @author: payn
 * @date: 2020/11/17 11:16
 */
public class Adapter extends Adaptee implements Target {

	public void handleReq() {
		super.request();
	}
}
