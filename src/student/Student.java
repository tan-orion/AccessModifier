package student;

public class Student {
    private int rollno;
    private String name;
    private static String collect="BBDIT";
    //constructor to initialize the variable
    Student (int r,String n){
        rollno=r;
        name=n;
    }
    // static method to change the valus of static variable
    static void change(){
        collect="Codegym";
    }
    // method to  display values
    void display(){
        System.out.println(rollno+" "+name+" "+collect);
    }
}
