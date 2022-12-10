import java.util.Scanner;

public class bank__APP2
{

    double Balance;
    double Transaction;
    String Name;
    String ID;

    bank__APP2(String Name,String ID){
        this.Name=Name;
        this.ID=ID;
    }


   public void deposit(double amount){
        if(amount!=0){
         Balance+=amount;
            Transaction=amount;
        }
    }

   public void withdraw(double amountWithdraw){
        if(amountWithdraw!=0 && Balance>=amountWithdraw){
         Balance-=amountWithdraw;
            Transaction=-amountWithdraw;
        }
        else if (Balance<amountWithdraw){
            System.out.println("Bank balance insufficient");
        }
    }

    public void getPreviousTrans(){
        if(Transaction>0){
            System.out.println("Deposited: "+Transaction);
        }
        else if(Transaction<0){
            System.out.println("Withdrawn: "+Math.abs(Transaction));
        }
        else{
            System.out.println("No transaction occurred");
        }
    }

    void choose()
    {
        char choice;
        Scanner scan =new Scanner(System.in);
        System.out.println("your name : "+Name);
        System.out.println("Your ID:"+ID);
        System.out.println("\n");
        System.out.println("a) Check Balance");
        System.out.println("b) Deposit Amount");
        System.out.println("c) Withdraw Amount");
        System.out.println("d) Previous Transaction");
        System.out.println("e) Exit");

        do{
            System.out.println("Choose an choice");
            choice=scan .next().charAt(0);
            System.out.println("\n");

            switch (choice){
                case 'a':
                   
                    System.out.println("Balance =" +Balance);
                   
                    System.out.println("\n");
                    break;
                case 'b':
                   
                    System.out.println("Enter a amount to deposit :");
                   
                    double amountWithdraw=scan .nextDouble();
                    deposit(amountWithdraw);
                    System.out.println("\n");
                    break;
                case 'c':
                   
                    System.out.println("Enter a amount to Withdraw :");
                   
                    double amtW=scan .nextDouble();
                    withdraw(amtW);
                    System.out.println("\n");
                    break;
                case 'd':
                   
                    System.out.println("Previous Transaction:");
                    getPreviousTrans();
                   
                    System.out.println("\n");
                    break;

                case 'e':
                   
                    break;
                default:
                    System.out.println("Choose a correct choice to proceed");
                    break;
            }

        }while(choice!='e');

        System.out.println("Thank you for using our banking services");
        scan.close();
    }
    
}
