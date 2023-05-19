import java.util.Scanner;
public class QUESTION1
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int a=sc.nextInt();
        System.out.print("Enter 2nd number:");
        int b=sc.nextInt();
        System.out.print("Enter 3rd number:");
        int c=sc.nextInt();
        if (a>b)
        {
            if (a>c)
               System.out.print(a + " is the largest."); 
            else
               System.out.print(c + " is the largest.");
        }
        else
        {
            if(b>c)
                System.out.print(b + " is the largest.");
            else
                System.out.print(c + " is the largest.");
        } 
    }
}