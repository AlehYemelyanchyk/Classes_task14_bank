/*4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов. Вычисление общей сумы по счетам. Вычисление общей суммы по всем счетам,
имеющим положительный и отрицательный балансы отдельно.*/

public class Account {

    private long accountNumber;
    private int balance;
    private boolean block;
    private Currency currency;

    public Account(long accountNumber, int balance, Currency currency, boolean block) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.currency = currency;
        this.block = block;
    }

    @Override
    public String toString() {
        return "Account #" + accountNumber +
                " in " + currency +
                ". Balance: " + balance +
                ". Status: " + block +
                ".";
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isBlock() {
        return block;
    }

    public void setBlock(boolean block) {
        this.block = block;
    }
}
