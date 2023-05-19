import java.util.Scanner;
public class QUESTION2
{ 
    public int subtract(int a, int b) 
    {
        return a - b;
    }
    public double subtract(double a, double b) 
    {
        return a - b;
    }
    public static void main(String[] args) 
    {
        QUESTION2 calculator = new QUESTION2();
        int result1 = calculator.subtract(5, 3);
        double result2 = calculator.subtract(9.5, 7.5);
        System.out.println(result1); 
        System.out.println(result2); 
    }
}