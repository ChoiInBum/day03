package quiz;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		//2. 커피 가격이 4000원인데 10컵이상 주문을 하면 10% 할인을 해준다고 할때 커피의 가격은?
		Scanner sc = new Scanner(System.in);
		
		int price = 4000;
		int num;
		
		System.out.print("커피 주문(컵)>> ");
		num = sc.nextInt();
		
		if(num<10) {
			System.out.println("총 금액 : "+price*num+"원");
		} else if(num>=10) {
			System.out.println("총 금액 : "+((price*9)+((price-400)*(num-9)))+"원");
		}
		
	}
}