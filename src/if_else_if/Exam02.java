package if_else_if;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("정수 입력 >> ");
		num = sc.nextInt();
		
		if((num/3 != 0 && num%3 ==0) && (num/4 != 0 && num%4 == 0)) {
			System.out.println("3의 배수와 4의 배수 포함");
		} else if((num/3 != 0) && (num%3 ==0)) {
			System.out.println("3의 배수");
		} else if((num/4 != 0) && (num%4 ==0)) {
			System.out.println("4의 배수");
		} else if( (num/3 != 0 && num%3 !=0) && (num/4 != 0 && num%4 != 0) ) {
			System.out.println("3의 배수도 4의 배수도 아님");
		} else if(num==0){
			System.out.println("잘못 입력");
		}
	}
}