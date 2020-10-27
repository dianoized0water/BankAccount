public class Tester {
    public static void main(String[] args) {
      BankAccount mommybankaccount = new BankAccount(890233, "password");
      BankAccount dinabankaccount = new BankAccount(120837, "1234");
      BankAccount padrebankaccount = new BankAccount(567430, "asdf");

      mommybankaccount.deposit(5000.0);
      padrebankaccount.deposit(5000.0);
      System.out.println(mommybankaccount.toString());
      System.out.println(padrebankaccount.toString());
      for (int i=0; i<6; i++) {
        if (padrebankaccount.withdraw(1000.0)) {
          String a = "Withdrawal success!"+"\t"+"Padre's new balance is: "+ padrebankaccount.getBalance();
          System.out.println(a);
        }
        else {
          String b = "Withdrawal failure" + "\t"+ "Padre's balance is: "+ padrebankaccount.getBalance();
          System.out.println(b);
        }
      }


      dinabankaccount.setPassword("sdcfv3yudcjn");
      System.out.println(dinabankaccount.getPasscode());
    }
}
