package by.epam.ayem.module4;

/*4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов. Вычисление общей сумы по счетам. Вычисление общей суммы по всем счетам,
имеющим положительный и отрицательный балансы отдельно.*/

import by.epam.ayem.module4.model.Account;
import by.epam.ayem.module4.model.Client;
import by.epam.ayem.module4.model.Currency;
import by.epam.ayem.module4.service.BankService;

public class BankMain {

    public static void main(String[] args) {
        Client smith = new Client("Smith");
        Client parker = new Client("Parker");

        Account usd1 = new Account(smith,21452121455L, 4500, Currency.USD);
        Account usd2 = new Account(parker,45125521215L, 1200, Currency.USD);
        Account byn1 = new Account(parker,45285545542L, -100, Currency.BYN);
        BankService smithBankService = new BankService();

        smithBankService.addAccount(smith,byn1);
        smithBankService.addAccount(smith,usd2);
        smithBankService.addAccount(smith,usd1);
        smithBankService.allAccountsSum(smith);
        smithBankService.sortByBalance(smith);
        smithBankService.showAllAccounts(smith);
        System.out.println("===========================================================");
        smithBankService.blockAccount(smith,45285545542L);
        smithBankService.allAccountsSum(smith);
        smithBankService.positiveNegativeSum(smith);
    }
}
