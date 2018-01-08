
public class Room {
	Person occupant;
	int xLoc,yLoc;
	Riddle riddle;
	Ruler ruler;
	
	public static int cryoxide;			//Room.cryoxide++ wherever to add
	
	public Room(int x, int y)
	{
		this.xLoc = x;
		this.yLoc = y;
		this.ruler=ruler;
	}
	
	public String toString()
	{
	
	 return "[  ]";
		
	}
	
	public void enterRoom(Person x)
	{
		System.out.println("You enter a plain old room");
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
	}
	
	public void meetRuler(Person x,Ruler ruler)
	{
		System.out.print("Hi, "+x.firstName+", I am"+ruler.getTitle()+ ruler.familyName);
	}
	
	public void Riddles()
	{   Riddle x=new Riddle();
		x.getRiddles();
		x.getQuestion(x.getRiddles());
		if (x.isCorrect())
		{Room.leaveRoom(this.occupant)
			
		}
	 
		
	  }
	
	public void leaveRoom(Person x)
	{
		occupant = null;
	}
}
