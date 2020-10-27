public class BankAccount {
  // vars?
  private double balance;
  private int accountID;
  private String password;

  // constructor?
  public BankAccount(int ID, String pass){
    balance = 0.0;
    accountID = ID;
    password = pass;
  }

  // display data
  public String toString(){
    return (accountID+\t+balance);
  }

  // access your info
  public int getAccountID() {
    return accountID;
  }
  public double getBalance(){
    return balance;
  }

  // change password?
  public void setPassword(String newPass){
    password = newPass;
  }

  // deposits
  public boolean deposit(double amount){
    if (amount>0){
      balance += amount;
      return true;
    }
    else {
      return false;
    }
  }

  // withdrawl
  public boolean withdraw(double amount){
    if (amount>balance || amount<0){
      return false;
    }
    else {
      balance -= amount;
      return true;
    }
  }


}
