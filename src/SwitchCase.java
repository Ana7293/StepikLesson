import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int x = 11;                         // Вариант 1. Дано: номер месяца
        String[] yearMonths = new String[12];
        yearMonths[0] = "January";
        yearMonths[1] = "February";
        yearMonths[2] = "March";
        yearMonths[3] = "April";
        yearMonths[4] = "May";
        yearMonths[5] = "June";
        yearMonths[6] = "July";
        yearMonths[7] = "August";
        yearMonths[8] = "September";
        yearMonths[9] = "October";
        yearMonths[10] = "November";
        yearMonths[11] = "December";

        System.out.println(yearMonths[x-1]); // надо: вывести названия месяца, номер которого дано

        System.out.println("----------");

        int m = 3;                          // Вариант2. Дано: номер месяца.
        if (m == 1){
            System.out.println("January");
        } else if (m == 2){
            System.out.println("February");
        } else if (m == 3)                     //Надо: вывести названия месяца с этим номером
            System.out.println("March");

        System.out.println("----------");

        int a = 7;
        switch (a) {                            // выводим название месяца, использую конструкцию switch
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            default:
                System.out.println("Неизвестно");
        }

        System.out.println("----------");

        Scanner input = new Scanner(System.in);             // получаем данные с консоли
        System.out.println("Ваш любимый месяц: ");
        String mounthRus = input.nextLine().toLowerCase();
        switch (mounthRus) {                            // выводим название месяца, использую конструкцию switch
            case "январь":
            case "февраль":
            case "декабрь":
                System.out.println("Зима");
                break;
            case "март":
            case "апрель":
            case "май":
                System.out.println("Весна");
                break;
            case "июнь":
            case "июль":
            case "август":
                System.out.println("Лето");
                break;
            case "сентябрь":
            case "октябрь":
            case "ноябрь":
                System.out.println("Осень");
                break;
            default:
                System.out.println("Неизвестно");
        }

        }
    }


