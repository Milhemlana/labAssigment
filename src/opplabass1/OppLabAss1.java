/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opplabass1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lanam
 */
public class OppLabAss1 {
     private static ArrayList<Customer> customers=new ArrayList<>();
        private static ArrayList<Account> acc=new ArrayList<>();
        
    public static void main(String[] args) { 
     
         
    
       int choice;
       Scanner input=new Scanner(System.in);
        System.out.println("Choose what you want to do:"
                + "1. Creating a new account:"
                + "2. Depositing money:"
                + "3. Withdrawing money:"
                + "4. Displaying account info:"
                + "5. Transferring money:"
                + "6. Displaying all accounts:"
                + "7. Exiting the program: ");
        System.out.println("Enter the choice you want:");
        do{
        choice=input.nextInt();
        switch(choice){
            case 1:
              creatingNewAccount();
                break;
                case 2:
                    depositingMoney();
                break;
                case 3: 
                     withDrawingMoney();
                break;
                case 4:
                     accountInfo();
                break;
                case 5:
                    transferMoney();
                    break;
                case 6:
                    displayAllAccounts();
                    break;
                case 7:
                    break;
        }
                
                
            
        }while(choice !=7);
      
    
}
    public static void creatingNewAccount(){
        String name;
        int no;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the customer' name please:");
        name=in.nextLine();
        System.out.println("Enter the Account number here:");
        no=in.nextInt();
        Account c=new Account(no);
        Customer cus=new Customer(name,c);
        customers.add(cus);
    }
    public static void depositingMoney(){
        double val;
      
        System.out.println("Enter the value you want to deposit it;");
        try{
        Scanner in=new Scanner(System.in);
        val=in.nextDouble();
        }
        catch(Exception ex){
            ex.getMessage();
        }   
    }
    public static void withDrawingMoney(){
        double val;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value you want to Withrdraw it:");
        try{
            val=in.nextDouble();
        }
        catch(Exception ex){
           ex.getMessage();
                }
            }
    public static void accountInfo(){
        String name;
        Scanner in=new Scanner(System.in);
        name=in.nextLine();
        if(customers!=null){
        for(Customer customer:customers){
            if(customer.getName()==name)
                customer.getCustomer();
        }
    }
    }
     public static Customer findingCustomerByName(String name) {
        for (Customer customer : customers) {
            if (customer.getAccount().getAvailableAmount() > 0 && customer.getName().equalsIgnoreCase(name)) {
                return customer;
            }
        }
        return null;
    }
     public static void transferMoney() {
         Scanner in=new Scanner(System.in);
         double amount;
        System.out.print("Enter the source customer's name please: ");
        String sourceName = in.nextLine();
        System.out.print("Enterthe target customer's name please: ");
        String targetName = in.nextLine();

        Customer sourceCustomer = findingCustomerByName(sourceName);
        Customer targetCustomer = findingCustomerByName(targetName);

        if (sourceCustomer != null && targetCustomer != null) {
            System.out.print("Enter transfer amount: ");
            try{
            amount = in.nextDouble();
            if (sourceCustomer.getAccount().withDraw(amount)) {
                targetCustomer.getAccount().deposit(amount);
                System.out.println("Transfer successful!");
            } else 
                System.out.println("Insufficient funds!");
            
            }
            
            catch(Exception ex){
                ex.getMessage();
            }
            
    }}
    
    public static void displayAllAccounts() {
        if (customers.isEmpty()) {
            System.out.println("No accounts found!");
        } else {
            for (Customer customer : customers) {
                System.out.println(customer.getCustomer());
            }
        }
    }
    
}
        
        
    

