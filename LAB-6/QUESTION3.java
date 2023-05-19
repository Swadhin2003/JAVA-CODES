import java.util.Scanner;
public class QUESTION3
{   
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("---Select a shape to calculate the area---");
        System.out.println("1.Circle");
        System.out.println("2.Triangle");
        System.out.println("3.Square");
        int choice = input.nextInt();
        switch (choice) 
        {
            case 1:
                System.out.print("Enter the radius of the circle:");
                double radius = input.nextDouble();
                System.out.printf("Area of the circle:%.2f", area(radius));
                break;
            case 2:
                System.out.print("Enter the base and height of the triangle:");
                double base = input.nextDouble();
                double height = input.nextDouble();
                System.out.printf("Area of the triangle:%.2f", area(base, height));
                break;
            case 3:
                System.out.print("Enter the side of the square:");
                int side = input.nextInt();
                System.out.printf("Area of the square:%.2f", area(side));
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
        input.close();
    }
    public static double area(double radius) 
    {
        return 3.14 * radius * radius;
    }
    public static double area(double base, double height) 
    {
        return 0.5 * base * height;
    }
    public static double area(int side) 
    {
        return side * side;
    }
}
