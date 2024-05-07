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
public class Account {
    private int accountNo;
    private double availableAmount;
    public Account(int accountNo){
        this.accountNo=accountNo;}
    public Account(){}

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setAvailableAmount(double availableAmount) {
        this.availableAmount = availableAmount;
    }
    

    public int getAccountNo() {
        return accountNo;
    }
    
    public double getAvailableAmount() {
        return availableAmount;
    }
          public String getAcoount(){
              return "Account Number: "+this.accountNo+", Amount: "+this.availableAmount;
          }
          public void deposit(double value)throws InvalidDepositException{
              if(value>0){
              this.availableAmount+=value;
              }
              else System.out.println("INVALID VALUE>> TRY AGAIN!");
          }
          public boolean withDraw(double amount) throws InvalidWithdrawException{
              if(amount<=this.availableAmount){
                  this.availableAmount-=amount;
                  return true;
              }
              else{
                  return false;
              }
                  }
        
}
