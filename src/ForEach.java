public class ForEach {
    public static void main(String[] args) {
        String[] students = new String[5];
        students[0] = "Anna";
        students[1] = "Betty";
        students[2] = "Helen";
        students[3] = "Maks";
        students[4] = "Jonn";
  //      for (int j = 0; j < students.length; j++) {   //1 способ вывести на консоль элементы массива
  //          System.out.println(students[j]);
  //      }
        for (String names: students                     // 2 способ вывести на консоль элементы массива
             ) {                                        // здесь используем цикл for each
            System.out.println(names);
        }

     int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++)        // 1 способ заполнить массив и вывести на консоль
            numbers [i] = 100 + i;
        for (int number: numbers                        // здесь используем цикл for each
        ) {
            System.out.println(number);
        }

        int[] numbers1 = new int[100];                  // 2 способ заполнить массив и вывести на консоль
        for (int i = 0; i < numbers1.length; i++) {
            numbers1[i] = 100 + i;
            System.out.println(numbers1[i]);
        }
    }
}
