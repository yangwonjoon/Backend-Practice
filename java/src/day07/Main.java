package day07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2 ,what;
        Scanner sc = new Scanner(System.in);

        while (true){

            System.out.println("1. 더하기  2. 빼기  3. 곱하기  4.나누기  -1. 종료");
            what = sc.nextInt();
            if(what == -1)
                break;

            System.out.println("num1을 입력하세요: ");
            num1 = sc.nextInt();

            System.out.println("num2을 입력하세요: ");
            num2 = sc.nextInt();

            if(what == 1)
                System.out.println(add(num1,num2));
            else if(what ==2)
                System.out.println(minus(num1,num2));
            else if(what == 3)
                System.out.println(x(num1,num2));
            else if(what == 4)
                System.out.println(div(num1,num2));
            else
                System.out.println("님 잘못입력");
        }


    }

    public static int add(int a, int b){
        return a+b;
    }
    public static int minus(int a, int b){
        return a-b;
    }
    public static int x(int a, int b){
        return a*b;
    }
    public static double div(int a, int b){
        return a/b;
    }

}
