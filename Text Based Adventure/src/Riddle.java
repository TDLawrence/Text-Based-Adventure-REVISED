import java.util.Random;
import java.util.Scanner;
public class Riddle {

	public int getRiddles()
	{Random a=new Random();
	 int riddleNumber=a.nextInt(10)+1;
	 return riddleNumber;
		
	}
	public void printRiddle()
	{Riddle riddle=new Riddle();
	 if(riddle.getRiddles()==1)
	    {System.out.println("What walks on four legs in the morning, two at noon, and three in the evening?");}
     if(riddle.getRiddles()==2)
        {System.out.println("I am thinking of a number that is divisible by three and twelve and is between 80 and 100. What is it?");}
     if(riddle.getRiddles()==3)
        {System.out.println("A cowboy comes into town on Friday, stays for three days, and leaves on Friday? How did he do it?");}
     if(riddle.getRiddles()==4)
        {System.out.println("I am intelligent but I never speak, can walk but I never talk, and sleep but never long. What am I?");}
      if(riddle.getRiddles()==5)
        {System.out.println("I am late but always on time, short but yet long, and annoying yet indispensible. What am I?");}
      if(riddle.getRiddles()==6)
        {System.out.println("I am quiet but yet loud, kind but yet harsh, and a daydreamer but yet in relaity. Who am I?");}
      if(riddle.getRiddles()==7)
        {System.out.println("David's father has three sons-Snap, Crackle, and who else?");}
      if(riddle.getRiddles()==8)
        {System.out.println("A fireman has two sons, Jose and who else");}
      if(riddle.getRiddles()==9)
        {System.out.println("Knock knock! This group has been know by this name since 1931");}
      if(riddle.getRiddles()==10)
        {System.out.println("This country measures its economy on gross national HAPPINESS.");}
      if (riddle.getRiddles()==11)
        {System.out.println("I never sing, but you love my melodious voice. What am I?");}
	 }
	public boolean isCorrect()
	{Riddle riddles=new Riddle;
	
		
	}
		
	}

