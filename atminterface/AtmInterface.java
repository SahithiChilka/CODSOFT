
package atminterface;


import java.util.*;
public class AtmInterface {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
         System.out.println("Enter initial Account balance $");
         double initialBalance= scanner.nextDouble();
         BankAccount bankAccount=new BankAccount(initialBalance);
         
        ATM atm=new ATM(bankAccount);
        
        while(true){
            atm.displayMenu();
            System.out.println("Select a option : ");
            int choice=scanner.nextInt();
            
            atm.perfomTransaction(choice, scanner);
        }
        
    }
    
}
