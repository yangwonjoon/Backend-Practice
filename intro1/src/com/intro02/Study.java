package com.intro02;

public class Study {

	public static void main(String[] args) {
		for(int i=0; i<6; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("#");
			}
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
