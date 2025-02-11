

import java.util.Scanner;

public class StudentCount {
	public static int totalStudents(int A, int B, int C, int D) {
		return A + B - C + D;
	} 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int tatals = totalStudents(A, B, C, D);
				
		
		System.out.println(totalStudents(A, B, C, D));
		sc.close();
	}
}
