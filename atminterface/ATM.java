/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atminterface;

/**
 *
 * @author chilk
 */
import java.util.*;
public class ATM {
    private BankAccount bankAccount;
    public ATM(BankAccount bankAccount){
        this.bankAccount=bankAccount;
    }
    public void displayMenu(){
        System.out.println("ATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }
    
    public void perfomTransaction(int choice,Scanner scanner){
        switch (choice){
            case 1:
                System.out.println("Current Balance $"+bankAccount.getBalance());
                break;
            case 2:
                System.out.println("Enter deposit amount: $");
                double depositAmount=scanner.nextDouble();
                bankAccount.deposit(depositAmount);
                break;
            case 3:
                System.out.println("Enter withdrawl amount: $");
                double withdrawlAmount=scanner.nextDouble();
                bankAccount.withdraw(withdrawlAmount);
                break;
            case 4:
                System.out.println("Exiting ATM. Thank you");
                scanner.close();
                System.exit(0);
            default:
                System.out.println("Invalid Choice. Please select a valid option");
        }
    }
}
