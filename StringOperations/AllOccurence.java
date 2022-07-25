//program to find the all occurrences of a character in a string
import java.util.Scanner;

public class AllOccurence 
{
	public static void main(String[] args) 
  {
		String str;
		char ch;
		Scanner sc= new Scanner(System.in);

		System.out.print("\nEnter String to Find First Char Occur =  ");
		str = sc.nextLine();
		
		System.out.print("\nEnter the Character to Find =  ");
		ch = sc.next().charAt(0);
    
    int count=0;
    for(int i=0; i<str.length(); i++)
    {
      if(str.charAt(i) == ch)
      count++;
    }
  
  System.out.println("The Character '"+ch+"' appears "+count+" times.");
		
	}

}