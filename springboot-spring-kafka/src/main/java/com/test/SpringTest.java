package com.test;

import com.alibaba.fastjson.JSON;

public class SpringTest {

	public static void main(String[] args) {

		Student student = new Student();
		student.setId("123");
		student.setName("xiadongming-lvruina");

		System.out.println(student);

		System.out.println("================");
		System.out.println(JSON.toJSONString(student));
	}
}
