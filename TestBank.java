public class TestBank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.setFirstName("John");
        account1.setLastName("Doe");
        account1.setAccountID(123);
        account1.deposit(1000);
        account1.withdrawal(200);
        account1.accountSummary();

        CheckingAccount checkingAccount = new CheckingAccount("Alice", "Smith", 456, 0.02);
        checkingAccount.deposit(1500);
        checkingAccount.processWithdrawal(2000);
        checkingAccount.displayAccount();
    }
}
