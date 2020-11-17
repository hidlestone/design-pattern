package com.payn.pattern.singleton.enums;

import java.util.Calendar;
import java.util.Date;

/**
 * 借助JDK1.5中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象
 *
 * @author: payn
 * @date: 2020/11/17 10:10
 */
public enum WeekEnum {

	SUN("周日"),
	MON("周一"),
	TUE("周二"),
	WED("周三"),
	THU("周四"),
	FRI("周五"),
	SAT("周六");

	private String weekday;

	WeekEnum(String weekday) {
		this.weekday = weekday;
	}

	public String getWeekday() {
		return this.weekday;
	}

	public static void main(String[] args) {
		Date today = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(today);

		// 获取星期索引, 0 代表周日
		int weekIndex = calendar.get(Calendar.DAY_OF_WEEK) - 1;
		if (weekIndex < 0) {
			weekIndex = 0;
		}

		String weekday = WeekEnum.values()[weekIndex].getWeekday();
		System.out.println(weekday);

		// 当然也可以输出英文的星期
		WeekEnum enWeekday = WeekEnum.values()[weekIndex];
		System.out.println(enWeekday.toString());
	}
}
