import java.util.Scanner;

public class DD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
//		
//		int[] arr = { a, b, c };
//		int min = arr[0];
//		int max = arr[0];
//		int ans = arr[0];
		
//		for (int i = 0; i < arr.length; i++) {
//			if ( arr[i] <= min) {
//				min = arr[i];
//			}
//			if ( arr[i] >= max ) {
//				max = arr[i];
//			}
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			if ( arr[i] != min && arr[i] != max ) {
//				ans = arr[i];
//			} 
//		}
		
		int median = 0;
		if ( a > b) {
			if ( a > c ) {
				if ( b > c ) {
					median = b;
				} else {
					median = c;
				}
			} else {
				median = a;
			}
		} else {
			if ( b > c ) {
				if ( a > c ) {
					median = a;
				} else {
					median = c;
				}
			} else {
				median = b;
			}
		}
		System.out.print(median);
	}
}
