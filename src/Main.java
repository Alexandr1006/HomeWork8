public class Main {
    public static void main(String[] args) {
//OneTask(Зарплата)

        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total <= 2459000) {
            total = total + total / 100;
            total = total + salary;
            month = month + 1;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");

//TwoTask(числа)
        int a = 0;
        while (a <= 10) {
            a = a + 1;
            System.out.print(a + " ");
        }
        System.out.println("\n");
            for (int b = 10; b >= 1; b--) {
                System.out.print(b + " ");
            }

//ThreeTask(численность)

        int population = 12_000_000;
        int fertilityYear = population / 1000 * 17;
        int mortalityYear = 8;
        for(int c = 1; c<= 10; c++) {
            population = population + fertilityYear - mortalityYear;
            System.out.println("\n"+ "Год " + c + ", численность населения составляет " + population);
        }

//FourTask(накопление1)

        int money = 15000;
        int totalMoney = 0;
        int cumulationMonth = 0;
        while (totalMoney <= 12_000_000) {
            cumulationMonth = cumulationMonth + 1;
            totalMoney = totalMoney + totalMoney * 7 / 100;
            totalMoney = totalMoney + money;
            System.out.println("1Месяц " + cumulationMonth + " 1Накоплений " + totalMoney);
        }

//FiveTask(накопление2)

        int money1 = 15000;
        int totalMoney1 = 0;
        int cumulationMonth1 = 0;
        while (totalMoney1 <= 12_000_000) {
            cumulationMonth1 = cumulationMonth1 + 1;
            totalMoney1 = totalMoney1 + totalMoney1 * 7 / 100;
            totalMoney1 = totalMoney1 + money1;
            if (cumulationMonth1 % 6 == 0) {
                System.out.println("2Месяц " + cumulationMonth1 + " 2Накоплений " + totalMoney1);
            }
        }

//SixTask(накопление3)

        int money2 = 15000;
        int totalMoney2 = 0;
        for (int cumulationMonth2 = 0; cumulationMonth2 <= 108; cumulationMonth2+=1) {
            totalMoney2 = totalMoney2 + totalMoney2 * 7 / 100;
            totalMoney2 = totalMoney2 + money2;
            if (cumulationMonth2 % 6 == 0) {
                System.out.println("3Месяц " + cumulationMonth2 + " 3Накоплений " + totalMoney2);
            }
        }

//SevenTask(день недели)

        for(int friday = 4; friday <= 31; friday+= 7){
            System.out.println("Сегодня пятница," + friday + "-е число. Необходимо подготовить отчет.");
        }

//EightTask(комета)

        for(int oldYear = 1822;oldYear <=2122; oldYear++) {
            if (oldYear % 79 == 0) {
                System.out.println("Комета пролетает в " + oldYear);
            }
        }
//NineTask(таблица умножений)

        for(int number = 1; number<= 10; number++) {
           int multiplication = number * 2;
            System.out.println("2*" + number + "=" + multiplication);
        }
    }
}