//program to find the all occurrences of every character in a string
//76. WAP to count frequency of each character in a string
import java.util.Scanner;

public class EveryCharAllOccu
{
	public static void main(String[] args) 
  {
		String str;
		int max=-1; char maxChar=' ';
		Scanner sc= new Scanner(System.in);

		System.out.print("\nEnter the String: ");
		str = sc.nextLine();
		
		int counter[] = new int[256];  
    
    int len = str.length();  
     // loop through the string and count frequency of every 
     //character and store it in counter array  
    for (int i = 0; i < len; i++)   
    {  
           counter[(int) str.charAt(i)]++;  
    }  
    //print Frequency of characters  
    for (int i = 0; i < 256; i++)   
    {  
            if (counter[i] != 0)   
            {  
                 //prints frequency of characters      
                 System.out.println((char) i + " --> " + counter[i]);  
            }  
    }
    
  }

}