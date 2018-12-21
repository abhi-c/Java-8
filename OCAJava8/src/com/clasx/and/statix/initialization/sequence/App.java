package com.clasx.and.statix.initialization.sequence;

public class App {
	public static void main(String[] args) {
		Instructor i = new Instructor();
		i.sayHello();
		System.out.println(Instructor.str1);
		System.out.println("---------");
		Instructor i1 = new Instructor();
		i1.sayHello();
		System.out.println(Instructor.str1);
	}
}
