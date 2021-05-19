package student;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student st1=new Student(1,"Tân");
        Student st2=new Student(2,"Vân");
        Student st3=new Student(3,"Hằng");
        st1.display();
        st2.display();
        st3.display();
    }
}
