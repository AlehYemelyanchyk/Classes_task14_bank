/*4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов. Вычисление общей сумы по счетам. Вычисление общей суммы по всем счетам,
имеющим положительный и отрицательный балансы отдельно.*/

public class Client {

    private String surname;
    private Account[] accounts;

    public Client(String name, Account... accounts) {
        this.surname = name;
        this.accounts = accounts;
    }

    public void blockAccount(long number) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == number) {
                account.setBlock(true);
                System.out.println("The account №" + number + " has been blocked");
            }
        }
    }

    public void unblockAccount(long number) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == number) {
                account.setBlock(false);
                System.out.println("The account №" + number + " has been blocked");
            }
        }
    }

    public void searchBlocked() {
        for (Account account : accounts) {
            if (account.isBlock()) {
                System.out.println(account.toString());
            }
        }
    }

    public void searchByCurrency(Currency currency) {
        for (Account account : accounts) {
            if (account.getCurrency().toString().equals(currency.toString())) {
                System.out.println(account.toString());
            }
        }
    }

    public void allAccountSum() {
        int sum = 0;
        for (Account account : accounts) {
            sum += account.getBalance();
        }
        System.out.println("Total amount for all the accounts = " + sum);
    }

    public void positiveNegativeSum() {
        int sumPositive = 0;
        int sumNegative = 0;
        for (Account account : accounts) {
            if (account.getBalance() >= 0) {
                sumPositive += account.getBalance();
            } else {
                sumNegative += account.getBalance();
            }
        }
        System.out.println("Total amount for all the positive accounts = " + sumPositive);
        System.out.println("Total amount for all the negative accounts = " + sumNegative);
    }

    public void sortByBalance() {
        boolean quit = false;

        while (!quit) {
            quit = true;

            for (int i = 1; i < accounts.length; i++) {
                if (accounts[i].getBalance() < accounts[i - 1].getBalance()) {
                    Account temp = accounts[i];
                    accounts[i] = accounts[i - 1];
                    accounts[i - 1] = temp;

                    quit = false;
                }
            }
        }
    }

    public void showAllAccounts() {
        for (Account account : accounts) {
            System.out.println(account.toString());
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }
}
