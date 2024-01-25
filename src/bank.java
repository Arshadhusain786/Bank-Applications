public interface bank
{
    int getbalance();
    String depositmoney(int amount);
    String withdraw(int amount,String enterredpassword);
    double calculateinterest(int time);


}