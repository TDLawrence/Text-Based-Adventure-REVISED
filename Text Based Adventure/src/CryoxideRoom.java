
public class CryoxideRoom extends Room{

	public CryoxideRoom(int c, int d) {
		super(c, d);
	}
	
	@Override
	public void enterRoom(Person x) {
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("You found some hidden Cryoxide"); //change
		
	}
	public void leaveRoom(Person x)
	{
		occupant=null;
	}
	
	public String toString()
	{
		return "[ ]";
	}

}
