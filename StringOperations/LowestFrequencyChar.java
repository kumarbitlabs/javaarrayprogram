//74. WAP to find Lowest frequency character in a string.
import java.util.Scanner;

public class LowestFrequencyChar
{
	public static void main(String[] args) 
  {
		String str;
		int min=999;char minChar=' ';
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
    //int min=counter[0];
    for(int i = 0; i < str.length(); i++) 
		{
			char ch = str.charAt(i);
			if(min>counter[ch]) {
				min = counter[ch];
				
        minChar = ch;
			}
		}
		System.out.println("\nThe Maximum Occurring Character = " +  minChar);
		System.out.format("'%c' Character Occurs %d Times ", minChar, min);	  
    
  }

}