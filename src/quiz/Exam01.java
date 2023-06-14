package quiz;

import java.util.Scanner;

/*
	5조 문제
	
	1. 성적표(최인우)
	성명, 점수(JAVA, PYTHON, 영어)를 입력하여 총점, 평균 점수를 구하시오.
	
	EX)
	----------------------------
	성적 입력
	----------------------------
	성명 >> 김진수
	JAVA >> 90
	PYTHON >> 91
	영어 >> 85
	----------------------------
	김진수 개발자 성적표
	----------------------------
	과목	점수
	JAVA	90점
	PYTHON	91점
	영어	85점
	
	총점	266점
	평점	88.66666666666667점
	학점	B+
	----------------------------
	
	※ 평균학점
	95~100 A+
	90~94 A
	85~89 B+
	80~84 B
	75~79 C
	60~74 D
	0~59 F
*/

public class Exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int sub1, sub2, eng, sum;
		double avg;
		String grade = "";
		
		System.out.println("----------------------------");
		System.out.println("성적 입력");
		System.out.println("----------------------------");		
		
		System.out.print("성명 >> ");
		name = sc.next();
		System.out.print("JAVA >> ");
		sub1 = sc.nextInt();
		System.out.print("PYTHON >> ");
		sub2 = sc.nextInt();
		System.out.print("영어 >> ");
		eng = sc.nextInt();
		
		sum = sub1+sub2+eng;
		avg = sum/(double)3;
		
		if(avg>=95 && avg<=100) {
			grade = "A+";
		} else if(avg>=90 && avg<=94) {
			grade = "A";
		} else if(avg>=85 && avg<=89) {
			grade = "B+";
		} else if(avg>=80 && avg<=84) {
			grade = "B";
		} else if(avg>=75 && avg<=79) {
			grade = "C";
		} else if(avg>=60 && avg<=74) {
			grade = "D";
		} else if(avg>=0 && avg<=59) {
			grade = "F";
		}
		
		System.out.println("----------------------------");
		System.out.println(name+" 개발자 성적표");
		System.out.println("----------------------------");
		System.out.println("과목\t점수");	
		System.out.println("JAVA\t"+sub1+"점");
		System.out.println("PYTHON\t"+sub2+"점");
		System.out.println("영어\t"+eng+"점");
		System.out.println();
		System.out.println("총점\t"+sum+"점");
		System.out.println("평점\t"+avg+"점");
		System.out.println("학점\t"+grade);
		System.out.println("----------------------------");
	}
}