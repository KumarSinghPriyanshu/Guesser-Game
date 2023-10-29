
import java.util.*;


class LaunchGame {
   int guesser;
	
     int guessernum()
     {
	Scanner scan= new Scanner(System.in);
	System.out.print("guess the number ");
	guesser =scan.nextInt();
	return guesser;
     }
}

class Player
{
	int guessNum;
	
	public int PlayerguessNumber(){
		Scanner scan= new Scanner(System.in);
		System.out.print("player guess the number ");
		guessNum=scan.nextInt();
		return guessNum;
	}
	
}
class Umpire{
		
		int guessFromGuesser;
		int guessFromPlayer1;
		int guessFromPlayer2;
		int guessFromPlayer3;
		
		void UmpireMatchNum()
		 {
			 LaunchGame g= new LaunchGame();
			guessFromGuesser= g.guessernum();
			
			
			 
		 }
		void guessFromplayer(){
			Player p1=new Player();
			Player p2=new Player();
			Player p3=new Player();
			guessFromPlayer1=p1.PlayerguessNumber();
			guessFromPlayer2=p2.PlayerguessNumber();
			guessFromPlayer3=p3.PlayerguessNumber();
		}
		
		void compare()
		{
			if(guessFromGuesser==guessFromPlayer1)
			{
				System.out.println("player1 won the match");
			}
		
		else if(guessFromGuesser==guessFromPlayer2)
		{
			System.out.println("player2 won the match");
		}
		else if(guessFromGuesser==guessFromPlayer3)
		{
			System.out.println("player2 won the match");
		}
		
		
		else {
			System.out.println("loss the match");
		     }
     }
	
	}
	public class LaunchGame5
	{
		public static void main(String [] args)
		{
		System.out.println("game started");
		
		Umpire u =new Umpire();
		
		u. UmpireMatchNum();
		
		u.guessFromplayer();
		u.compare();
	}
	
	}
	

