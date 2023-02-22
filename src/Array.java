public class Array {
    public static void main(String[] args) {
        String[] months = new String[12];
        months[0] = "January";
        months[1] = "February";
        months[2] = "March";
        months[3] = "April";
        months[4] = "May";
        months[5] = "June";
        months[6] = "July";
        months[7] = "August";
        months[8] = "September";
        months[9] = "October";
        months[10] = "November";
        months[11] = "December";

        for (int i = 0; i < months.length; i++) {                    //вывести массив строк, после каждого элемента - запятая, а после последнего - точка.
            if (i < months.length - 1) {
                System.out.print(months[i] + ", ");                 // 1 способ с if
            } else {
                System.out.print(months[i] + ".");
            }
        }

        System.out.println();

        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int j = 0; j < number.length; j++) {
            System.out.print(number[j]);                //вывести массив чисел, после каждого элемента - запятая, а после последнего - точка.
            if (j < number.length - 1) {                 // 2 способ с if
                System.out.print(", ");
            } else {
                System.out.print(".");
            }
        }
        System.out.println();

        int[] number2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};           //вывести элементы массива, начиная с последнего
        for (int a = number2.length-1; a >= 0; a--) {
            System.out.println(number[a]);
        }
    }
}
