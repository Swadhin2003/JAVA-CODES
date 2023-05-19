import java.util.Scanner;
public class QUESTION5
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first name:");
        String fs=sc.nextLine();
        System.out.println("First name:"+ fs);
        System.out.print("Enter last name:");
        String ls=sc.nextLine();
        System.out.println("Last name:"+ ls);
        System.out.println(ls + " " + fs);
    }
}