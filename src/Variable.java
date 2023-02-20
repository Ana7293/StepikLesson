import org.w3c.dom.ls.LSOutput;

public class Variable {
    public static void main(String[] args) {
        int lena = 5;                           // у Лены было 5 яблок
        int maks = lena + 5;                    // у Макса - на 5 яблок больше
        System.out.println(maks);               // сколько яблок у Макса?
        System.out.println(lena + maks);        // сколько всего яблок?

        int jon = 100;                          // у Джона было 100 руб
        int niсk = jon * 5;                      // у Ника - в 5 раз больше
        System.out.println(jon + niсk);          // сколько всего денег?

        int mom = 10;                           // У мамы было 10 яблок
        int son = 3;                            // всего 3 сына
        int sonApples = mom / son;              // сколько яблок у каждого сына
        int momApples = mom % son;              // сколько останется у мамы
        System.out.println("Каждому сыну достанется по " + sonApples + " яблока/яблок");
        System.out.println("У мамы останется " + momApples + " яблоко/яблок");

        int days = 10000;                       // дано 10 тыс дней
        int year = days / 365;                  // сколько полных  лет
        int  month = (days - (year * 365)) / 30; // сколько полных месяцев
        int restDays = (days - (year * 365)) % 30;;
        System.out.println(days + " - это " + year + " лет, " + month + " месяца/месяцев, и " + restDays + " дня/дней!");
    }


}
