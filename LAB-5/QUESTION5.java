import java.util.Scanner;
public class QUESTION5
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the list:");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.print("Enter the elements of the list:");
        for (int i = 0; i < size; i++) 
        {
            numbers[i] = scanner.nextInt();
        }
        int[] counts = new int[size];
        for (int i = 0; i < size; i++) 
        {
            int count = 0;
            for (int j = 0; j < size; j++) 
            {
                if (numbers[i] == numbers[j]) 
                {
                    count++;
                }
            }
            counts[i] = count;
        }
        System.out.print("Element counts:");
        for (int i = 0; i < size; i++) 
        {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) 
            {
                if (numbers[i] == numbers[j]) 
                {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) 
            {
                System.out.print(numbers[i] + ":" + counts[i] + " ");
            }
        }
    }
}