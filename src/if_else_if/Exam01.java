package if_else_if;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cof;
		int price = 2000;
		
		System.out.print("커피 주문량 : ");
		cof = sc.nextInt();
		
		if(cof>0 && cof<11) {
			System.out.println("금액 : "+cof*price+"원");
		} else if(cof>10) {
			System.out.println("금액 : "+((cof-cof%10)*price+cof%10*1500));
		}
	}
}