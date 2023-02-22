public class Loop {
    public static void main(String[] args) {
        int i = 1;                  // цикл while выводит числа от 1 до 1000
        while (i <= 1000) {
            System.out.println(i);
            i++;
        }
        System.out.println("--------------------");

        int a = 0;                  // цикл + If выводит все четные число от 0 до 1000 (1способ)
        while (a <= 1000) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
            a++;
        }

        System.out.println("--------------------");

        int х = 0;                  // цикл выводит все четные числа от 1 до 1000 (2способ)
        while (х <= 1000) {
            System.out.println(х);
            х+=2;
        }

        System.out.println("--------------------");

        int y = 1;                  // цикл выводит все нечетные числа от 1 до 1000
        while (y <= 1000) {
            System.out.println(y);
            y+=2;
        }

        System.out.println("--------------------");

        int z = 1;                  // цикл прерывается, если значние равно 5
        while (z <= 1000) {
            System.out.println(z);
            z++;
            if (z == 5){
                break;
            }
        }

        System.out.println("--------------------");

        int c = 0;                                   // цикл do-while код выполняется хотя бы 1 раз, даже если условие не выполняется никогда
        do {
            System.out.println("Привет!");
        } while (c > 0);

        System.out.println("--------------------");

        for (int b = 1;b <= 1000;b++) {              // цикл for выводит числа от 1 до 1000
            System.out.println(b);
        }

        System.out.println("--------------------");

        for (int d = 1000; d >= 0; d--) {           //цикл выводит число от 1000 до 0, при этом только кратные 3.
            if (d % 3 == 0) {
                System.out.println(d);
            }
        }
    }
}
