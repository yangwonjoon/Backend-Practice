package day06;

public class Employee {
    private int iEmpNo;
    private String sEmpName;
    private double dSalary;

    public Employee() {

    }

    public Employee(int iEmpNo, String sEmpName, double dSalary) {
        this.dSalary = dSalary;
        this.iEmpNo = iEmpNo;
        this.sEmpName = sEmpName;
    }

    //동적 메소드
    public double getReturnTax(double ratio) {

        double dTax = dSalary * ratio;

        return dTax;
    }


    public double getdSalary() {
        return dSalary;
    }

    public void setdSalary(double dSalary) {
        this.dSalary = dSalary;
    }

    public int getiEmpNo() {
        return iEmpNo;
    }

    public void setiEmpNo(int iEmpNo) {
        this.iEmpNo = iEmpNo;
    }

    public String getsEmpName() {
        return sEmpName;
    }

    public void setsEmpName(String sEmpName) {
        this.sEmpName = sEmpName;
    }
}
