import java.util.Scanner;
public class CoffeeMachine {
    public static void main(String[] args) {
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
        Scanner in = new Scanner(System.in);
        System.out.print("Write how many ml of water the coffee machine has: ");
        int water = in.nextInt();
        System.out.print("Write how many ml of milk the coffee machine has: ");
        int milk = in.nextInt();
        System.out.print("Write how many grams of coffee beans the coffee machine has: ");
        int beans = in.nextInt();
        System.out.print("Write how many cups of coffee you will need: ");
        int cups = in.nextInt();

        int waterCups = water / 200;
        int milkCups = milk / 50;
        int beansCups = beans / 15;

        int limit = Math.min(waterCups, Math.min(milkCups, beansCups));

        if (cups > limit) {
            System.out.println("No, I can make only " + limit + " cup(s) of coffee");
        } else if (cups == limit) {
            System.out.println("Yes, I can make that amount of coffee");
        } else {
            int extra = limit - cups;
            System.out.println("Yes, I can make that amount of coffee (and even " + extra + " more than that)");
        }
        /*System.out.println("For "+noOfCups+" cups of coffee you will need: ");
        System.out.println(noOfCups*200+" ml of water");
        System.out.println(noOfCups*50+" ml of milk");
        System.out.println(noOfCups*15+" g of coffee beans");*/
        int a=in.nextInt();
        String op=in.next();
        int b=in.nextInt();
        switch (op){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                if(b==0){
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(a/b);
                }
                default:
                    System.out.println("Unknown operator");
        }
    }
}
