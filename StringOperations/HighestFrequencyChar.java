//74. WAP to find highest frequency character in a string.
import java.util.Scanner;

public class HighestFrequencyChar
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
   
    for(int i = 0; i < str.length(); i++) 
		{
			char ch = str.charAt(i);
			if(max < counter[ch]) {
				max = counter[ch];
				
        maxChar = ch;
			}
		}
		System.out.println("\nThe Maximum Occurring Character = " +  maxChar);
		System.out.format("'%c' Character Occurs %d Times ", maxChar, max);	  
    
  }

}