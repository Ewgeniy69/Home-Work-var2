public class Main {
    public static void main(String[] args) {
//        short banana = 200;
//        System.out.println("Banana " + banana + " kg");
//
//        float sugar = 3;
//        float onePortion = sugar/4;
//        System.out.println(onePortion);
//
//        byte a = 1;
//        short b = 2;
//        int c  = 3;
//        int d = a + b + c;
//        System.out.println(d);

//        byte mob = 127;
//        byte mob1 = -128;
//        short note = 32767;
//        short note1 = -32768;
//        int tel = 2_147_483_647;
//        int tel2 = -2_147_483_648;
//        long pro = 9_223_372_036_854_775_807L;
//        long pro1 = -9223372036854775808L;
//        float net = 3.7F;
//        double net2 = 3.12345678;
//
//        float aa = 27.12F;
//        long bb = 987_678_965_549L;
//        float cc = 2.786F;
//        short dd = 569;
//        short ff = -159;
//        short gg = 27897;
//        byte hh = 67;

        byte lP = 23;
        byte aS = 27;
        byte eA = 30;
        short totalSheets = 480;
        short sheetsInOneStudent = (short) (totalSheets / (lP + aS + eA));
        System.out.println("На каждого ученика рассчитано " + sheetsInOneStudent + " листов бумаги");

        int bottle = 16;
        int minute = 2;
        int bottleInOneMinute = bottle / minute;
        System.out.println("За одну минуту машина произведет " + bottleInOneMinute + " бутылок");
        int minute1 = 20;
        int bottleInTwentyMinutes = bottleInOneMinute * minute1;
        System.out.println("За 20 минут машина произведет " + bottleInTwentyMinutes + " бутылок");
        int hourInDay = 24;
        int minutesInHour = 60;
        int minutesInDay = hourInDay * minutesInHour;
        int totalBottleInDay = minutesInDay * bottleInOneMinute;
        System.out.println("За сутки машина произведет " + totalBottleInDay + " бутылок");
        int minutesInThreeDays = minutesInDay * 3;
        int totalBottleInThreeDays = minutesInThreeDays * bottleInOneMinute;
        System.out.println("За трое суток машина произведет " + totalBottleInThreeDays + " бутылок");
        int minutesInOneMonth = minutesInDay * 30;
        int totalBottleInMonth = minutesInOneMonth * bottleInOneMinute;
        System.out.println("За месяц машина произведет " + totalBottleInMonth + " бутылок");

        int whiteForOneClass = 2;
        int brownForOneClass = 4;
        int totalDye = 120;
        int totalDyeForOneClass = whiteForOneClass + brownForOneClass;
        System.out.println("На один класс нужно " + totalDyeForOneClass + " банок краски");
        int totalClassInSchool = totalDye / totalDyeForOneClass;
        System.out.println("Всего в школе " + totalClassInSchool + " классов");
        int totalWhiteDye = whiteForOneClass * totalClassInSchool;
        int totalBrownDye = brownForOneClass * totalClassInSchool;
        System.out.println("В школе, где " + totalClassInSchool + " классов, нужно " + totalWhiteDye + " банок белой краски и " + totalBrownDye + " банок коричневой краски");

        int bananaInCocktail = 5;
        int weightBananaInGrams = 80;
        int totalWeightBananas = bananaInCocktail * weightBananaInGrams;
        int milkInCocktail = 200;
        int weightOnePortionMilkInGrams = 105;

        int totalWeightMilk = milkInCocktail * weightOnePortionMilkInGrams / 100;
        int iceCreamInCockTail = 2;
        int weightOnePortionIceCreamInGrams = 100;
        int totalWeightIceCream = iceCreamInCockTail * weightOnePortionIceCreamInGrams;
        int eggsInCocktail = 4;
        int weightEggInGrams = 70;
        int totalWeightEggs = eggsInCocktail * weightEggInGrams;
        int totalWeightProductsInCocktailInGrams = totalWeightEggs + totalWeightMilk + totalWeightIceCream + totalWeightBananas;
        System.out.println("Всего в коктейле " + totalWeightProductsInCocktailInGrams + " грамм продуктов");
        double gramsInKg = 1000.0;
        double totalWeightProductsInCocktailInKg = totalWeightProductsInCocktailInGrams / gramsInKg;
        System.out.println("Всего в коктейле " + totalWeightProductsInCocktailInKg + " килограмм продуктов");

        int weightInDayInGrams = 250;
        int totalWeightInKg = 7;
        int totalWeightInGrams = totalWeightInKg * 1000;
        int totalDay = totalWeightInGrams / weightInDayInGrams;
        System.out.println("Для похудения на " + totalWeightInKg + " кг, если спортсмен будет терять в весе по " + weightInDayInGrams + " гр. ежедневно, понадобится " + totalDay + " дней");

        int weightInDayInGrams2 = 500;
        int totalDay2 = totalWeightInGrams / weightInDayInGrams2;
        System.out.println("Для похудения на " + totalWeightInKg + " кг, если спортсмен будет терять в весе по " + weightInDayInGrams2 + " гр. ежедневно, понадобится " + totalDay2 + " дней");
        int averageDay = (totalDay + totalDay2) / 2;
        System.out.println("В среднем потребуется " + averageDay + " день, для похудения на 7 килограмм");

        int masha = 67760;
        int denis = 83690;
        int kris = 76230;
        int percentForMoney = 10;
        int raiseMasha = masha * percentForMoney / 100;
        int newMasha = masha + raiseMasha;
        System.out.println("Маша теперь получает " + newMasha + " рублей. Годовой доход вырос на " + (raiseMasha * 12) + " рублей");
//        int moneyForMasha = (masha*percentForMoney)/100;
//        System.out.println("Прибавка к месячной зарплате Маши составит " + moneyForMasha + " рублей");
//        int moneyForMashaInMonthLater = masha + moneyForMasha;
//        int moneyForMashaInYearNow = masha*12;
//        System.out.println("ЗП Маши за год до повышения составляет " + moneyForMashaInYearNow + " рублей");
//        int moneyForMashaLater = moneyForMashaInMonthLater*12;
//        System.out.println("ЗП Маши за год после повышения составит " + moneyForMashaLater + " рублей");
//        int heightMashaForYear = moneyForMashaLater - moneyForMashaInYearNow;
//        System.out.println("Маша теперь получает " + moneyForMashaInMonthLater + " рублей. Годовой доход вырос на " + heightMashaForYear + " рублей");

        int moneyForDenis = (denis * percentForMoney) / 100;
        System.out.println("Прибавка к месячной зарплате Дениса составит " + moneyForDenis + " рублей");
        int moneyForDenisInMonthLater = denis + moneyForDenis;
        int moneyForDenisInYearNow = denis * 12;
        System.out.println("ЗП Дениса за год до повышения составляет " + moneyForDenisInYearNow + " рублей");
        int moneyForDenisLater = moneyForDenisInMonthLater * 12;
        System.out.println("ЗП Дениса за год после повышения составит " + moneyForDenisLater + " рублей");
        int heightDenisForYear = moneyForDenisLater - moneyForDenisInYearNow;
        System.out.println("Денис теперь получает " + moneyForDenisInMonthLater + " рублей. Годовой доход вырос на " + heightDenisForYear + " рублей");

        int moneyForKris = (kris * percentForMoney) / 100;
        System.out.println("Прибавка к месячной зарплате Кристины составит " + moneyForKris + " рублей");
        int moneyForKrisInMonthLater = kris + moneyForKris;
        int moneyForKrisInYearNow = kris * 12;
        System.out.println("ЗП Кристины за год до повышения составляет " + moneyForKrisInYearNow + " рублей");
        int moneyForKrisLater = moneyForKrisInMonthLater * 12;
        System.out.println("ЗП Кристины за год после повышения составит " + moneyForKrisLater + " рублей");
        int heightKrisForYear = moneyForKrisLater - moneyForKrisInYearNow;
        System.out.println("Кристина теперь получает " + moneyForKrisInMonthLater + " рублей. Годовой доход вырос на " + heightKrisForYear + " рублей");


    }
}