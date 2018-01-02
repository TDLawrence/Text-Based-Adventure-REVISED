public class ControlCentralI extends Room
{
	public ControlCentralI(int x, int y) 
	{
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enterRoom(Person x) {
		// TODO Auto-generated method stub
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("Thank you for coming Cybersquad, we need your help! Hacker has interfered with Motherboard's central cooling systen. "
				+ "Your mission is to obtain the special coolant from CastleBlanka known as Cyroxide. You will also need to find out the exact volume of the coolant needed.");
		Runner.gameOff();
	}
		
	public String toString()
	{
		return "[CC]";
	}
	
}

