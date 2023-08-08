package day06;

public class Student {


    public String sEntryNumber;
    public String sName;
    public String sAddress;

//생상자
    public Student(){

    }

//getter, setter
    public void setsEntryNumber(String sEntryNumber){
        this.sEntryNumber = sEntryNumber;
    }
    public String getsEntryNumber() {
        return sEntryNumber;
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }
    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }


    //메소드

}
