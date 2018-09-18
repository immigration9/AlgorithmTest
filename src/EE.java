import java.util.Scanner;

public class EE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		for (int i = a; i <= b; i++) {
			System.out.print(i);
			System.out.print(" ");
		}
		for (int j = b - 1; j >= c; j-- ) {
			System.out.print(j);
			if (j != c) System.out.print(" ");
		}
	}
}
