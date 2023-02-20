public class ConditionalOperator {
    public static void main(String[] args) {
        int tempHome  = 20;                                 // про кондиционер
        int tempWeather = 25;
        int averageTemp = (tempHome + tempWeather) / 2;
        if(averageTemp >= 25){
            System.out.println("Включи кондиционер!");
        } else if (averageTemp <= 20) {
            System.out.println("Выключи кондиционер!");
        } else {
            System.out.println("Не трогай кондиционер!");
        }

    int myWallet = 5;
    int sisterWallet = 5;
    int cash = myWallet + sisterWallet;
        if(cash > 10){
            System.out.println("Урра! Купим пиццу");
        } else if (cash >= 6 && cash <= 10) {
            System.out.println("Закажем гамбургер!");
        } else {
            System.out.println("Кофе и пончик! Тоже хорошо!");
        }
    }
}
