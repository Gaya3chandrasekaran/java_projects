import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String deposit;
       String withdraw;
       float checkingbalance;
       float amount;
       String checkbalance;
       String back;
//        System.out.println("enter the name: ");
//        Scanner cusname = new Scanner(System.in);
//        String name=cusname.nextLine();
        Customer customer =new Customer("john", "5678u456u4",34,67890.56f);
        System.out.println("Hi john!");
        int[] banking={1,2,3,4};
        label:
        for (int i : banking) {
            System.out.println("enter the banking option?");
            System.out.println("1.withdraw,2.deposit,3.checkbalance,4.exit");
            Scanner inputoperation=new Scanner(System.in);
            int chosen = inputoperation.nextInt();


            switch (chosen) {
                case 1:
                    System.out.println("enter the amount to withdraw: ");
                    Scanner inputamnt = new Scanner(System.in);
                    amount = inputamnt.nextFloat();
                    checkingbalance = customer.getBalance() - amount;
                    customer.setBalance(checkingbalance);
                    System.out.println("your new balance is " + checkingbalance);
                    break;
                case 2:
                    System.out.println("enter the amount to deposit: ");
                    Scanner inputamnt1 = new Scanner(System.in);
                    amount = inputamnt1.nextFloat();
                    checkingbalance = customer.getBalance() + amount;
                    customer.setBalance(checkingbalance);
                    System.out.println("your new balance is " + checkingbalance);
                    break;
                case 3:
                    System.out.println("your account balance is " + customer.getBalance());
                    break;
                case 4:
                    System.out.println("Thank you for using this app");
                    break label;
                default:
                    System.out.println("enter a correct option");
                    break;
            }
        }
    }
}