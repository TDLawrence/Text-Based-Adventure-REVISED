public class ControlCentralI 
{
	public ControlCentralI(int x, int y)
	{
	  super(x,y);
	}

	public void enterRoom(Person x)
	{
		System.out.println("This is!");
		occupant=x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
	
	}
	
	public void leaveRoom(Person x)
	{
		occupant=null;
	}
}

}
