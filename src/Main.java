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

        //Задача 3
        int bananasNumber = 5, bananaWeight = 80, milk100ml = 2, milkWeight = 105;
        int iceNumber = 2, iceWeight = 100, eggNumber = 4, eggWeight = 70, weightG;
        double weightKg;
        weightG = bananasNumber * bananaWeight + milk100ml * milkWeight + iceNumber * iceWeight + eggNumber * eggWeight;
        weightKg = (double) weightG / 1000;
        System.out.println("Вес спорт-завтрака: " + weightKg);

        //Задача 4
        /*int normaLoss = 7, weightLoss1 = 250, weightLoss2 = 500;
        double daysNormalWeight1, daysNormalWeight2, daysAverage;
        daysNormalWeight1 = (normaLoss * 1000) / weightLoss1;
        daysNormalWeight2 = (normaLoss * 1000) / weightLoss2;
        daysAverage = (daysNormalWeight1 + daysNormalWeight2) / 2;
        System.out.println(daysNormalWeight1 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по "
                + weightLoss1+ " грамм.");
        System.out.println(daysNormalWeight2 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по "
                + weightLoss2+ " грамм.");
        System.out.println("Потребуется в среднем " + daysAverage + " дней, чтобы добиться результата похудения.");
        */
        //Для чего в задании 4 нужна операция определения остатка деления?

        //Задача 5

    }
}