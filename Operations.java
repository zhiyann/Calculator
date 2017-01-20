/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YAN
 */
public abstract class Operations {

    private double firstNum;
    private double secondNum;

    public Operations() {

    }

    public Operations(double firstNum, double secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public double getFirstNum() {
        return this.firstNum;
    }

    public double getSecondNum() {
        return this.secondNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public abstract void method(double firstNum, double secondNum);

}
