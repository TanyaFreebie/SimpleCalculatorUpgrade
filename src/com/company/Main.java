package com.company;

public class Main {

    public static void main(String[] args) {
	double firstValue;
	double secondValue;
	double answer;

	firstValue = 22;
	secondValue =7;

	String operator = "+";

	System.out.println(doArithmetic(firstValue, secondValue, operator));

    }
    public static double doArithmetic(double firstNumber, double secondNumber, String operator){
    	double  answer = 0;

		switch (operator) {
			case "+":
				answer = firstNumber + secondNumber;
				return answer;
			case "-":
				return answer;
			case "*":
				return answer;
			case "/":
				answer = firstNumber / secondNumber;
				return answer;
			default:
				System.out.println("invalid input");
		}
		return answer;
	}

	//create a method that checks two numbers and uses switch to
	//return max, min

}
