package week1.day2.assignements;

public class Calculator {

	public int add(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		return sum;
	}

	public int sub(int num1, int num2) {
		int sub = num1 - num2;
		return sub;
	}

	public double mul(double num1, double num2) {
		double mult = num1 * num2;
		return mult;
	}

	public float div(float num1, float num2) {
		float divi = num1 / num2;
		return divi;
	}

	public static void main(String[] args) {

		Calculator Calc = new Calculator();
		System.out.println("Addition Value is " + Calc.add(1, 2, 3));
		System.out.println("Subtraction Value is " + Calc.sub(8, 4));
		System.out.println("Mutliplication Value is " + Calc.mul(250, 100));
		System.out.println("Division Value is " + Calc.div(5, 4));
	}

}
