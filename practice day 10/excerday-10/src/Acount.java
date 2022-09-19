import java.util.ArrayList;
import java.util.Scanner;

public class Acount implements IAccount {
   private String name;
   private String accountNumber;
   private String email;
   private String accountBalance;

   public Acount() {
   }

   public Acount(String name, String accountNumber, String email, String accountBalance) {
      this.name = name;
      this.accountNumber = accountNumber;
      this.email = email;
      this.accountBalance = accountBalance;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getAccountNumber() {
      return accountNumber;
   }

   public void setAccountNumber(String accountNumber) {
      this.accountNumber = accountNumber;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getAccountBalance() {
      return accountBalance;
   }

   public void setAccountBalance(String accountBalance) {
      this.accountBalance = accountBalance;
   }
   ArrayList<Acount> ac = new ArrayList<>();

   @Override
   public String toString() {
      return "Acount{" +
              "name='" + name + '\'' +
              ", accountNumber='" + accountNumber + '\'' +
              ", email='" + email + '\'' +
              ", accountBalance='" + accountBalance + '\'' +
              '}';
   }

   @Override
   public void changeEmail(String email) {
      System.out.println("show"+ email);
   }

   @Override
   public void recharge(double amount) {
      Scanner sc = new Scanner(System.in);
      for(int i =0;i< amount;i++){
         Acount acount = new Acount();
         System.out.println("Nhập vào tên: ");
         acount.setName(sc.nextLine());
         System.out.println("Nhập vào số tài khoản");
         acount.setAccountBalance( sc.nextLine());
         System.out.println("Nhập vào email: ");
         acount.setEmail(sc.nextLine());
         System.out.println("Nhập vào số dư tài khoản: ");
         acount.setAccountBalance(sc.nextLine());
         ac.add(acount);
      }
      System.out.println("show"+amount);
   }

   @Override
   public void displayInfo() {
      System.out.println(ac);
   }
}
