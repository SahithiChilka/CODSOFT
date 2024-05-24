/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atminterface;



public class BankAccount {
    private double balance;
    public BankAccount(double initialBalance){
        this.balance=initialBalance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposit of $"+amount+ "succesful. Current balance $ "+balance );
        }
        else{
            System.out.println("Invalid deposit amount");
        }
    }
    
    public void withdraw(double amount){
        if(amount >0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdrawl of $"+amount+"succesful. Current balance $ "+balance );
        }
        else{
            System.out.println("Invalid withdrawl amount or Insufficient balance");
        }
    }
}
