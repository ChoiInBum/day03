package if_;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 입력받고 3의 배수 판별하기
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		if(num%3==0) {
			System.out.println("3의 배수 : "+num);
		} if(num%3!=0) {
			System.out.println("3의 배수 아님 : "+num);
		}
		
	}

}
