import java.util.Random;
import java.util.Scanner;
public class Riddle {
    String question;
    String answer;
    public Riddle()
    {   
    	Riddle riddle1=new Riddle();
    	this.question=riddle1.getQuestion(riddle1.getRiddles());
    	
    }
    
	public int getRiddles() 
	{
		Random a=new Random();
		int riddleNumber=a.nextInt(10)+1;
		return riddleNumber;
	}
	
	public String getQuestion(int riddleNumber) 
	{
		Riddle riddle=new Riddle();
		riddleNumber=riddle.getRiddles();
		String question="";
	 if(riddleNumber==1)
	    {question="What walks on four legs in the morning, two at noon, and three in the evening?";}
	 
     if(riddleNumber==2)
        {question="I am thinking of a number that is divisible by three and twelve and is between 80 and 100. What is it?";}
     
     if(riddleNumber==3)
        {question="A cowboy comes into town on Friday, stays for three days, and leaves on Friday? How did he do it?";}
     
     if(riddleNumber==4)
        {question="I am intelligent but I never speak, can walk but I never talk, and sleep but never long. What am I?";}
     
      if(riddleNumber==5)
        {question="I am late but always on time, short but yet long, and annoying yet indispensible. What am I?";}
      
      if(riddleNumber==6)
        {question="I am quiet but yet loud, kind but yet harsh, and a daydreamer but yet in reality. Who am I?";}
      
      if(riddleNumber==7)
        {question="David's father has three sons-Snap, Crackle, and who else?";}
      
      if(riddleNumber==8)
        {question="A fireman has two sons, Jose and who else";}
      
      if(riddleNumber==9)
        {question="Knock knock! This group has been know by this name since 1931";}
      
      if(riddleNumber==10)
        {question="This country measures its economy on gross national HAPPINESS.";}
      
      if (riddleNumber==11)
        {question="I never sing, but you love my melodious voice. What am I?";}
      
      return question;
	 }
	
	 public String getAnswer(int riddleNumber) {
		 Riddle riddle=new Riddle();
		 riddleNumber=riddle.getRiddles();
		 String answer = "";
		 if(riddleNumber==1)
		 	{answer="Humans";}
		 
		 if(riddleNumber==2)
		 	{answer="96";}
		 
		 if(riddleNumber==3)
		 	{answer="The horse's name was Friday";}
		 
		 if(riddleNumber==4)
		 	{answer="A baby";}
		 
		 if(riddleNumber==5)
		 	{answer="The New York Subway";}
		 
		 if(riddleNumber==6)
		 	{answer="Your dejected crush";}
		 
		 if(riddleNumber==7)
		 	{answer="David";}
		 
		 if(riddleNumber==8)
		 	{answer="Hose B";}
		 
		 if(riddleNumber==9)
		 	{answer="Jehovah's Witnesses";}
		 
		 if(riddleNumber==10)
		 	{answer="Bhutan";}
		 
		 if (riddleNumber==11)
		 	{answer="Hummingbird";}
		 
      return answer;
		 
	 }
	public boolean isCorrect() {
		Riddle riddles=new Riddle();
		Scanner answer=new Scanner(System.in);
		if (answer.nextLine()==riddles.getAnswer(riddles.getRiddles()))
		{
			return true;	 
		}
		return false;	
	}		
}

	
