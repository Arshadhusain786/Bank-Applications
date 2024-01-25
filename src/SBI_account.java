import java.util.UUID;


public class SBI_account implements bank
{
    private String name;
    private String accountNo;
    private String password;
    private int balance;
    private int age;

    private double rateofInterest;


     SBI_account(String name,int balance,String password,int age) {
        this.name = name;
        this.balance=balance;
        this.password=password;
        this.age=age;
        this.rateofInterest=6.6;
        this.accountNo= String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getPassword() {
        return password;
    }
    public double getRateofInterest() {
        return rateofInterest;
    }

    public int getBalance() {
        return balance;
    }
    public void setRateofInterest(double rateofInterest) {
        this.rateofInterest = rateofInterest;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public int getbalance() {
        return this.balance;
    }

    @Override
    public String depositmoney(int amount) {
        this.balance+=amount;
        return amount + " credited to your account";
    }


    @Override
    public String withdraw(int amount1,String enterredpassword) {
        if(enterredpassword.equals(this.password))
        {
            if(balance<amount1)
            {
                return"insufficient balance";
            }
            else{
                balance-=amount1;
            }

        }
        else{
            return "Wrong password! Enter correct password";
        }


        return amount1+ " debited from your account " + " please collect your cash";

    }

    @Override
    public double calculateinterest(int time) {
        return (balance*rateofInterest*time)/100.0;
    }
}
