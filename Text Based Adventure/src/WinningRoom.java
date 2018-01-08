
public class WinningRoom extends Room{
	public WinningRoom(int x, int y) {
		super(x, y);
	}
	
	@Override

	public void enterRoom(Person x) {
		// TODO Auto-generated method stub
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		
		if(Room.cryoxide >= 10) {
			System.out.println("You found enough cryoxide! You found " + Room.cryoxide + ".");
			Runner.gameOff();
		}
		if (Room.cryoxide < 10) {
			System.out.println("You need to collect more cryoxide! You have " + Room.cryoxide + "." + " You need 10.");	
		}
		
	}
	
	public void leaveRoom(Person x)
	{
		occupant=null;
	}
	
	public String toString()
	{
		return "[ww]";
	}
	
}
