package accessModifier;

public class AccessModifier {
    public static void main(String[] args) {
        AccessModifier obj=new AccessModifier();
        System.out.println(obj.data);
        obj.msg();

    }

    private int data=40;

    private  void msg(){
        System.out.println("Hello java");
    }


}
