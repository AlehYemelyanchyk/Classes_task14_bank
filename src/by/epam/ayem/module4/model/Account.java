package by.epam.ayem.module4.model;

/*4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление общей суммы по всем счетам,
имеющим положительный и отрицательный балансы отдельно.*/

public class Account implements Comparable {

    private final Client client;
    private long accountNumber;
    private int balance;
    private boolean blocked;
    private final Currency currency;

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
        if (this.getBalance() < newAccount.getBalance()) {
            return -1;
        } else if (this.getBalance() == newAccount.getBalance()) {
            return 0;
        } else {
            return 1;
        }
    }

    public Client getClient() {
        return client;
    }

    public Currency getCurrency() {
        return currency;
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

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    @Override
    public String toString() {
        return client.getSurname() + ". Account #" + accountNumber +
                " in " + currency +
                ". Balance: " + balance +
                ". Status: " + ((!blocked) ? "active" : "blocked") + ".";
    }
}
