import java.util.Scanner;
public class ATMInterface {
    public static void main(String args[])
    {
        int balance=50000,deposit=0,withdraw=0;
        try(Scanner in=new Scanner(System.in)) {
            while(true)
            {
                System.out.println("********Automated Teller Machine********");
                System.out.println("Select the operation you want to perform");
                System.out.println("1 : Deposit");
                System.out.println("2 : Withdraw");
                System.out.println("3 : Check balance");
                System.out.println("4 : Transaction Details");
                System.out.println("5 : Exit");
                int n=in.nextInt();
                switch(n)
                {
                    case 1 : System.out.println("Enter amount to be deposited : ");
                             deposit=in.nextInt();
                             balance+=deposit;
                             System.out.println("Rs."+deposit +" has been successfully deposited");
                             break;
                    case 2 : System.out.println("Enter amount to be withdrawn : ");
                             withdraw=in.nextInt();
                             if(balance>=withdraw)
                             {
                                balance-=withdraw;
                                System.out.println("Withdraw Successful!! Please collect your cash");
                             }
                             else 
                             {
                                System.out.println("Insufficient balance");
                             }
                             break;
                    case 3 : System.out.println("Your balance is "+balance);
                             break;
                    case 4 : System.out.println("Transaction Details");
                             System.out.println("Deposited Amount : "+ deposit);
                             System.out.println("Withdrawn Amount : "+withdraw);
                             System.out.println("Balance : "+balance);
                             break;
                    case 5 : System.exit(0);
                    default : System.out.println("Wrong option! Please select the appropriate operation");
                }
            }
        }
    }
}
