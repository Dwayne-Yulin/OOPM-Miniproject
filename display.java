package game;
 public class display
{
	public String name1;
	public int age1,prize1,l;
	public static void main(String args[])
	{
		System.out.println("\t\tWelcome to Kaun Banega Crorepati");
		System.out.println("Press any key from 1 to 4 to enter your answer and press key 5 anytime to quit");
		display d=new display();
		d.input1();
		d.gamestart();
		d.display1();
	}
	void input1()
	{
		input u=new input();
		name1=u.username();
		age1=u.userage();
	}
	void gamestart()
	{
		questions p=new questions();
		l=p.creation1();
	}
	void display1()
	{
		result r=new result();
		prize z=new prize();
		prize1=z.money2(l);
		r.scorecard();
	}

}
