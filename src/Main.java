public class Main {
    public static void main(String[] args) {
        //Задача 1
        byte beads = 1;
        short apples = 3000;
        int starsCount = 9_999;
        long atomsCount = 39_484_897L;
        float length = 0.005f;
        double moneyAmount = -5.1E-5;
        char letter = 100;
        boolean more5 = beads > 5;

        //Задача 2
        float weightBoxer1 = 78.2f, weightBoxer2 = 82.7f;
        float weightBoth = weightBoxer1 + weightBoxer2;
        float difference = weightBoxer2 - weightBoxer1;
        System.out.println("Общий вес двух бойцов: " + weightBoth + " кг.");
        System.out.println("Разница между весами бойцов: " + difference + " кг.");
        System.out.println();

        //Задача 3
        int bananasNumber = 5, bananaWeight = 80, milk100ml = 2, milkWeight = 105;
        int iceNumber = 2, iceWeight = 100, eggNumber = 4, eggWeight = 70, weightG;
        double weightKg;
        weightG = bananasNumber * bananaWeight + milk100ml * milkWeight + iceNumber * iceWeight + eggNumber * eggWeight;
        weightKg = (double) weightG / 1000;
        System.out.println("Вес спорт-завтрака: " + weightKg + " кг.");
        System.out.println();

        //Задача 4
        int normaLossKg = 7, weightLoss1 = 250, weightLoss2 = 500, daysNormalWeight1, daysNormalWeight2, daysAverage;
        boolean lastDay = (normaLossKg * 1000) % weightLoss1 > 0;
        int i = lastDay ? 1 : 0;
        daysNormalWeight1 =  (normaLossKg * 1000) / weightLoss1 + i;
        daysNormalWeight2 = (normaLossKg * 1000) / weightLoss2 + i;
        lastDay = (daysNormalWeight1 + daysNormalWeight2) / 2 > 0;
        i = lastDay ? 1 : 0;
        daysAverage = (daysNormalWeight1 + daysNormalWeight2) / 2 + i;
        System.out.println(daysNormalWeight1 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по "
                + weightLoss1 + " грамм.");
        System.out.println(daysNormalWeight2 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по "
                + weightLoss2+ " грамм.");
        System.out.println("Потребуется в среднем " + daysAverage + " дней, чтобы добиться результата похудения.");
        System.out.println();

        //Задача 5
        double salaryM = 67_760, salaryD = 83_690, salaryK = 76_230, rise = 0.1,
                riseM = salaryM * rise, riseD = salaryD * rise, riseK = salaryK * rise,
                newSalaryM = salaryM+riseM, newSalaryD = salaryD + riseD, newSalaryK = salaryK + riseK;

        System.out.println("Маша теперь получает " + newSalaryM + " рублей. Годовой доход вырос на " + riseM + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryD + " рублей. Годовой доход вырос на " + riseD + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryK + " рублей. Годовой доход вырос на " + riseK + " рублей.");

    }
}