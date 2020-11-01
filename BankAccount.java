public class BankAccount {
  // vars?
  private double balance;
  private int accountID;
  private String password;

  // constructor?
  public BankAccount(int accountID, String password){
    balance = 0.0;
    this.accountID = accountID;
    this.password = password;
  }

  // display data
  public String toString(){
    return ("#"+accountID+"\t"+"$"+balance);
  }

  // access your info
  public int getAccountID() {
    return accountID;
  }
  public double getBalance(){
    return balance;
  }
  public String getPasscode(){
    return password;
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

  // transfering money
  private boolean authenticate(String password){
    return (this.password.equals(password));
  }
  public boolean transferTo(BankAccount other, double amount, String password){
    if (authenticate(password) && withdraw(amount)){
      if (other.deposit(amount)){
        return true;
      }
      else{
        System.out.println("Critical Error!");
        return false;
      }
    }
    return false;
  }
}
