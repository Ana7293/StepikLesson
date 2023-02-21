public class Boolean {
    public static void main(String[] args) {
        int tempHome  = 30;                                 // про кондиционер
        int tempWeather = 35;
        int averageTemp = (tempHome + tempWeather) / 2;
        int time = 23;
        boolean hot = averageTemp >= 25;
        boolean cold = averageTemp <= 20;
        boolean isNight = time >= 23 || time <= 7;

        if(hot && !isNight) {                                   // если сейчас жарко и не ночь
            System.out.println("Включи кондиционер!");
        } else if (cold) {
            System.out.println("Выключи кондиционер!");
        } else {
            System.out.println("Не трогай кондиционер!");
        }

        int temp = 25;                                      //про погоду
        int time2 = 5;
        boolean good = temp > 20 && temp < 30;               // если больше 20 и меньше 30
        boolean night = time2 > 23 || time2 < 7;             // если больше 23 или меньше 7
        if (good && !night) {
            System.out.println("Гулять!");
        }
            if (!good && !night){
                System.out.println("Читать!");
            }
            if (night){
                System.out.println("Спать!");
            }

    }
}
