package com.launchacademy.calculator;

public class Sum {
  private int firstNumber;
  private int secondNumber;

  public int getResult(){
    return firstNumber + secondNumber;
  }
  public int getFirstNumber() {
    return firstNumber;
  }

  public void setFirstNumber(int firstNumber) {
    this.firstNumber = firstNumber;
  }

  public int getSecondNumber() {
    return secondNumber;
  }

  public void setSecondNumber(int secondNumber) {
    this.secondNumber = secondNumber;
  }
}
