import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void checkLeapYear(int year) {
        if (year > 1584) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println("Некорректный год!");
        }
    }

    public static void installAppVersion(int clientOS, int clientDeviceYear) {
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }
    public static int deliverBankCard(int distance) {
        int result = 1;
        if (distance > 20) {
            result++;
        } if (distance > 60) {
            result++;
        } if (distance > 100) {
            result = -1;
        }
        return result;
    }
    public static void displayDeliveryDays(int deliveryDays) {
        if (deliveryDays < 1) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
    }
    public static void task1() {
        System.out.println("Задача №1");
        checkLeapYear(2024);
    }
    public static void task2() {
        System.out.println("Задача №2");
        installAppVersion(1, LocalDate.now().getYear());
    }
    public static void task3() {
        System.out.println("Задача №3");
        int deliveryDistance = 95;
        int deliveryDays = deliverBankCard(deliveryDistance);
        displayDeliveryDays(deliveryDays);
    }
}