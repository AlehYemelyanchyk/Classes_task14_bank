package by.epam.ayem.module4;

/*4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов. Вычисление общей сумы по счетам. Вычисление общей суммы по всем счетам,
имеющим положительный и отрицательный балансы отдельно.*/

import java.util.Collections;

public class BankService {

    private Client client;

    public BankService(Client client) {
        this.client = client;
    }

    public void addAccount(Account account) {
        client.getAccounts().add(account);
    }

    public void allAccountsSum() {
        int sum = 0;
        for (Account account : client.getAccounts()) {
            sum += account.getBalance();
        }
        System.out.println("Total amount for all the accounts = " + sum);
    }

    public void blockAccount(Account acc) {
        for (Account account : client.getAccounts()) {
            if (account.getAccountNumber() == acc.getAccountNumber()) {
                account.setBlock(true);
                System.out.println("The account №" + acc.getAccountNumber() + " has been blocked");
            }
        }
    }

    public void positiveNegativeSum() {
        int sumPositive = 0;
        int sumNegative = 0;
        for (Account account : client.getAccounts()) {
            if (account.getBalance() >= 0) {
                sumPositive += account.getBalance();
            } else {
                sumNegative += account.getBalance();
            }
        }
        System.out.println("Total amount for all the positive accounts = " + sumPositive);
        System.out.println("Total amount for all the negative accounts = " + sumNegative);
    }

    public void searchBlocked() {
        for (Account account : client.getAccounts()) {
            if (account.isBlock()) {
                System.out.println(account.toString());
            }
        }
    }

    public void searchByCurrency(Currency currency) {
        for (Account account : client.getAccounts()) {
            if (account.getCurrency().toString().equals(currency.toString())) {
                System.out.println(account.toString());
            }
        }
    }

    public void showAllAccounts() {
        for (Account account : client.getAccounts()) {
            System.out.println(account.toString());
        }
    }

    public void sortByBalance() {
        Collections.sort(client.getAccounts());
    }

    public void unblockAccount(Account acc) {
        for (Account account : client.getAccounts()) {
            if (account.getAccountNumber() == acc.getAccountNumber()) {
                account.setBlock(false);
                System.out.println("The account №" + acc.getAccountNumber() + " has been blocked");
            }
        }
    }
}
