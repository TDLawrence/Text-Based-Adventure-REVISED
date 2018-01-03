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
		System.out.println("Thank you for jacking in, Cybersquad, we need your help! Hacker has interfered with Motherboard's central cooling systen. "
				+ "Your mission is to obtain the special coolant from Castle Blanka known as Cyroxide. You will also need to find out the exact volume of the coolant needed."
				+ "Go from room to room in Castle Blanka and solve the standard weights and measures problems in order to obtain the closely guarded Cryoxide. ");
		
	}
		
	public String toString()
	{
		return "[CC]";
	}
	
	
}

