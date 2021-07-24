package game;  
import java.util.Scanner;
class input
{
	int ch;
	Scanner sc=new Scanner(System.in);
	String username()
	{
    System.out.println("Enter your name: ");
    String name=sc.nextLine();
    return name;
	}
	int userage()
	{
	 System.out.println("Enter your age: ");
	    int age=sc.nextInt();
	    return age;
	}
	
}
