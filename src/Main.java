public class Main {
    public static void main(String[] args) {
//Задача 1
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android.");
        }
        //Задача 2
        System.out.println("Задача 2");
        int clientOs = 1;
        int deviceYear = 2012;
        if (clientOs == 0) {
            if (deviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS.");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }    else {
         if (deviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android.");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        //Задача 3
        System.out.println("Задача 3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " является високосным.");
        } else {
            System.out.println(year + " не является високосным.");
        }
        //Задача 4
        System.out.println("Задача 4");
      int deliveryDistance = 95;
      if (deliveryDistance <= 20) {
          System.out.println("Доставка займёт сутки.");
      } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
          System.out.println("Доставка займёт 2 дня");
      } else if (deliveryDistance > 60 && deliveryDistance <=100) {
          System.out.println("Доставка займёт 3 дня");
      } else {
          System.out.println("Доставка займёт больше 3 дней.");
      }
        //Задача 5
        System.out.println("Задача 5");
      int monthNumber = 12;
      switch (monthNumber) {
          case 1:
              System.out.println("Это зимний месяц");
              break;
          case 2:
              System.out.println("Это зимний месяц");
              break;
          case 3:
              System.out.println("Это весенний месяц");
              break;
          case 4:
              System.out.println("Это весенний месяц");
              break;
          case 5:
              System.out.println("Это весенний месяц");
              break;
          case 6:
              System.out.println("Это летний месяц");
              break;
          case 7:
              System.out.println("Это летний месяц");
              break;
          case 8:
              System.out.println("Это летний месяц");
              break;
          case 9:
              System.out.println("Это осенний месяц");
              break;
          case 10:
              System.out.println("Это осенний месяц");
              break;
          case 11:
              System.out.println("Это осенний месяц");
              break;
          case 12:
              System.out.println("Это зимний месяц");
              break;
          default:
              System.out.println("Такого месяца нет");
      }



    }
}