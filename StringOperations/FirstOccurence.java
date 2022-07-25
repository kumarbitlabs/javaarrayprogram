//program to find the first occurrence of a character in a string
import java.util.Scanner;

public class FirstOccurence 
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
		int index = str.indexOf(ch);
    System.out.println("The first occurence of a character "+ ch + " in a string " + str + " is at index "+ index);
		
	}

}