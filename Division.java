/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YAN
 */
class Division extends Operations {

    private double division;

    public void method(double firstNum, double secondNum) {

        division = firstNum / secondNum;

        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("               Answer               ");
        System.out.println("The division of " + firstNum + " and " + secondNum + " is " + division);
        System.out.println("------------------------------------");

    }

}
