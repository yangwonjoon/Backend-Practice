package day01;

import java.util.Scanner;

public class Study_calu {
    public static void main(String[] args) {

        while(true){
            System.out.println("계산기 프로그램임");
            System.out.println("1: 더하기  2: 빼기  3: 곱하기  4:  나누기");
            System.out.println("-1 입력하면 나가집니다~");
            Scanner sc = new Scanner(System.in);
            int what = sc.nextInt();



            if (what == 1){
                System.out.println("what is num1?");
                int num1 = sc.nextInt();
                System.out.println("what is num2");
                int num2 = sc.nextInt();
                System.out.println(add(num1, num2));
            }
            else if(what == 2){
                System.out.println("what is num1?");
                int num1 = sc.nextInt();
                System.out.println("what is num2");
                int num2 = sc.nextInt();
                System.out.println(minus(num1, num2));
            }
            else if(what == 3){
                System.out.println("what is num1?");
                int num1 = sc.nextInt();
                System.out.println("what is num2");
                int num2 = sc.nextInt();
                System.out.println(mul(num1, num2));
            }
            else if(what == 4){
                System.out.println("what is num1?");
                int num1 = sc.nextInt();
                System.out.println("what is num2");
                int num2 = sc.nextInt();
                System.out.println(div(num1, num2));
            }
            else if(what == -1){
                break;
            }
            else{
                System.out.println("님 숫자 잘못 입력함");
            }

            for(int i=0; i<20; i++)
                System.out.print("*");
            System.out.println("\n\n\n");
        }

    }

    public static int add(int a, int b){
        return a+b;
    }
    public static int minus(int a, int b){
        return a-b;
    }
    public static int mul(int a, int b){
        return a*b;
    }
    public static int div(int a, int b){
        return a/b;
    }
}
