package GuGUdann;

public class Main {
	public static void main(String[] args) {
		System.out.println("자 게임을 시작하지 곱셈이다.");
		int num1, num2;
		num1 = Calculator.Input1();
		num2 = Calculator.Input1();
		int result = Calculator.Multiply1(num1, num2);
	}

}
