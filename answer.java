package game;
import java.util.Scanner;
class answer
{
int choice()
	{ 
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter your answer: ");
	    a=sc.nextInt();
		if(a==1||a==2||a==3||a==4)
		return a;
		else if(a==5)
		return 13;
     }
    }