import java.io.*;  
public class QUESTION2
{ 
    public static void main(String[] args) throws IOException 
    { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.print("Enter the first string:"); 
        String str1 = br.readLine(); 
        System.out.print("Enter the second string:"); 
        String str2 = br.readLine(); 
        System.out.println("Changing the case of the strings:"); 
        System.out.println("The first string in lowercase:" + str1.toLowerCase()); 
        System.out.println("The first string in uppercase:" + str1.toUpperCase()); 
        System.out.println("The second string in lowercase:" + str2.toLowerCase()); 
        System.out.println("The second string in uppercase:" + str2.toUpperCase()); 
        System.out.println("Reversing the strings:"); 
        String str1_rev = new StringBuffer(str1).reverse().toString(); 
        String str2_rev = new StringBuffer(str2).reverse().toString(); 
        System.out.println("The first string reversed:" + str1_rev); 
        System.out.println("The second string reversed:" + str2_rev); 
        System.out.println("Comparing two strings:"); 
        System.out.println("Comparing " + str1 +" and "+ str2 +":"+ str1.compareTo(str2)); 
        System.out.println("Inserting one string into another:"); 
        String str3 = str1.substring(0, str1.length()/2) + str2 + str1.substring(str1.length()/2); 
        System.out.println("The new string after insertion is:"+str3); 
    } 
}