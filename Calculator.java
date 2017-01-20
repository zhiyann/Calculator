
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author YAN
 */
public class Calculator {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double firstNum = 0;
        double secondNum = 0;
        double choice = 0;
        int operation;
        String pattern = "\\d+(\\.\\d+)?";
        String checkFirstNum;
        String checkSecondNum;

        System.out.println("------------------------------------");
        System.out.println("             Calculator             ");
        System.out.println("------------------------------------");

        do {
            System.out.print("Please enter the first number: ");
            checkFirstNum = s.next();
        } while (!checkFirstNum.matches(pattern));

        firstNum = Double.parseDouble(checkFirstNum);

        System.out.println("");
        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("[1] Addition");
        System.out.println("[2] Subtraction");
        System.out.println("[3] Multiplication");
        System.out.println("[4] Division");
        System.out.println("");

        do {
            System.out.print("Please enter the operation: ");
            choice = s.nextDouble();
            operation = Math.abs((int) choice);
        } while (operation < 1 || operation > 4);
        System.out.println("------------------------------------");
        System.out.println("");
        System.out.println("");

        do {
            System.out.print("Please enter the second number: ");
            checkSecondNum = s.next();
        } while (!checkSecondNum.matches(pattern));

        secondNum = Double.parseDouble(checkSecondNum);

        switch (operation) {
            case 1:
                Operations opAdd = new Addition();
                opAdd.method(firstNum, secondNum);
                break;
            case 2:
                Operations opSub = new Subtraction();
                opSub.method(firstNum, secondNum);
                break;
            case 3:
                Operations opMultiply = new Multiplication();
                opMultiply.method(firstNum, secondNum);
                break;
            case 4:
                if (secondNum == 0) {
                    System.out.println("------------------------------------");
                    System.out.println("  Error! (Denominator cannot be 0)  ");
                    System.out.println("------------------------------------");
                    System.out.println("");
                    System.out.println("");
                    do {
                        do {
                            System.out.print("Please re-enter the second number: ");
                            checkSecondNum = s.next();
                        } while (!checkSecondNum.matches(pattern));
                        secondNum = Double.parseDouble(checkSecondNum);
                    } while (secondNum <= 0);
                }
                Operations opDivide = new Division();
                opDivide.method(firstNum, secondNum);
                break;
            default:
                System.out.println("No such operation!");
                break;
        }

    }

}
