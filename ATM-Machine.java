import java.util.*;

class ATM 
{
    
    static int PIN = 4013;
    static double Ballance;

    static Scanner sc = new Scanner(System.in);

    public static void cheakPIN()
    {
        System.out.println("WEL - COME TO ATM MACHINE");
        System.out.println("Enter the pin:");
        int pin = sc.nextInt();
        if(pin==PIN)
            {
                Menu();
            }
        else 
        {
            System.out.println("Enter valid pin");
        }
        
    }

    public static void Menu()
    {
        System.out.println("1.Cheak Ballance\n2.Deposit Amount\n3.Cash Withdrawal\n4.Exit");
        System.out.println("Enter the choice :");

        System.out.println("Enter your choice :");
        int ch = sc.nextInt();

        if(ch==1)
        {
            Cheak_Ballance();
        }

        else if(ch==2)
        {
            Deposit();
        }
        else if(ch==3)
        {
            Withdrawal();

        }
        else if(ch==4)
        {
            System.out.println("Exit");
            
        }

        else
        {
            System.out.println("Enter the valid choice ");
        }

    }

    public static void Withdrawal()
    {
        

        System.out.println("Enter thde amount you want to withdraw :");
        double amount = sc.nextDouble();

        if(amount>Ballance)
        {
            System.out.println("You don't have sufficient funds :");
        }

        else
        {
            System.out.println("The amount withdrawn successfully");

            Ballance = Ballance-amount;

            System.out.println(" Remaining ballance :"+ Ballance);

        }
        System.out.println("Thank You");
        Menu();
    }

    public static void Deposit()
    {
        System.out.println("Enter the amount you want to deposit :");
        double depositamount = sc.nextDouble();

         Ballance = depositamount + Ballance;

        System.out.println("Current Ballance :"+ Ballance);
        Menu();
    }

    public static void Cheak_Ballance()
    {
        System.out.println("Ballance :"+ Ballance);
        Menu();
    }

    
}
class BankAccount extends ATM
{

    public BankAccount(double Ballance)
    {
        this.Ballance=Ballance;
    }
    
}
public class AtmMachine
{
    public static void main(String args [])
    {
        BankAccount acc = new BankAccount(0);
        acc.cheakPIN();
        

    }
}