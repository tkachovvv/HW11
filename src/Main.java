

public class Main {
         public static void main(String[] args) {
             int year = 2021;
             calculateLeapYear(year);
             System.out.println();
             int clientDeviceYear = 2018;
             int usersSystem = 1;
             getClientOs(clientDeviceYear, usersSystem);
             System.out.println();
             int deliveryDistance = 15;
             calculateDelivery(deliveryDistance);
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
             if (clientDeviceYear >= 2015 && usersSystem == 1) {
                 System.out.println("Установите приложение для iOS по следующей ссылке");
             } else if (usersSystem == 1) {
                 System.out.println("Установите облегченную версию приложения для iOS");
             }
             if (clientDeviceYear >= 2015 && usersSystem < 1) {
                 System.out.println("Установите приложение для Android по следующей ссылке");
             } else if (usersSystem < 1) {
                 System.out.println("Установите облегченную версию приложения для Android по следующей ссылке");
             }
             return clientDeviceYear;
         }
         public static int calculateDelivery (int deliveryDistance) {
             int deliveryTerm = 1;
        if (deliveryDistance <= 20) {
        System.out.println("Срок доставки составит: " + deliveryTerm + " сутки.");
    } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
        System.out.println("Срок доставки составит: " + deliveryTerm * 2 + " суток.");
    } else {
            System.out.println("Срок доставки составит: " + deliveryTerm * 3 + " суток.");
        }
        return deliveryDistance;
    }

}