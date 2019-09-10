package by.epam.ayem.module4;

/*4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов. Вычисление общей сумы по счетам. Вычисление общей суммы по всем счетам,
имеющим положительный и отрицательный балансы отдельно.*/

public class AppRunner {

    public static void main(String[] args) {
        Account usd1 = new Account(21452121455L, 4500, Currency.USD);
        Account usd2 = new Account(45125521215L, 1200, Currency.USD);
        Account byn1 = new Account(45285545542L, -100, Currency.BYN);
        Client smith = new Client("Smith");
        BankService smithBankService = new BankService(smith);

        smithBankService.addAccount(byn1);
        smithBankService.addAccount(usd2);
        smithBankService.addAccount(usd1);
        smithBankService.allAccountsSum();
        smithBankService.sortByBalance();
        smithBankService.showAllAccounts();
        System.out.println("===========================================================");
        smithBankService.blockAccount(byn1);
        smithBankService.allAccountsSum();
        smithBankService.positiveNegativeSum();
    }
}
