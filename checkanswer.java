package game;
public class checkanswer 
{
	void check(int ch,int z,int i)
	{
	prize ob1=new prize();
	String s;
	switch(ch)
	{
	case 1: if(z==1)
	{
		System.out.println("Congratulations! That is the correct answer");
		s=ob1.money1(i);
		System.out.println(s);
	}
	else if(z==2||z==3||z==4)
	{
		System.out.println("That is unfortunately the wrong answer.You lose");
		i=0;
	}
	break;
	case 2:if(z==2)
	{
		System.out.println("Congratulations! That is the correct answer");
		s=ob1.money1(i);
		System.out.println(s);
	}
	else if(z==1||z==4||z==3)
	{
		System.out.println("That is unfortunately the wrong answer.You lose");
		i=0;
	}
	break;
	case 3:if(z==4)
	{
		System.out.println("Congratulations! That is the correct answer");
		s=ob1.money1(i);
		System.out.println(s);
	}
	else if(z==1||z==2||z==3)
	{
		System.out.println("That is unfortunately the wrong answer.You lose");
		i=0;
	}
	break;
	case 4:if(z==1)
	{
		System.out.println("Congratulations! That is the correct answer");
		s=ob1.money1(i);
		System.out.println(s);
	}
	else if(z==3||z==2||z==4)
	{
		System.out.println("That is unfortunately the wrong answer.You lose");
		i=0;
				}
	break;
	case 5:if(z==3)
	{
		System.out.println("Congratulations! That is the correct answer");
		s=ob1.money1(i);
		System.out.println(s);
	}
	else if(z==1||z==2||z==4)
	{
		System.out.println("That is unfortunately the wrong answer.You lose");
		i=0;
	}
	break;
	case 6:if(z==1)
	{
		System.out.println("Congratulations! That is the correct answer");
		s=ob1.money1(i);
		System.out.println(s);
	}
	else if(z==3||z==2||z==4)
	{
		System.out.println("That is unfortunately the wrong answer.You lose");
		i=0;
	}
	break;
	case 7:if(z==4)
	{
		System.out.println("Congratulations! That is the correct answer");
		s=ob1.money1(i);
		System.out.println(s);
	}
	else if(z==1||z==2||z==3)
	{
		System.out.println("That is unfortunately the wrong answer.You lose");
		i=0;
	}
	break;
	case 8:if(z==3)
	{
		System.out.println("Congratulations! That is the correct answer");
		s=ob1.money1(i);
		System.out.println(s);
	}
	else if(z==1||z==2||z==4)
	{
		System.out.println("That is unfortunately the wrong answer.You lose");
		i=0;
	}
	break;
	}
	}
}
