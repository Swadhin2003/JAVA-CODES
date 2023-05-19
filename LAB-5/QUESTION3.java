import java.util.Arrays;
import java.util.Scanner;
public class QUESTION3 
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
        Arrays.sort(numbers);
        System.out.print("Sorted list:" + Arrays.toString(numbers));
    	}
}