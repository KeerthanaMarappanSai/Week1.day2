package week1.day2;

public class LearnMethod {
	
	public static void main(String[] args) {
		LearnMethod L = new LearnMethod();
		L.printCarName();
		int carRegNumber = L.getCarRegNumber();
		System.out.println(carRegNumber);
		String carVarient = L.getCarVarient();
		System.out.println(carVarient);
		int multiplyTwoNumber = L.multiplyTwoNumber(3, 5);
		System.out.println(multiplyTwoNumber);
	}

	public void printCarName() {
		System.out.println("Breeza");
	}
	public int getCarRegNumber() {
		return 5678;
	}
	public String getCarVarient() {
		return "Petrol";
	}
	public int multiplyTwoNumber(int a, int b) {
		return a*b;	
	}
}
