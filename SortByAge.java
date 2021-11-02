package com.ty.basics;

import java.util.Comparator;

public class SortByAge implements Comparator<Student2>{
		@Override
		public int compare(Student2 o1, Student2 o2) {
			return o1.age - o2.age;
		}
}
