package if_else_if;

public class TestClass01 {
	public static void main(String[] args) {
		/*
			if(조건식)
				종속문장
			else if(조건식)
				종속문장
			else if(조건식)
				종속문장
			....
			else
				종속문장
		*/
		int num = 150;
		if(num > 100) {
			System.out.println("100보다 크다.");
		} if(num > 70) {
			System.out.println("70보다 크다");
		} if(num > 50) {
			System.out.println("50보다 크다");
		} else {
			System.out.println("그 외의값 입력");
		}
		System.out.println("다음 문장들 실행!!!");
	}
}