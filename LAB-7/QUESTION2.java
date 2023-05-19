import java.util.*;
class plate 
{
    int w1;
    int l1;
    int h1;
    public plate(int a, int b, int c) 
    {
        w1 = a;
        l1 = b;
        h1 = c;
    }
}
class box extends plate 
{
    int w2;
    int l2;
    int h2;
    public box(int a, int b, int c, int d, int e, int f) 
    {
        super(a, b, c);
        w2 = d;
        l2 = e;
        h2 = f;
    }
}
class woodbox extends box 
{
    int w3;
    int l3;
    int h3;
    public woodbox(int a, int b, int c, int d, int e, int f, int g, int h, int i) 
    {
        super(a, b, c, d, e, f);
        w3 = g;
        l3 = h;
        h3 = i;
    }
    void show() 
    {
        System.out.println("width from class plate:" + w1);
        System.out.println("length from class plate:" + l1);
        System.out.println("height from class plate:" + h1);
        System.out.println("width from class box:" + w2);
        System.out.println("length from class box:" + l2);
        System.out.println("height from class box:" + h2);
        System.out.println("width from class woodbox:" + w3);
        System.out.println("length from class woodbox:" + l3);
        System.out.print("height from class woodbox:" + h3);
    }
}
class QUESTION2
{
    public static void main(String args[]) 
    {
        woodbox w1 = new woodbox(31, 12, 23, 14, 15, 62, 37, 38, 39);
        w1.show();
    }
}