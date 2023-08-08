package day06;

public class Main {

    public static void main(String[] args) {

//        Employee employee1 = new Employee(1, "yang", 1000000);
//        System.out.println(employee1.dSalary);
//
//        System.out.println(employee1.getReturnTax(0.075));

        int iEmpNo = 10;
        String sEmpName = "yang";
        double dSalary = 15000.0;

        double ratio = 0.015;
        double ret;

        // 1
//        ret = dSalary * ratio;

        //2
//        double sum = ret(dSalary, ratio);

//3
        Main sum = new Main();
        double a = sum.ret(dSalary, ratio);

        System.out.println(a);
    }

//    public static double ret(double a, double b){
//
//        double sum = a*b;
//
//        return sum;
//    }

    public double ret(double a, double b){
        double sum = a*b;

        return sum;
    }
}

