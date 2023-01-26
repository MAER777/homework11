public class Main {

//    public static void printSeparator() {
//        System.out.println("+++++++++++++++++");
//        System.out.println("-----------------");
//    }
//
//    public static void printIssues(int issuesCount ) {
//        System.out.println(issuesCount);
//    }
//    public static int sum(int[] numbers) {
//        int sum = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            sum = sum + numbers[i];
//        }
//        return sum;
//    }

    public static void checkerLeapYear(int yearChecker) {
        if (yearChecker % 100 == 0 && yearChecker % 400 == 0) {
            System.out.println(yearChecker + " год, високосный.");
        } else if (yearChecker % 4 ==0 && yearChecker % 100 > 0) {
            System.out.println(yearChecker + " год, високосный.");
        } else if (yearChecker % 100 == 0) {
            System.out.println(yearChecker + " год, не високосный.");
        } else {
            System.out.println(yearChecker + " год, не високосный");
        }
    }

    public static void checkerDeviceClient(int deviceOS, int deviceYear) {
        if (deviceOS == 0) {
            if (deviceYear >= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        } else if (deviceOS == 1) {
            if (deviceYear >= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        } else {
            System.out.println("Выберете операционную систему вашего устройства");
        }
    }

    public static int checkersDistanceDay (int deliveryDistance) {
        int deliveryDay = 1;
        if (deliveryDistance > 20) {
            deliveryDay++;
        }
        if (deliveryDistance > 60) {
            deliveryDay++;
        }
        if (deliveryDistance > 100) {
            deliveryDay++;
        }
        return deliveryDay;
    }

    public static void main(String[] args) {
//        test1();
        task1();
        task2();
        task3();
    }

//    public static void test1() {
//        System.out.println("Тестовые задачи");
//        int[] issuesByMonths = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6};
//        printSeparator();
//        for (int i = 0; i < issuesByMonths.length; i++) {
//            printIssues(issuesByMonths[i]);
//            if ((i + 1) % 3 == 0) {
//                printSeparator();
//            }
//        }
//        printSeparator();
//        int total = sum(issuesByMonths);
//        printIssues(total);
//    }
    public static void task1() {
        System.out.println("Задача 1");
        int year = 2011;
        checkerLeapYear(year);
    }
    public static void task2() {
        System.out.println("Задача 2");
        int clientDeviceOs = 0;
        int clientDeviceYear = 2015;
        checkerDeviceClient(clientDeviceOs,clientDeviceYear);
    }
    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 101;
        int deliveryDay = checkersDistanceDay(deliveryDistance);
        if (deliveryDay > 3) {
            System.out.println("Доставка свыше 100 км не действует");
        } else {
            System.out.println("Потребуется для доставки дней: " + deliveryDay);
        }
    }
}