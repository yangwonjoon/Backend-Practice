//package day01;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Study_scanner {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        //과락
//        System.out.print("math point?");
//        int math = sc.nextInt();
//        System.out.print("english point?");
//        int english = sc.nextInt();
//        System.out.print("science point?");
//        int science = sc.nextInt();
//
//        int sum = math+english+science;
//        double average = (double) sum/3;
//
//
//        System.out.println("합: " + sum);
//        System.out.printf("평균: %.2f \n", average);
////        System.out.print("\n");
//
//        int [] result={0,0,0,0,0};
//        String [] list={"합","평균","수학","영어","과학"};
//
//        if(sum < 200)
//            result[0] +=1;
//        else if(average <=70)
//            result[1] +=1;
//        else if(math <=60)
//            result[2] +=1;
//        else if(english <=60)
//            result[3] +=1;
//        else if(science <=60)
//            result[4] +=1;
//
//        ArrayList<String> resultSub = new ArrayList<>();
//
//        for(int i=0; i<result.length; i++){
//            if(result[i] == 1)
//                resultSub.add(list[i]);
//        }
//        System.out.println("불합격이유는" + resultSub);
//    }
//}
