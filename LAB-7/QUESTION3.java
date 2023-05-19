public class QUESTION3
{
    public static void main(String[] args) 
    {
        A ob1 = new A();
        A ob2 = new B();
        B ob3 = new B();
        ob1.print();
        ob2.print();
        ob3.print();
    }
}
class A 
{
    public void print() 
    {
        System.out.println("Class A");
    }
}
class B extends A 
{
    public void print() 
    {
        System.out.println("Class B");
    }
}
