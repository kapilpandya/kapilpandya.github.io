package task;

import java.util.Scanner;

public class Bank {
  String Ac, name, amount;

  double bal;

  void Transfer(Scanner s1, Bank bb, Bank b3) {
    System.out.println("Enter Acc no. of Giver:");

    String giver = s1.next();

    System.out.println("Enter Acc no. of Acceptor:");

    String accp = s1.next();

    System.out.println("Enter Amount to be transfered:");

    double trans = s1.nextDouble();

    if (giver.equals(bb.Ac) && accp.equals(b3.Ac)) {
      double t = bb.bal - trans;
      if (t >= 0) {
        b3.bal = b3.bal + trans;
        bb.bal = t;

        System.out.println("Tranfer Sucessful !!!!");

        bb.showDetails();
        b3.showDetails();
      } else {
        System.out.println("Insufficient Balance in your Account!!!");
      }

    } else if (giver.equals(b3.Ac) && accp.equals(bb.Ac)) {
      double t = b3.bal - trans;

      if (t >= 0) {
        bb.bal = bb.bal + trans;
        b3.bal = t;
        System.out.println("Tranfer Sucessful !!!!");

        bb.showDetails();
        b3.showDetails();
      } else {
        System.out.println("Insufficient Balance in your Account!!!");
      }

    } else {
      System.out.println("Entered Wrong Account details Transcetion Failed !!!! :");
    }
  }

  void showDetails() {
    System.out.println("Your Acc status :");

    System.out.println("Name:" + name);
    System.out.println("Account number:" + Ac);
    System.out.println("Balance:" + bal);
  }
  
  
  
  
  

  public static void main(String args[]) {

int flag =0;

    System.out.println("Welcome to SBI :");

    Scanner s = new Scanner(System.in);

    Bank b = new Bank();
    Bank b1 = new Bank();

    while (true) {
      //System.out.println("***Enter Choice***");

      System.out.println("Enter 1 For opening Account ");

   //   System.out.println("Press Any key for exit:");

      String open = s.next();

      if (open.equals("1")) {

        System.out.println("Enter your name");
        b.name = s.next();

        System.out.println("Enter your initial bank opening balance");

        b.bal = s.nextDouble();

        System.out.println("Enter Your mobile no. As it will be your Acc No.");

        b.Ac = s.next();
        System.out.println("Account creation Succesful!!!");
}
else
{
  System.out.println("Worng input Enter Correct value for Opening Account:-");
 flag=1;
 break;
 
 
 // System.exit(0);
}
        System.out.println("Enter Y to Open Account or Press Any key for Exiting loop:");

        String open2 = s.next();

        if (open2.equals("Y")) {

          System.out.println("Enter your name");
          b1.name = s.next();

          System.out.println("Enter your initial bank opening balance");

          b1.bal = s.nextDouble();

          System.out.println("Enter Your mobile no. As it will be your Acc No.");

          b1.Ac = s.next();
          System.out.println("Account creation Succesful!!!");
          break;
        }
      
      else {
        break;
      }
    }

if(flag==1)
{
  System.exit(0);
}


    System.out.println("***Enter T For Transfer Money***");

    System.out.println("Press Any key for exit:");

    String ch = s.next();

    if (ch.equals("T")) {

      b.Transfer(s, b, b1);

    } else {

      //System.out.println("Wrong input !!!");
      System.exit(0);
    }
  }
}
