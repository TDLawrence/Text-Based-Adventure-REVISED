
public class partyRoom extends Room {
	public partyRoom(int x, int y)
	{
	  super(x,y);
	}

	public void enterRoom(Person x)
	{System.out.println("This is the party room. Take a break, get up, and dance!");
	 occupant=x;
	 x.setxLoc(this.xLoc);
	 x.setyLoc(this.yLoc);
	 
	}
	
	public void leaveRoom(Person x)
	{
		occupant=null;
	}
}
