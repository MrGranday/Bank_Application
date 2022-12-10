import java.util.Scanner;

public class bank__APP 

{
    
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Enter your Name :");
        
        String name=scan .nextLine();
        System.out.println("Enter your Customer ID :");
        String ID=scan .nextLine();
        bank__APP2 obj1=new bank__APP2(name,ID);
        obj1.choose();
        scan.close();
    }
}


