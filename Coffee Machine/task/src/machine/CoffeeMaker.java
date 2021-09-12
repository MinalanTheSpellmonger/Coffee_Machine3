package machine;

import java.util.Scanner;

public class CoffeeMaker {
    private int waterStore;
    private int milkStore;
    private int beanStore;
    private int cups;
    private int cash;

    public CoffeeMaker() {
        this.waterStore = 400;
        this.milkStore = 540;
        this.beanStore = 120;
        this.cups = 9;
        this.cash = 550;
    }

    public void printStatus() {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(this.getWaterStore() + " ml of water");
        System.out.println(this.getMilkStore() + " ml of milk");
        System.out.println(this.getBeanStore() + " g of coffee beans");
        System.out.println(this.getCups() + " disposable cups");
        System.out.println("$" + this.getCash() + " of money");
        System.out.println();
    }

    public void collectCash() {
        System.out.println("I give you $" + this.getCash());
        this.setCash(0);
        //this.printStatus();
    }

    public void fill() {
        Scanner scanner = new Scanner(System.in);
        //
        System.out.println("Write how many ml of water you want to add: ");
        int addWater = scanner.nextInt();
        this.setWaterStore(this.getWaterStore() + addWater);
        //
        System.out.println("Write how many ml of milk you want to add:");
        int addMilk = scanner.nextInt();
        this.setMilkStore(this.getMilkStore() + addMilk);
        //
        System.out.println("Write how many grams of coffee beans you want to add:");
        int addBeans = scanner.nextInt();
        this.setBeanStore(this.getBeanStore() + addBeans);
        //
        System.out.println("Write how many disposable cups of coffee you want to add:");
        int addCups = scanner.nextInt();
        this.setCups(this.getCups() + addCups);
        //
        //this.printStatus();
    }

    public void espresso() {
        if (this.getWaterStore() >= 250 && this.getBeanStore() >= 16) {
            System.out.println("I have enough resources, making you a coffee!");
            this.setWaterStore(this.getWaterStore() - 250);
            this.setBeanStore(this.getBeanStore() - 16);
            this.setCash(this.getCash() + 4);
            this.setCups(this.getCups() - 1);
            //this.printStatus();
        } else if (this.getWaterStore() < 250){
            System.out.println("Sorry, not enough water!");
        } else if (this.getBeanStore() < 16) {
            System.out.println("Sorry, not enough beans");
        }
    }

    public void latte() {
        if (this.getWaterStore() >= 350 && this.getMilkStore() >= 75 && this.getBeanStore() >= 20) {
            System.out.println("I have enough resources, making you a coffee!");
            this.setWaterStore(this.getWaterStore() - 350);
            this.setMilkStore(this.getMilkStore() - 75);
            this.setBeanStore(this.getBeanStore() - 20);
            this.setCash(this.getCash() + 7);
            this.setCups(this.getCups() - 1);
            //this.printStatus();
        } else if (this.getWaterStore() < 350){
            System.out.println("Sorry, not enough water!");
        } else if (this.getBeanStore() < 20) {
            System.out.println("Sorry, not enough beans");
        } else if (this.getMilkStore() < 75) {
            System.out.println("Sorry, not enough milk");
        }
    }

    public void cappuccino() {
        if (this.getWaterStore() >= 200 && this.getMilkStore() >= 100 && this.getBeanStore() >= 12) {
            System.out.println("I have enough resources, making you a coffee!");
            this.setWaterStore(this.getWaterStore() - 200);
            this.setMilkStore(this.getMilkStore() - 100);
            this.setBeanStore(this.getBeanStore() - 12);
            this.setCash(this.getCash() + 6);
            this.setCups(this.getCups() - 1);
            //this.printStatus();
        } else if (this.getWaterStore() < 200){
            System.out.println("Sorry, not enough water!");
        } else if (this.getBeanStore() < 12) {
            System.out.println("Sorry, not enough beans");
        } else if (this.getMilkStore() < 100) {
            System.out.println("Sorry, not enough milk");
        }
    }

    public int getWaterStore() {
        return waterStore;
    }

    public void setWaterStore(int waterStore) {
        this.waterStore = waterStore;
    }

    public int getMilkStore() {
        return milkStore;
    }

    public void setMilkStore(int milkStore) {
        this.milkStore = milkStore;
    }

    public int getBeanStore() {
        return beanStore;
    }

    public void setBeanStore(int beanStore) {
        this.beanStore = beanStore;
    }

    public int getCups() {
        return cups;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }
}
