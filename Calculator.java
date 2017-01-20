
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

        double firstNum, secondNum;
        char operation;

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("                                  Calculator");
        System.out.println("------------------------------------------------------------------------------");

        System.out.print("Please enter the first number: ");
        firstNum = s.nextDouble();

        System.out.print("Please enter the operation: ");
        operation = s.next().charAt(0);

        System.out.print("Please enter the second number: ");
        secondNum = s.nextDouble();

        switch (operation) {
            case '+':
                Operations opAdd = new Addition();
                opAdd.method(firstNum, secondNum);
                break;
            case '-':
                Operations opSub = new Subtraction();
                opSub.method(firstNum, secondNum);
                break;
            case '*':
                Operations opMultiply = new Multiplication();
                opMultiply.method(firstNum, secondNum);
                break;
            case '/':
                if (secondNum == 0) {
                    System.out.println("");
                    System.out.println("------------------------------------");
                    System.out.println("               Error!               ");
                    System.out.println("------------------------------------");
                    do {

                        System.out.print("Please re-enter the second number: ");
                        secondNum = s.nextDouble();

                    } while (secondNum == 0);
                    System.out.println("------------------------------------");
                }
                Operations opDivide = new Division();
                opDivide.method(firstNum, secondNum);
                break;

        }

    }

}
