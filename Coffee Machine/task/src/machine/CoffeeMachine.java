package machine;

import java.util.Arrays;
import java.util.Scanner;

public class CoffeeMachine {


    public static void main(String[] args) {
        //canIMakeThat();
        //ingredientCalculator();
        CoffeeMaker myCoffeeMaker = new CoffeeMaker();
        buyFillTake(myCoffeeMaker);
    }

    public static void buyFillTake(CoffeeMaker myCoffeeMaker) {
        Scanner scanner = new Scanner(System.in);
        //myCoffeeMaker.printStatus();
        //
        boolean using = true;
        while (using) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String command = scanner.next();
            switch (command) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, 4 - back:");
                    String buyWhat = scanner.next();
                    switch (buyWhat) {
                        case "1":
                            myCoffeeMaker.espresso();
                            break;
                        case "2":
                            myCoffeeMaker.latte();
                            break;
                        case "3":
                            myCoffeeMaker.cappuccino();
                            break;
                        case "back":
                            break;
                    }
                    break;
                case "fill":
                    myCoffeeMaker.fill();
                    break;
                case "take":
                    myCoffeeMaker.collectCash();
                    break;
                case "remaining":
                    myCoffeeMaker.printStatus();
                    break;
                case "exit":
                    using = false;
                    break;

            }

        }

    }

    public static void ingredientCalculator() {
        Scanner scanner = new Scanner(System.in);
        int oneWater = 200;
        int oneMilk = 50;
        int oneBeans = 15;
        System.out.println("Write how many cups of coffee you will need:");
        int desiredCups = scanner.nextInt();
        System.out.println("For " + desiredCups + " cups of coffee you will need:");
        System.out.println(oneWater * desiredCups + " ml of water");
        System.out.println(oneMilk * desiredCups + " ml of milk");
        System.out.println(oneBeans * desiredCups + " g of coffee beans");
    }

    public static void canIMakeThat() {
        int oneWater = 200;
        int oneMilk = 50;
        int oneBeans = 15;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int waterStore = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milkStore = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beanStore = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int desiredCups = scanner.nextInt();
        //
        int requiredWater = desiredCups * oneWater;
        int requiredMilk = desiredCups * oneMilk;
        int requiredBeans = desiredCups * oneBeans;
        //
        int surplusWater = waterStore - requiredWater;
        int surplusMilk = milkStore - requiredMilk;
        int surplusBeans = beanStore - requiredBeans;
        //
        int cupsOfExtraWater = surplusWater / 200;
        int cupsOfExtraMilk = surplusMilk / 50;
        int cupsOfExtraBeans = surplusBeans / 15;
        //
        int possibleWater = waterStore / oneWater;
        int possibleMilk = milkStore / oneMilk;
        int possibleBeans = beanStore / oneBeans;
        int[] possibleCups = new int[3];
        possibleCups[0] = possibleWater;
        possibleCups[1] = possibleMilk;
        possibleCups[2] = possibleBeans;
        Arrays.sort(possibleCups);
        int maxPossibleCups = possibleCups[0];
        //
        int[] extraCups = new int[3];
        extraCups[0] = cupsOfExtraWater;
        extraCups[1] = cupsOfExtraMilk;
        extraCups[2] = cupsOfExtraBeans;
        Arrays.sort(extraCups);
        int extraCupsAvailable = extraCups[0];
        //
        if (surplusWater >= 0 && surplusMilk >= 0 && surplusBeans >= 0) {
            if (extraCupsAvailable > 0) {
                System.out.println("Yes, I can make that amount of coffee (and even " + extraCupsAvailable + " more than that");
            } else {
                System.out.println("Yes, I can make that amount of coffee");
            }
        } else {
            System.out.println("No, I can only make " + maxPossibleCups + " cup(s) of coffee");
        }


    }

    public static void temp() {
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
    }
}
