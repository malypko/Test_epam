public class Main {

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }

  protected double balance = 0;

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  protected void withdrawMoney(double diff) {
    balance = balance - diff;
    System.out.println("Произошло списание " + diff);
  }

  protected void depositMoney(double sum) {
    balance = balance + sum;
    System.out.println("Произошло зачисление " + sum);
  }

  protected abstract void infoAccount();

  protected abstract double getWithdrawalComission(double amount, double percent);

  protected abstract double getDepositComission(double amount, double percent);

}
