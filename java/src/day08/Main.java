package day08;

public class Main {
    public static void main(String[] args) {

        int[] num = {10, 10, 10, 10,};
        int[] current = {6, 4, 8, 9};
        int[] div ={0,0,0,0};

        for(int i=0; i<10; i++){
            for(int k=0; k<num.length; k++){
                div[k] = num[k] - current[k];
                current[k] += div[k];
            }



        }
    }
}
