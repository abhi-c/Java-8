package com.symc.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambda {
	public static void main(String[] args) {
		//Lambda
		System.out.println(toLowerCase("Hello world", str -> str.toLowerCase()));
		System.out.println(slice("Hello world", 5, (str, i) -> str.substring(i)));
		
		// method reference of above LAMBDA expression.
		System.out.println(toLowerCase("Hello world", String::toLowerCase));
		System.out.println(slice("Hello world", 5, String::substring));
		
		String[] names = {"Mr. Abhishek", "Mrs Sneha", "Mst Kovid"};
		Arrays.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.substring(3).compareTo(o2.substring(3));
			}
		});
		System.out.println(Arrays.toString(names));
		
		String[] names1 = {"Mr. uAbhishek", "Mrs xSneha", "Mst bKovid"};
		Arrays.sort(names1, (o1, o2) -> 
				o1.split(" ")[1].compareTo(o2.split(" ")[1]));
		System.out.println(Arrays.toString(names1));
		
		String[] names3 = {"Mr. sAbhishek", "Mrs nSneha", "Mst aKovid"};
		Arrays.sort(names3, (o1, o2) -> 
				o1.substring(3).compareTo(o2.substring(3)));
		System.out.println(Arrays.toString(names3));
	
		String[] names4 = {"Mr. sss", "Mrs vvv", "Mst aa"};
		Arrays.sort(names4, Comparator.comparing(name ->  name.split(" ")[1]));
		System.out.println(Arrays.toString(names4));
	
		String[] names5 = {"Mr. sss", "Mrs vvv", "Mst aa"};
		Arrays.sort(names5, Comparator.comparing(Lambda::getFirstNme));
		System.out.println(Arrays.toString(names5));
		
		String[] names6 = {"Mr. sss", "Mrs vvv", "Mst aa"};
		Arrays.sort(names6, Comparator.comparing(Lambda::getFirstNme).reversed());
		System.out.println(Arrays.toString(names6));
	}

	private static String getFirstNme(String str) {
		return str.split(" ")[1];
	}
	
	private static String slice(String string, int i, BiFunction<String, Integer, String> p) {
		return p.apply(string, i);
	}

	private static String toLowerCase(String str, Function<String, String> p) {
		return p.apply(str);
	}
}