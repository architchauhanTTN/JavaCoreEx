package com.company;


class Bank {

  String country ;
  String govt;
   void getDetails() {};
  Bank() {
   country = "India";
   govt = "NDA - BJP";
  }
}
class SBI extends  Bank {
  String branchName ;
  String bankName ;
  SBI(){
   super();
   branchName = "Karol Bagh";
   bankName = "State Bank Of India";
  }
  void getDetails() {
   System.out.println(country);
   System.out.println(branchName);
   System.out.println(bankName);

  }
}
class BOI extends  Bank {
 String branchName ;
 String bankName ;
 BOI(){
  super();
  branchName = "Noida Sector 63";
  bankName = " Bank Of India";
 }
 void getDetails() {
  System.out.println(country);
  System.out.println(branchName);
  System.out.println(bankName);

 }
}
class ICICI extends  Bank {
 String branchName ;
 String bankName ;
 ICICI(){
  super();
  branchName = "Lajpat Nagar";
  bankName = "ICICI Limited.";
 }
 void getDetails() {
  System.out.println(country);
  System.out.println(branchName);
  System.out.println(bankName);

 }
}

public class Question12 {
 public static void answer(){
     Bank sbi = new SBI();
//     SBI bnk = (SBI) new Bank();
     Bank boi = new BOI();
     Bank icici = new ICICI();
     sbi.getDetails();
     boi.getDetails();
     icici.getDetails();

 }

}
