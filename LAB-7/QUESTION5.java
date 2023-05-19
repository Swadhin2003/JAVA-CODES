import java.util.*;
class Account 
{
    int acc_no;
    int balance;
    public Account(int a, int b) 
    {
        acc_no = a;
        balance = b;
    }
    public void display() 
    {
        System.out.println("Account number:"+ acc_no);
        System.out.println("Balance:"+ balance);
    }
}
class person extends Account 
{
    String name;
    int aadhar_no;
    public person(int a, int b, String c, int d) 
    {
        super(a, b);
        name = c;
        aadhar_no = d;
    }
    public void display() 
    {
        System.out.println("Name:"+ name);
        System.out.println("Aadhar Number:"+ aadhar_no);
        System.out.println("Account number:"+ acc_no);
        System.out.println("Balance:"+ balance);
        System.out.println(" ");
    }
}
class QUESTION5
{
    public static void main(String[] args) 
    {
        person p1 = new person(0001, 10000, "Jack", 99234167);
        person p2 = new person(0002, 20000, "Robert", 99944167);
        person p3 = new person(0003, 30000, "Jennifer", 99229167);
        person p4 = new person(0004, 40000, "Carla", 99234847);
        person p5 = new person(0005, 40000, "Mathew", 90234167);
        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();
    }
}