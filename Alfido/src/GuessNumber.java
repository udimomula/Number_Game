import java.util.*;
public class GuessNumber {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Random ran=new Random();
		int Compnum = ran.nextInt(100)+1;
		System.out.println("Guess a number between 1 to 100");
		while(true)
		{
			int guess=sc.nextInt();
			if(Compnum>guess)
			{
				System.out.println("The Number is too small, try again ");
			}
			else if(Compnum<guess)
			{
				System.out.println("The Number is too large, try again ");
			}
			else
			{
				System.out.println("Congratulations! You guessed right!");
				break;
			}
			
		}
		
	}

}
