
public class WinningRoom extends Room{
	public WinningRoom(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enterRoom(Person x) {
		// TODO Auto-generated method stub
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		
		
		if(Room.cryoxide >= 10) {
			Runner.gameOff();
			System.out.println("You found enough cryoxide!");
		}
		System.out.println("You need to collect more cryoxide! You have " + Room.cryoxide + ".");
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
