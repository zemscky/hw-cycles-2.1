public class Main {
    public static void main(String[] args) {
//        Домашняя работа 2.1
//        Задание 1
        System.out.println("Задание 1");
        double contribution = 15_000; // Вклад
        double accumulationAmount = 0; // Cумма накопления
        int i = 0;
        while (accumulationAmount <= 2_459_000) {
            accumulationAmount = accumulationAmount + accumulationAmount / 100;
            accumulationAmount = accumulationAmount + contribution;
            i += 1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + String.format("%.2f", accumulationAmount) + " рублей");
        }
        System.out.println(i + " месяцев, необходимо для накопления данной суммы");

//        Задание 2
        System.out.println("Задание 2");
        int n = 0;
        while (n < 10) {
            n++;
            System.out.print(n + " ");
        }
        System.out.println();
        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }
//        Задание 3
        System.out.println("Задание 3");
        int population = 12_000_000; // Число жителей
        int fertility = 17; // Рождаемость на 1000
        int mortality = 8; // Смертность на 1000
        int difference = fertility - mortality;
        for (int year=1; year<=10;year++) {
            population = population + population * difference /1000;
            System.out.println("Год " + year + " численность населения составляет " + population);

        }
    }
}