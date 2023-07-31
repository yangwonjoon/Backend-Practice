package com.intro01;

public class forloop {

	public static void main(String[] args) {
//		for(int i=0; i<6; i++) {
//			System.out.println(i+" is:");
//		}
		
		String[] name = {
				"k1","k2","k3","k4","k5"
		};
		
//		for(int i=2; i<name.length; i+=2) {
//			System.out.println(name[i]);
//		}
//		
//		for(String i : name) {
//			System.out.println(i);
//		}
		
		int i = 0;
		while(i < name.length) {
			System.out.println(i);
			i++;
		}
	}

}
