package week1.day2;

public class MyCalculator {
	
	public static void main(String[] args) {
		
		Calculator Calc = new Calculator();
		
		int sumOfNumbers = Calc.sumOfNumbers(4, 5, 6);
		System.out.println(sumOfNumbers);
		int subOfNumbers = Calc.subOfNumbers(2, 3);
		System.out.println(subOfNumbers);
		double mulOfNumbers = Calc.mulOfNumbers(7.33456, 8.56534);
		System.out.println(mulOfNumbers);
		float divisionOfNumbers = Calc.divisionOfNumbers(3.4F, 4.84F);
		System.out.println(divisionOfNumbers);
		
		
	}

}
