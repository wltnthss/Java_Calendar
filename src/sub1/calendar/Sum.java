package sub1.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		System.out.println("두 수를 입력하세요.");
		String s1 = sc.next();
		String s2 = sc.next();	
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		int result = a + b;
		System.out.println("두 수의 합은 "+ result +"입니다.");
		sc.close();
	}
}
