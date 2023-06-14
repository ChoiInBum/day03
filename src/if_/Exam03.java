package if_;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		// 두 수를 입력 받아 큰 수가 짝수면 출력
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("두 정수 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1 >= num2 && num1%2 == 0) {
			System.out.println(num1);
		} if(num2 >= num1 && num2%2 == 0) {
			System.out.println(num2);
		}
	}
}