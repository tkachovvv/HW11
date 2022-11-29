import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 2021;
        calculateLeapYear(year);
        System.out.println();
        int clientDeviceYear = 2022;
        int usersSystem = 1;
        getClientOs(clientDeviceYear, usersSystem);
        System.out.println();
        int deliveryDistanceEst = 5000;
        calculateDelivery(deliveryDistanceEst);
    }

    public static int calculateLeapYear(int year) {
        boolean leapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (leapYear) {
            System.out.println(year + " это високосный год.");
        } else {
            System.out.println(year + " это невисокосный год.");
        }
        return year;

    }

    public static int getClientOs(int clientDeviceYear, int usersSystem) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear == currentYear && usersSystem == 1) {
            System.out.println("Установите приложение для iOS по следующей ссылке");
        } else if (usersSystem == 1) {
            System.out.println("Установите облегченную версию приложения для iOS");
        }
        if (clientDeviceYear == currentYear && usersSystem < 1) {
            System.out.println("Установите приложение для Android по следующей ссылке");
        } else if (usersSystem < 1) {
            System.out.println("Установите облегченную версию приложения для Android по следующей ссылке");
        }
        return clientDeviceYear;
    }

    public static int calculateDelivery(int deliveryDistanceEst) {
        int deliveryDistance = 0;
        int deliveryTerm = 0;
        for (deliveryDistance = 20; deliveryDistance < 7500; deliveryDistance = deliveryDistance + 40) {
                    int i = deliveryTerm++;
                    if (deliveryDistanceEst <= 20) {
                        System.out.println("Срок доставки составит: " + deliveryTerm + " сутки.");
                        break;
                    } else if (deliveryDistanceEst < deliveryDistance) {
                            System.out.println("Срок доставки составит: " + i + " суток.");
                            break;
                        }
                    }

        return deliveryDistanceEst;
    }
}