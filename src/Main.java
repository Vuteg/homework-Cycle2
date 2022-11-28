import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        // Задание 1-1
        System.out.println("Задание 1-1");

//        int contributionBank = 15000;
//        int amountOfSavings = 0;
//        int c = 0;
//        while (amountOfSavings < 2_459_000) {
//            amountOfSavings = amountOfSavings + amountOfSavings / 100;
//            amountOfSavings = amountOfSavings + contributionBank;
//            System.out.println("Month " + c + ", the amount of savings is equal to " + amountOfSavings + " rublies");
//            c++;
//        }
        int endResult = 2_459_000;
        int depositBank = 15000;
        int countMonth = 1;
        double percent = 0.12;
        int saving = 0;
        while (saving < endResult) {
            saving += depositBank;
            if (countMonth % 12 == 0) {
                saving += saving * percent;
            }
            countMonth++;
        }
        System.out.println("Month " + countMonth + ", the amount of savings is equal to " + saving + " rublies");


        System.out.println();
        // Задание 1-2
        System.out.println("Задание 1-2");

        int r = 1;
        while (r <= 10) {
            System.out.print(r + " ");
            r++;
        }
        System.out.println();
        int e = 10;
        for (; e > 0; e--) {
            System.out.print(e + " ");
        }
        System.out.println();
        System.out.println();

        // Задание 1-3
        System.out.println("Задание 1-3");

//        int countryY = 12_000_000;
//        for (int q = 1; q <= 10; q++) {
//            countryY = countryY + ((17 * (countryY / 1000)) - (8 * (countryY / 1000)));
//            System.out.println("Year " + q + ", the population is " + countryY);}

        int countryY = 12_000_000;
        int bornRate1K = 17;
        int mortality1K = 8;
        int populationGrowth1K = bornRate1K - mortality1K;
        for (int year = 1; year <= 10; year++) {
            countryY += countryY * populationGrowth1K / 1000;
            System.out.println("Year " + year + ", the population is " + countryY);
        }


        System.out.println();
        // Задание 2-1
        System.out.println("Задание 2-1");

        //       int bankDeposit = 15000;
        //       int m = 0;
        //       for (; bankDeposit < 12_000_000; m++){
        //           bankDeposit = bankDeposit + bankDeposit / 100 * 7;
        //           System.out.println("Month " + m + " the amount of savings is equal " + bankDeposit + " rublies");}

        int purpose = 12_000_000;
        int monthCount = 0;
        double percentMonth = 0.07;
        int bankDeposit = 15_000;
        for (; bankDeposit < purpose; monthCount++) {
            bankDeposit += bankDeposit * percentMonth;
            System.out.println("Month " + monthCount + " the amount of savings is equal " + bankDeposit + " rublies");
        }


        System.out.println();
        // Задание 2-2
        System.out.println("Задание 2-2");


//        int bankDeposit2 = 15000;
//        for ( int m = 0 ; bankDeposit2 < 12_000_000; m++){
//            bankDeposit2 = bankDeposit2 + bankDeposit2 / 100 * 7;
//            if (m % 6 == 0)
//             System.out.println("Month " + m + " the amount of savings is equal " + bankDeposit2 + " rublies");

        int purpose1 = 12_000_000;
        int monthCount1 = 1;
        double percentMonth1 = 0.07;
        int bankDeposit1 = 15_000;
        for (; bankDeposit1 < purpose1; monthCount1++) {
            bankDeposit1 += bankDeposit1 * percentMonth1;
            if (monthCount1 % 6 == 0)
                System.out.println("Month " + monthCount1 + " the amount of savings is equal " + bankDeposit1 + " rublies");
        }


        System.out.println();
        // Задание 2-3
        System.out.println("Задание 2-3");

//        int bankDeposit3 = 15000;
//        for (int m = 1; m <= (12 * 9); m++){
//            bankDeposit3 = bankDeposit3 + bankDeposit3 / 100 * 7;
//        if ( m % 6 == 0)
//            System.out.println("Month " + m + " the amount of savings is equal " + bankDeposit3 + " rublies");}

        int monthCount2 = 1;
        double percentMonth2 = 0.07;
        int bankDeposit2 = 15_000;
        for (; monthCount2 <= (9 * 12); monthCount2++) {
            bankDeposit2 += bankDeposit2 * percentMonth2;
            if (monthCount2 % 6 == 0)
                System.out.println("Month " + monthCount2 + " the amount of savings is equal " + bankDeposit2 + " rublies");
        }

        System.out.println();
        // Задание 2-4
        System.out.println("Задание 2-4");

        int day = 4;
        while (day <= 31) {
            System.out.println("Today is Friday, " + day + "-th number. It is necessary to prepare a report.");
            day += 7;
        }
        System.out.println();
        // Задание 3-1
        System.out.println("Задание 3-1");

        int firstYears = 0;
        int nowYear = LocalDate.now().getYear();
        int startYear = nowYear - 200;
        int finishYear = nowYear + 100;
        int meteorite = 79;
        while (firstYears <= finishYear) {
            if (firstYears >= startYear) {
                System.out.println(firstYears);
            }
            firstYears += meteorite;
        }
        System.out.println();
        // Задание 3-2
        System.out.println("Задание 3-2");
        int multiplier = 0;
        int x = 1;
        for (; x <= 10; x++){
            multiplier=x * 2;
        System.out.println("2*" + x + "=" + multiplier);}
    }
}
