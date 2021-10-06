package week1.day2.assignements;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator Calc = new Calculator();
		System.out.println("Addition Value is " + Calc.add(1, 2, 3));
		System.out.println("Subtraction Value is " + Calc.sub(8, 4));
		System.out.println("Mutliplication Value is " + Calc.mul(250, 100));
		System.out.println("Division Value is " + Calc.div(5, 4));
	}

}
