 package game;
public class prize 
{
String money1(int i)
{
	String s1=" ";
	if(i==1)
		s1+="You have won Rs.1000";
	else if(i==2)
		s1+="You have won Rs.2000";
	else if(i==3)
		s1+="You have won Rs.4000";
	else if(i==4)
		s1+="You have won Rs.10000";
	return s1;
		
}
int money2(int i)
{
	int mon=0;
	if(i==1)
		mon=1000;
	else if(i==2)
	    mon=2000;
	else if(i==3)
		mon=4000;
	else if(i==4)
        mon=10000;
	else
		mon=0;
	return mon;
	}
}
