package if_;

import java.util.Scanner;

public class TestClass02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("수 입력 : ");
		num = input.nextInt();
		
		if(num>10) {
			System.out.println("1종속문장 실행");
			System.out.println("2종속문장 실행");
			System.out.println("3종속문장 실행");
		}
		System.out.println("다음 문장");
	}
}