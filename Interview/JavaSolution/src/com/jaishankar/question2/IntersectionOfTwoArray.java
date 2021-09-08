package com.jaishankar.question2;

import java.util.Arrays;

import java.util.LinkedHashSet;

public class IntersectionOfTwoArray {

	public static void main(String[] args) {
		
		String array1[] = {"C", "Java", "Python", "HTML", "CSS", "JS"};
		String array2[] = {"C", "Java", "CSHarp", "HTML", "CSS"};
		
		LinkedHashSet<String> hs1 = new LinkedHashSet<String>();
		hs1.addAll(Arrays.asList(array1));
		
		LinkedHashSet<String> hs2 = new LinkedHashSet<String>();
		hs2.addAll(Arrays.asList(array2));
			
		hs1.retainAll(hs2);
		System.out.println(hs1);
			
	}

}

/*
Output:

[C, Java, HTML, CSS]

*/