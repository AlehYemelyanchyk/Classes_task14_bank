package by.epam.ayem.module4.model;

/*4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление общей суммы по всем счетам,
имеющим положительный и отрицательный балансы отдельно.*/

import java.util.ArrayList;
import java.util.List;

public class Client {

    private final String surname;
    private final List<Account> accounts;

    public Client(String name) {
        this.surname = name;
        this.accounts = new ArrayList<>();
    }

    public String getSurname() {
        return surname;
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
