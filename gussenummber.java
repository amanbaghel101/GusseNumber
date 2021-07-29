import java.util.Random;

import java.util.Scanner;

class Game
{
	public int number;
	public int inputNumber;
	public int noOfGuesses=0;
	
	public int getNoOfGuesses() {
		return noOfGuesses;
	}
	
	public void setNoOfGuesses(int noOfGuesses) {
		this.noOfGuesses = noOfGuesses;
	}
	

	Game()
	{
		Random rand= new Random();
	    this.number=rand.nextInt(50);
	}
	//@SuppressWarnings("resource")
	void takeUserInput() {
		System.out.println("Guess the number");
		Scanner sc =new Scanner(System.in);
		inputNumber=sc.nextInt();
		
	}
	boolean isCorrectNumber()
	{
		noOfGuesses++;
		if(inputNumber==number) 
		{
			System.out.format("yes you gussed it right, it was %d\n you gussed it in %d attempt", number);
			return true;
		}
		else if(inputNumber<number) {
			System.out.println("too less...");
		}
		else if(inputNumber>number) {
			System.out.println("too high...");
		}
		return false;
		
	}
}
public class gussenummber {
	public static void main(String[] args) {
		
		Game g = new Game();
		boolean b = false;
		while(!b) // with the help of this now ur code take input again and agian while you do not take correct input
		{ 
		g.takeUserInput();
		b = g.isCorrectNumber();
		System.out.println(b);
		}
		}

}
