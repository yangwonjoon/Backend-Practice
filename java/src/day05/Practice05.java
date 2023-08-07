package day05;

import java.util.Scanner;

public class Practice05 {
    public static void main(String[] args) {
        System.out.println("문자열: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strarr = {};
        System.out.println("문자를 입력하세요: ");
        String s = sc.next();
        String result;

//        System.out.println(str.length());
        for(int i=0; i<str.length(); i++){
            strarr[i] = str;
        }

    }
}
