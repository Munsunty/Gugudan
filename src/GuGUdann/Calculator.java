package GuGUdann;
import java.util.Scanner;

public class Calculator {
		
 public static int Input1(){
	Scanner sc = new Scanner(System.in);
	System.out.print("숫자를 넣어주세요. >>");
	int num;
	num = sc.nextInt();
	return num;
 }
 
 public static int Multiply1 (int num1, int num2) {
	 int num = num1*num2;
	 return Calculator.Output(num);
	 }
 
 public static int Output(int num) {
	 System.out.println("니가 찾는 숫자는 이것이다.");
	 System.out.println(num);
	 return 0;
 }
 }