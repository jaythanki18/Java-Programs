public class P2_2main {
    public static void main(String[] args) {
        Account_P2_2 account = new Account_P2_2(1122, 20000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500.0);
        account.deposit(3000.0);
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Monthly Interest: " + account.getMonthlyInterest());
        System.out.println("Date Created: " + account.getDateCreated());


    }

}
