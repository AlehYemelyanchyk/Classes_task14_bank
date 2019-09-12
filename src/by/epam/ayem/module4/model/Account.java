package by.epam.ayem.module4.model;

/*4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов. Вычисление общей сумы по счетам. Вычисление общей суммы по всем счетам,
имеющим положительный и отрицательный балансы отдельно.*/

public class Account implements Comparable {

    private Client client;
    private long accountNumber;
    private int balance;
    private boolean block;
    private Currency currency;

    public Account(Client client, long accountNumber, Currency currency) {
        this.client = client;
        this.accountNumber = accountNumber;
        this.currency = currency;
    }

    public Account(Client client, long accountNumber, int balance, Currency currency) {
        this.client = client;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.currency = currency;
    }

    @Override
    public int compareTo(Object obj) {
        Account newAccount = (Account) obj;
        if (newAccount.getBalance() > this.getBalance()) {
            return 1;
        } else if (newAccount.getBalance() == this.getBalance()) {
            return 0;
        } else {
            return -1;
        }
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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

    @Override
    public String toString() {
        return client + ". Account #" + accountNumber +
                " in " + currency +
                ". Balance: " + balance +
                ". Status: " + ((!block) ? "active" : "blocked") + ".";
    }
}
