public class QUESTION4
{
    private static int count = 0;
    public QUESTION4() 
    {
        count++;
    }
    public static int getCount() 
    {
        return count;
    }
    public static void main(String[] args) 
    {
        QUESTION4 obj1 = new QUESTION4();
        QUESTION4 obj2 = new QUESTION4();
        QUESTION4 obj3 = new QUESTION4();
        System.out.print("Number of objects created:" + QUESTION4.getCount());
    }
}