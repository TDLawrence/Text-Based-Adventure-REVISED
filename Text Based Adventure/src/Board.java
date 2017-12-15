
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
	public void printBoard()
	{for(int i=0;i<rooms.length;i++)
	 {for (int j=0;j<rooms[i].length;j++)
	   {System.out.print(rooms[i][j]);
		  
	   }
		 System.out.println();
	  
		
	 }
		
	}
}
