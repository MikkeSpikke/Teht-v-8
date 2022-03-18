import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Mainclass {

    public static void main(String[] args) {

        BottleDispenser bd = BottleDispenser.getInstance();
        BottleDispenser bd1 = BottleDispenser.getInstance();
        bd.addMoney();
        bd1.addMoney();
        bd.returnMoney();

        // BottleDispenser bd = new BottleDispenser();
        Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int choice, bChoice;

        while (true) {
            System.out.println("\n*** BOTTLE DISPENSER ***");
            System.out.println("1) Add money to the machine");
            System.out.println("2) Buy a bottle");
            System.out.println("3) Take money out");
            System.out.println("4) List bottles in the dispenser");
            System.out.println("0) End");
            System.out.print("Your choice: ");
            choice = s.nextInt();
            switch (choice) {
                case 0:
                    s.close();
                    return;
                case 1:
                    bd.addMoney();
                    break;
                case 2:
                    bd.listBottles();
                    System.out.print("Your choice: ");
                    bChoice = s.nextInt();
                    bd.buyBottle(bChoice);
                    break;
                case 3:
                    bd.returnMoney();
                    break;
                case 4:
                    bd.listBottles();
                    break;
                default:
                    System.out.println("Wrong choice.");
            }
        }
    }
}
