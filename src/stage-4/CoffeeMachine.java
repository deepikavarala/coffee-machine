import java.util.Scanner;
public class CoffeeMachine {
    public static void main(String[] args) {
        System.out.println("The Coffee machine has:");
        int water = 1200;
        int milk = 540;
        int coffeebeans = 120;
        int cups = 9;
        int money = 550;
        display(water,milk,coffeebeans,cups,money);
        Scanner in = new Scanner(System.in);
        System.out.print("Write action (buy, fill, take): ");
        String choice = in.next();
        switch (choice){
            case "buy":
                buy(water,milk,coffeebeans,cups,money);
                break;
            case "fill":
                fill(water,milk,coffeebeans,cups,money);
                break;
            case "take":
                take(water,milk,coffeebeans,cups,money);
                break;
            default:
                System.out.println("Try again!");
        }
    }
    private static void buy(int water,int milk,int coffeebeans,int cups,int money){
        Scanner in = new Scanner(System.in);
        System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        int typeOfCoffee = in.nextInt();
        if(typeOfCoffee==1){
            water = water - 250;
            coffeebeans = coffeebeans - 16;
            money = money + 4;
            cups = cups - 1;
        } else if(typeOfCoffee==2){
            water = water - 350;
            milk = milk - 75;
            coffeebeans = coffeebeans - 20;
            money = money + 7;
            cups = cups - 1;
        } else {
            water = water - 200;
            milk = milk - 100;
            coffeebeans = coffeebeans - 12;
            money = money + 6;
            cups = cups - 1;
        }
        display(water, milk, coffeebeans, cups, money);
    }
    private static void fill(int water,int milk,int coffeebeans,int cups,int money){
        Scanner in = new Scanner(System.in);
        System.out.print("Write how many ml of water do you want to add: ");
        int addWater = in.nextInt();
        System.out.print("Write how many ml of milk do you want to add: ");
        int addMilk = in.nextInt();
        System.out.print("Write how many grams of coffee beans do you want to add: ");
        int addCoffeebeans = in.nextInt();
        System.out.print("Write how many disposable cups of coffee do you want to add: ");
        int addCups = in.nextInt();
        water = water + addWater;
        milk = milk + addMilk;
        coffeebeans = coffeebeans + addCoffeebeans;
        cups = cups + addCups;
        display(water, milk, coffeebeans, cups, money);
    }
    private static void take(int water,int milk,int coffeebeans,int cups,int money){
        System.out.println("I gave you $"+money);
        money = 0;
        display(water, milk, coffeebeans, cups, money);
    }
    private static void display(int water,int milk,int coffeebeans,int cups,int money){
        System.out.println("The coffee machine has: ");
        System.out.println(water+" of water");
        System.out.println(milk+" of milk");
        System.out.println(coffeebeans+" of coffee beans");
        System.out.println(cups+" of disposable cups");
        System.out.println(money+" of money");
    }
}
