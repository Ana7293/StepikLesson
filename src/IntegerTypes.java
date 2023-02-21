public class IntegerTypes {
    public static void main(String[] args) {

    long speed = 300_000;
    long distance = 365 * 24 * 60 * 60 * speed;
    System.out.println(distance);

    int a = 5;
    a = a + 1;           // способы увеличить число на 1
    a += 1;
    a++;                 // оператор инкреме́нта
    a--;                 // оператор декреме́нта (уменьшает на 1)

    byte b = 127;
    b++;
    System.out.println(b);          //переполнение и отсчет начинается с мин.значения (здесь -128)

        byte c = 10;
        c = (byte)(c + 10);              // явное приведение типа
        System.out.println(c);

    byte d = 10;                        // неявное приведение типа
    int e = 20 + d;
        System.out.println(e);

    }
}
