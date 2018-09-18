import java.util.Scanner;

public class GG {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				if (i == 0 || i == b - 1) {
					System.out.print("*");
				} else {
					if (j == 0 || j == a - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				
			}
			if (i != b - 1) System.out.println("");
		}
	}

}
