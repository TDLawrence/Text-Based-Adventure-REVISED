
public class Cryoxide extends Room {
	int cryoxide = 0;
	public CryoxideRoom (int c, int d)
	{
		super(c, d);
		
	}
	@Override
	public void enterRoom(Person x) {
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("You found Cryoxide");
		cryoxide++;
	}
	public void leaveRoom(Person x)
	{
		occupant=null;
	}
}	