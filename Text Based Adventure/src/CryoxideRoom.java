
public class CryoxideRoom extends Room{

	public CryoxideRoom(int c, int d) {
		super(c, d);
	}
	
	@Override
	public void enterRoom(Person x) {
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		Room.cryoxide++;
		System.out.println("You found some hidden Cryoxide! You now have " + Room.cryoxide + " cryoxide."); //change
		
	}
	public void leaveRoom(Person x)
	{
		occupant=null;
	}
	

}
