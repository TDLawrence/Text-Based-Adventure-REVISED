
public class Board
{
	private Room [] [] rooms;
	
	public Board (Room[][]rooms)
	{
		this.rooms=rooms;
	}
	public Board (int size)
	{
		this.rooms=new Room [size][size];
	}
}
