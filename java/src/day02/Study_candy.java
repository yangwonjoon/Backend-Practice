package day02;

import java.util.Scanner;

public class Study_candy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("인원 수: ");
        int person = sc.nextInt();
        System.out.print("사탕 개수: ");
        int candy = sc.nextInt();

        System.out.println("1인당 사탕 개수: " + candy/person);
        System.out.println("남늠 사탕 개수: " + candy%person);
    }
}
