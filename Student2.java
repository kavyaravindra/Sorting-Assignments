package com.ty.basics;

import java.util.Comparator;

public class Student2 implements Comparator<Student2> {
	int id;
	String name;
	double perc;
	int age;
	public Student2() {
		// TODO Auto-generated constructor stub
	}

	Student2(int id, String name, double perc, int age) {
		this.id = id;
		this.name = name;
		this.perc = perc;
		this.age = age;
	}

	public int compare(Student2 o1, Student2 o2) {
		return o1.id - o2.id;
	}

	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + ", perc=" + perc + ", age=" + age + "]";
	}

}
