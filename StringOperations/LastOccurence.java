//program to find the last occurrence of a character in a string
import java.util.Scanner;

public class LastOccurence 
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
		int index = str.lastIndexOf(ch);
    System.out.println("The Last occurence of a character "+ ch + " in a string " + str + " is at index "+ index);
		
	}

}