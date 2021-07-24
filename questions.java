package game; 
import java.lang.Math;
class questions 
{
	int i=0,z;
        answer o=new answer();
	checkanswer ob=new checkanswer();
	prize qr=new prize();
	int creation1()
	{
	do
	{
	int max = 10,min = 1,range = max - min + 1;
	int ch=(int)(Math.random() * range) + min;
	switch(ch)
	{
    case 1: System.out.println("Q.What is the capital of France?\n1.Paris\t2.Luxembourg\n3.Madrid\t4.Berlin");
            z=o.choice();
            i++;
            ob.check(ch,z,i);
            break;
    case 2: System.out.println("Q.What is the venue for the 2022 FIFA World Cup?\n1.Mexico\t2.Qatar\n3.England\t4.Saudi Arabia");
    z=o.choice();
    i++;
    ob.check(ch,z,i);
    break;
 case 3: System.out.println("Q.Who was elected as the 45th President of the United States of America in 2016?\n1.Barack Obama\t2.Al Gore\n3.Sarah Palin\t4.Donald Trump");
    z=o.choice();
    i++;
    ob.check(ch,z,i);
    break;
    case 4: System.out.println("Q.What is the name of the player that broke the Messi-Ronaldo dominance in the Ballon d'Or?\n1.Luka Modric\t2.Antoine Griezmann\n3.Mohammed Salah\t4.Virgil Van Dijk");
    z=o.choice();
    i++;
    ob.check(ch,z,i);
    break;
    case 5: System.out.println("Q.Name the only antagonist that has appeared in every iteration of the Avengers movie series.\n1.Loki\t2.Ronan the Destroyer\n3.Thanos\t4.The Mandarin");
    z=o.choice();
    i++;
    ob.check(ch,z,i);
    break;
    case 6: System.out.println("Q.Where is the West Edmonton Mall(WEM),North America's largest shopping mall,located?\n1.Alberta,Canada\t2.Toronto,Canada\n3.Colorado,USA\t4.California,USA");
    z=o.choice();
    i++;
    ob.check(ch,z,i);
    break;
    case 7: System.out.println("Q.What director has directorial credits for both DCEU and MCU?\n1.Joe Russo\t2.Guillermo del Toro\n3.Zack Snyder\t4.Joss Whedon");
    z=o.choice();
    i++;
    ob.check(ch,z,i);
    break;
    case 8: System.out.println("Q.Who became the first batsman to score 5 centuries in a single edition of a World Cup in 2019?\n1.Steve Smith\t2.Ben Stokes\n3.Rohit Sharma\t4.Shakib al-Hasan");
    z=o.choice();
    i++;
    ob.check(ch,z,i);
    break;
	}
	}
	while(i!=4||i!=0||z!=13);
	return i;
	}
}
