/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YAN
 */
public class Addition extends Operations {

    private double addition;

    public void method(double firstNum, double secondNum) {

        addition = firstNum + secondNum;

        System.out.println("");
        System.out.println("The addition of " + firstNum + " and " + secondNum + " is " + addition);

    }

}
