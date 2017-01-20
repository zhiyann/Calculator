/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YAN
 */
class Multiplication extends Operations {

    private double multiplication;

    public void method(double firstNum, double secondNum) {

        multiplication = firstNum * secondNum;

        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("               Answer               ");        
        System.out.println("The multiplication of " + firstNum + " and " + secondNum + " is " + multiplication);
        System.out.println("------------------------------------");

    }
}
