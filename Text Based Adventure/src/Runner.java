import java.util.Scanner;
import java.util.Random;
public class Runner {
private static boolean gameOn = true;
	
	public static void main(String[] args)
	{   //Generate random 2D array of rooms
		Random a=new Random();
	    int h=a.nextInt(10)+1;
	    int i=a.nextInt(10)+1;
	    Room[][] rooms=new Room[h][i];
	    
		Board board=new Board(rooms);
		//Generate Random Board and prints the board.
		 board.printBoard();
		
		 //Fills in Rooms
		for(int n=0;n<rooms.length;n++)
		{for(int g=0;g<rooms[n].length;g++)
		 {rooms[n][g]=new Room(n,g);	
		 }	
		}
		//Create a random winning room.
		int x = (int)(Math.random()*rooms.length);
		int y = (int)(Math.random()*rooms[x].length);
		 rooms[x][y] = new WinningRoom(x, y);
		
		//Create a random party room
		int j = (int)(Math.random()*rooms.length);
		int k = (int)(Math.random()*rooms[x].length);
		rooms[j][k] = new partyRoom(j, k);
		 
		 //Setup player 1 and the input scanner
		Person player1 = new Person("FirstName", "FamilyName", 0,0);
		rooms[0][0].enterRoom(player1);
		Scanner in = new Scanner(System.in);
		while(gameOn)
		{
			System.out.println("Where would you like to move? (Choose N, S, E, W)");
			String move = in.nextLine();
			if(validMove(move, player1, rooms))
			{
				System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());
				
			}
			else {
				System.out.println("Please choose a valid move.");
			}
			
			
		}
		in.close();
	}
	
	public static boolean validMove(String move, Person p, Room[][] rooms)
	{
		move = move.toLowerCase().trim();
		switch (move) {
			case "n":
				if (p.getxLoc() > 0)
				{
					rooms[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					rooms[p.getxLoc()-1][p.getyLoc()].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
			case "e":
				if (p.getyLoc()< rooms[p.getyLoc()].length -1)
				{
					rooms[p.getxLoc()][p.getyLoc()].leaveRoom(p);
				    rooms[p.getxLoc()][p.getyLoc() + 1].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}

			case "s":
				if (p.getxLoc() < rooms.length - 1)
				{
					rooms[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					rooms[p.getxLoc()+1][p.getyLoc()].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}

			case "w":
				if (p.getyLoc() > 0)
				{
					rooms[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					rooms[p.getxLoc()][p.getyLoc()-1].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
			default:
				break;
					
		}
		return true;
	}
	public static void gameOff()
	{
		gameOn = false;
	}
}
