import java.util.Scanner;

public class FF {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int mid = a / 2;
		
		for (int i = 0; i < a; i++) {
			for (int j = 1; j <= a + i; j++) {
				if (j == a - i) {
					System.out.print("*");
				} else if (j == a + i) {
					System.out.print("*");
				} else if (i == mid && (j > a - i && j < a + i)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			if (i != a - 1) System.out.println("");
		}
	}
}
