class CheckingAccount extends BankAccount {
    private double interestRate;

    public CheckingAccount(String firstName, String lastName, int accountID, double interestRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountID = accountID;
        this.interestRate = interestRate;
    }

    public void processWithdrawal(double amount) {
        double overdraftFee = 30.0;
        balance -= (amount + overdraftFee);
        System.out.println("Overdraft Fee: $30");
        System.out.println("New Balance: $" + balance);
    }

    public void displayAccount() {
        accountSummary();
        System.out.println("Interest Rate: " + interestRate);
    }
}
