
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opplabass1;

/**
 *
 * @author lanam
 */
public class Customer {
    private String name;
    private Account account;
    public Customer(){}
    public Customer(String name,Account account){
        this.name=name;
        this.account=account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    public String getCustomer(){
        return "Customer Name: "+this.name+"\n"+"Account Number: "+account.getAccountNo()+", Ammount: "+account.getAvailableAmount();
    }
    
    
}
