package sub1.calendar;

import java.util.Scanner;

public class Prompt {	
		
	public void runPrompt() {
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		int month = 1;
		int year = 2021;
		
		while(true) {
			System.out.println("년도를 입력하세요");
			System.out.print("YEAR> ");
			year = sc.nextInt();
			System.out.println("달을 입력하세요");
			System.out.print("MONTH> ");
			month = sc.nextInt();
			if (month == -1) {
				break;
			}
			if (month > 12) {
				System.out.println("\n1~12월 사이를 입력해주세요.\n");
				continue;
			}
			cal.printCalendar(year, month);
		}			
		System.out.println("Bye ~");
		sc.close();
	}		
	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
