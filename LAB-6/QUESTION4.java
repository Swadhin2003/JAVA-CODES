import java.util.Scanner;
class RECTANGLE
{
    int length, breadth;
    void read()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length:");
        length = sc.nextInt();
        System.out.print("Enter breadth:");
        breadth = sc.nextInt();
    }
    int area()
    {
        return length * breadth;
    }
    int perimeter()
    {
        return 2 * (length + breadth);
    }
    void display()
    {   
        System.out.printf("\n---OUTPUT---\n");
        System.out.println("Length:" + length);
        System.out.println("Breadth:" + breadth);
        System.out.println("Area:" + area());
        System.out.println("Perimeter:" + perimeter());
    }
}
class QUESTION4
{
    public static void main(String[] args) 
    {
        RECTANGLE r = new RECTANGLE();
        r.read();
        r.display();
    }
}