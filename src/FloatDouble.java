public class FloatDouble {
    public static void main(String[] args) {
        double radius = 10.8;               // большая точность, по умолчанию данный тип для дробных значений
        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println(area);

        float radius1 = 10.8F;              // меньше точность, нужно указывать явно F или f
        float pi1 = 3.14F;
        float area1 = pi1 * radius1 * radius1;
        System.out.println(area1);

        int dad = 50;
        int mom = 33;
        int son1 = 27;
        int son2 = 22;
        int son3 = 12;
        int son4 = 4;
        double sum = dad + mom + son1 + son2 + son3 + son4;
        double averageOld = sum / 6;
        System.out.println(averageOld);


    }
}
