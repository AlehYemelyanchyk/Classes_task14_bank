package by.epam.ayem.module4.service;

/*4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление общей суммы по всем счетам,
имеющим положительный и отрицательный балансы отдельно.*/

import by.epam.ayem.module4.model.Account;
import by.epam.ayem.module4.model.Client;
import by.epam.ayem.module4.model.Currency;

import java.util.Collections;

public class BankService {

    public void addAccount(Client client, Account account) {
        client.getAccounts().add(account);
    }

    public void showAllAccountsSum(Client client) {
        int sum = 0;
        for (Account account : client.getAccounts()) {
            sum += account.getBalance();
        }
        System.out.println("Mr/Mrs " + client.getSurname() + ", total amount of all your accounts = " + sum);
    }

    public void blockAccount(Client client, Long number) {
        for (Account account : client.getAccounts()) {
            if (account.getAccountNumber() == number) {
                account.setBlocked(true);
                System.out.println("Mr/Mrs " + client.getSurname() + ", your account №" + number + " has been blocked");
            }
        }
    }

    public void unblockAccount(Client client, Long number) {
        for (Account account : client.getAccounts()) {
            if (account.getAccountNumber() == number) {
                account.setBlocked(false);
                System.out.println("Mr/Mrs " + client.getSurname() + ", your account №" + number + " has been unblocked");
            }
        }
    }

    public void showPositiveNegativeSum(Client client) {
        int sumPositive = 0;
        int sumNegative = 0;
        for (Account account : client.getAccounts()) {
            if (account.getBalance() >= 0) {
                sumPositive += account.getBalance();
            } else {
                sumNegative += account.getBalance();
            }
        }
        System.out.println("Mr/Mrs " + client.getSurname()
                + ", total amount of all your positive balance accounts = " + sumPositive);
        System.out.println("Mr/Mrs " + client.getSurname()
                + ", total amount of all your negative balance accounts = " + sumNegative);
    }

    public void searchBlockedAccounts(Client client) {
        for (Account account : client.getAccounts()) {
            if (account.isBlocked()) {
                System.out.println(account);
            }
        }
    }

    public void searchAccountByCurrency(Client client, Currency currency) {
        for (Account account : client.getAccounts()) {
            if (account.getCurrency().equals(currency)) {
                System.out.println(account);
            }
        }
    }

    public void showAllAccounts(Client client) {
        for (Account account : client.getAccounts()) {
            System.out.println(account);
        }
    }

    public void sortAccountsByBalance(Client client) {
        Collections.sort(client.getAccounts());
    }
}
