package com.String.Constructor;

public class Stringbuff {

	public static void main(String[] args) {
		//public static void main(String[] args) {

	        StringBuffer sb = new StringBuffer("Hello");  // This creates a StringBuffer object
	        String s2 = new String(sb);  // This converts the StringBuffer to a String
	        s2 = s2.concat(" programming");  // Reassign the concatenated result to s2
	        System.out.println(s2);  // This will print "Hello programming"
	    }
	

	}


