package com.ty.basics;

import java.util.Comparator;

public class SortByPerc implements Comparator<Student2> {
	@Override
	public int compare(Student2 o1, Student2 o2) {
		int diff = (int) (o1.perc - o2.perc);
		return diff;
	}
}
