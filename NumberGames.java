import java.util.Random;
import java.util.*;

class Game
{
    private int guess;
    private int chance;

    public Game()
    {
        Random r = new Random();
        guess =r.nextInt(100)+1;
        chance = 4;


    }

    public void play()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ******************Here is the game of guessing number*");
        System.out.println("You need to guess the number in maximum 4 chances");

        while(chance>0 )
        {
            System.out.print("Enter the number in your mind between 1 to 100 :");
            int number = sc.nextInt();

            if (number == guess)
            {
                System.out.println("Congratulations");
                System.out.println("You won the game");

            }

            else if (number > guess)
            {
                System.out.println("you have guessed greater than that of computer");
                System.out.println(" You can try once again");
            }

            else
            {
                System.out.println("You have guessed smaller number than that of computer ");
                
                System.out.println("You can try once again");
            }
            chance--;
        }

        System.out.println("Sorry");
        System.out.println("You don't have enough chances to play");

        System.out.println("The correct number was:"+" "+guess);
    }
}

public class NumberGames
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Game g = new Game();
        g.play();

        char ch;

        
        do
        {
            System.out.println("DO YOU WANT TO PLAY AGAIN ?");
            ch=sc.next().charAt(0);
            
            if(ch=='Y')
            {
                g = new Game();
                g.play();
                break;
            }
            else if(ch=='y')
            {
                System.out.println("Thank You...");
                break;
            }
            else
            {
                System.out.println("Invalid Input");
                break;
            }
        }while(ch=='Y'||ch=='y');


    }
}
