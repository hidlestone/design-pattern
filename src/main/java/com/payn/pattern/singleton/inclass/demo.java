package com.payn.pattern.singleton.inclass;

/**
 * @author: payn
 * @date: 2020/11/17 9:50
 */
public class demo {

	public static void main(String[] args) {
		new Enclosingone.InsideOne();//静态内部类直接声明使用//相当于外部类
		System.out.println("-------------");
		new Enclosingone().new InsideOne2();
		System.out.println("--------------");
		new Enclosingonechild().name();
		System.out.println("--------------");
		System.gc();//调用gc回收，触发finalize方法;
	}
}
/*
Enclosingone.InsideOne.enclosing_method():静态内部类
-------------
Enclosingone.enclosing_method():父类静态代码块
Enclosingone.enclosing_method():父类构造代码块
Enclosingone.Enclosingone():父类构造函数
200
--------------
Enclosingonechild.enclosing_method():子类静态代码块
Enclosingone.enclosing_method():父类构造代码块
Enclosingone.Enclosingone():父类构造函数
Enclosingonechild.enclosing_method():子类构造代码块
Enclosingonechild.Enclosingonechild():子类构造函数
Enclosingone.name():父类普通代码块
--------------
最后一次a:100
最后一次a:100


* */