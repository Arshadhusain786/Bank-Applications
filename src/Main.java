
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.next();
        System.out.println("built your strong password");
        String password=sc.next();
        System.out.println("Enter the balance you want to add");
        int balance=sc.nextInt();
        System.out.println("Enter your age");
        int ages=sc.nextInt();

        SBI_account s = new SBI_account(name,balance,password,ages);
        System.out.println("Congrats! Your Account has been succesfully created");
        //getbalance

        System.out.println("your current balance is:" + s.getbalance());

        //deposit
        System.out.println("Enter the amount to be deposited");
        int amount =sc.nextInt();
        System.out.println("congrats!" + s.depositmoney(amount));

        //withdraw

        System.out.println("Enter the amount to be withdrawn");
        int amount1 = sc.nextInt();
        System.out.println("Enter your password");
        String enterredpassword=sc.next();
        System.out.println(s.withdraw(amount1,enterredpassword));

        //interest

        System.out.println("Enter the time period in year for interest");
        int time=sc.nextInt();
        System.out.println("interest for"+ time + " year is " + s.calculateinterest(time));
    }
}