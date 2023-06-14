package if_;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 세 수를 입력 받아 가장 큰 수 출력		
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		System.out.print("세 정수 입력 : ");
		num1 = sc.nextInt(); // 5
		num2 = sc.nextInt(); // 7
		num3 = sc.nextInt(); // 6
		
		if(num1 >= num2 || num1 >= num3) {
			if(num1 > num2 && num1 > num3)		
				System.out.println(num1);
			if(num1 == num2 && num2 == num3 && num1 == num3)		
				System.out.println(num1);
			System.out.println(num1);
		} 
		if(num2 >= num1 || num2 >= num3) {
			if(num2 > num1 && num2 > num3)		
				System.out.println(num2);
			if(num2 == num1 && num2 == num3 && num1 == num3)
				System.out.println(num2);
			System.out.println(num2);
		}
		if(num3 >= num1 || num3 >= num2) {
			if(num3 > num1 && num3 > num2)		
				System.out.println(num3);
			if(num3 == num1 && num3 == num2 && num1 == num2)		
				System.out.println(num3);
			System.out.println(num3);
		}
		
	}

}
