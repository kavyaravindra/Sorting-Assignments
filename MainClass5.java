package com.ty.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainClass5 {

		public static void main(String[] args) throws InvalidInputException {
			ArrayList<Student2> arrayList = new ArrayList<Student2>();

			arrayList.add(new Student2(101,"kavya",564, 23));
			arrayList.add(new Student2(67, "divya",435, 22));
			arrayList.add(new Student2(131, "ramya",566, 19));
			arrayList.add(new Student2(111, "vidya",234, 24));
			
			Scanner scanner = new Scanner(System.in);
			
			String newline = System.lineSeparator();
			System.out.println("---------------------------------------");
			
			System.out.println("The Student List Is :----");
			System.out.println(arrayList);
			
			System.out.println("Press 1 to sort by id:-");
			System.out.println("Press 2 to sort by name:-");
			System.out.println("Press 3 to sort by marks:-");
			System.out.println("Press 4 to sort by age:-");
			System.out.println("Press 4 to sort by age:-");
			System.out.println("Press 5 to exit:-");
			int option = scanner.nextInt();
			
			switch (option) {
			case 1:
				Collections.sort(arrayList,new Student2());
				for (Student2 studentDemo : arrayList) {
					System.out.println(studentDemo);
				}
				break;
			case 2:
				Collections.sort(arrayList,new SortByName());
				for (Student2 studentDemo : arrayList) {
					System.out.println(studentDemo);
				}
				break;
			case 3:
				Collections.sort(arrayList,new SortingByPerc());
				for (Student2 studentDemo : arrayList) {
					System.out.println(studentDemo);
				}
				break;
			case 4:
				Collections.sort(arrayList,new SortByAge());
				for (Student2 studentDemo : arrayList) {
					System.out.println(studentDemo);
				}
				break;
			case 5:
				System.exit(0);
				break;

			default:
			throw new InvalidInputException("Invalid input");
			}
			
			
		}

	
}


