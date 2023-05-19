class Parent 
{
    public void printMessage() 
    {
        System.out.println("This is parent class");
    }
}
class Child extends Parent 
{
    public void printMessage() 
    {
        System.out.println("This is child class");
    }
}
public class QUESTION2 
{
    public static void main(String[] args) 
    {
        Parent parentObj = new Parent();
        Child childObj = new Child();
        parentObj.printMessage(); 
        childObj.printMessage(); 
        Parent parentObj2 = new Child();
        parentObj2.printMessage(); 
    }
}
