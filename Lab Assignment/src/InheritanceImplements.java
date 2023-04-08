class Parent{
    public void parentMethod(){
        System.out.println("This method from parent class");
    }
}
class Child extends Parent{
    public void childMethod(){
        System.out.println("This method child class");
    }
}
public class InheritanceImplements {
    public static void main(String[] args) {
        Parent p_ob = new Parent();
        Child c_ob = new Child();

        c_ob.parentMethod();
    }
}
