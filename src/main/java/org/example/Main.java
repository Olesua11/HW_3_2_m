package org.example;
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(15000);

        double withdrawalAmount = 6000;
        while (true) {
            try {
                account.withdraw(withdrawalAmount);
                System.out.println("Вывод успешен. Оставшееся количество: " + account.getAmount() + " сом");
            } catch (LimitException e) {
                System.out.println("Вывод средств не выполнен. " + e.getMessage() + ". Оставшееся количество: " + e.getRemainingAmount() + " сом");
                break;
            }
        }
    }
}
