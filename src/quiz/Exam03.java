package quiz;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {		
		/*
		3. 과일가게에서 사과, 복숭아, 포도를 판매합니다. 사과는 개당 1000원, 복숭아는 1200원, 포도는 1400원에 판매합니다. 
		사과, 복숭아, 포도 중 어떤 과일을 살것인지 입력받고 과일을 입력받으면 해당 과일은 개당 얼마인지 출력하고 몇 개를 살것인지 갯수를 입력받아 과일의 총 가격이 얼마인지 출력하세요.
		(다른 과일을 입력받으면 "저희 가게는 사과, 복숭아, 포도만 판매합니다."를 출력하시오)

		ex)
		어떤 과일을 구매하시겠습니까? 1.사과 2.복숭아 3.포도
		1
		사과는 개당 1000원입니다.
		몇 개 구매하시겠습니까? 10
		총 가격은 10000원입니다.

		어떤 과일을 구매하시겠습니까? 1.사과 2.복숭아 3.포도 4.저희 가게는 사과, 복숭아, 포도만 판매합니다.
		
		*/
		
		Scanner sc = new Scanner(System.in);
		int opt;
		int apple = 1000, peach = 1200, grape = 1400, num;
		
		System.out.println("어떤 과일을 구매하시겠습니까? 1. 사과, 2. 복숭아, 3. 포도, 4. 다른 과일 없음");
		opt = sc.nextInt();
		
		if(opt == 1) {
			System.out.println("사과는 개당 1000원입니다.");
			System.out.print("구매 개수 >> ");
			num = sc.nextInt();
			System.out.println("총 가격은 "+(apple*num)+"원");
		} else if(opt == 2) {
			System.out.println("복숭아는 개당 1200원입니다.");
			System.out.print("구매 개수 >> ");
			num = sc.nextInt();
			System.out.println("총 가격은 "+(peach*num)+"원");
		} else if(opt == 3) {
			System.out.println("포도는 개당 1400원입니다.");
			System.out.print("구매 개수 >> ");
			num = sc.nextInt();
			System.out.println("총 가격은 "+(grape*num)+"원");
		} else {
			System.out.println("다른 과일은 없습니다.");
		}
	}
}