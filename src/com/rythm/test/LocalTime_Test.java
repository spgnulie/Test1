package com.rythm.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.*;

public class LocalTime_Test {
	public static void main(String args[]) {
		LocalTime_Test LT = new LocalTime_Test();
		LT.testLocalDateTime();

		LocalTime_Test LT1 = new LocalTime_Test();
		LT1.testZonedDateTime1();
	}

	public void testLocalDateTime() {

		// 获取当前的日期时间
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println("当前时间: " + currentTime);

		LocalDate date1 = currentTime.toLocalDate();
		System.out.println("date1: " + date1);

		Month month = currentTime.getMonth();
		int day = currentTime.getDayOfMonth();
		int minute = currentTime.getHour();

		System.out.println("月: " + month + ", 日: " + day + ", 时: " + minute);

		LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2021);
		System.out.println("date2: " + date2);

		// 12 december 2014
		LocalDate date3 = LocalDate.of(2014, Month.NOVEMBER, 12);
		System.out.println("date3: " + date3);

		// 22 小时 15 分钟
		LocalTime date4 = LocalTime.of(22, 15);
		System.out.println("date4: " + date4);

		// 解析字符串
		LocalTime date5 = LocalTime.parse("20:15:30");
		System.out.println("date5: " + date5);

//      System.out.println("--------------------");
	}

	public void testZonedDateTime1() {

		// 获取当前时间日期
		ZonedDateTime date1 = ZonedDateTime.parse("2015-12-03T10:15:30+05:30[Asia/Shanghai]");
		System.out.println("date1: " + date1);

		ZoneId id = ZoneId.of("Europe/Paris");
		System.out.println("ZoneId: " + id);

		ZoneId currentZone = ZoneId.systemDefault();
		System.out.println("当期时区: " + currentZone);
	}
}