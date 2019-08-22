/*4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов. Вычисление общей сумы по счетам. Вычисление общей суммы по всем счетам,
имеющим положительный и отрицательный балансы отдельно.*/

public class ClientMain {

    public static void main(String[] args) {
        Account usd1 = new Account(21452121455L, 4500, Currency.USD, false);
        Account usd2 = new Account(45125521215L, 1200, Currency.USD, false);
        Account byn1 = new Account(45285545542L, -100, Currency.BYN, true);
        Client client1 = new Client("Smith", usd1, usd2, byn1);
    }
}
