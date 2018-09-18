import java.util.Scanner;

public class ZZ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int[] arr = {a, b, c, d};
		
		int length = arr.length;
		for (int i = 0; i < length; i++ ) {
			for (int j = 0; j < length - 1 - i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		printArray(arr, 0, length - 1);
	}
	public static void printArray(int arr[],int start,int end)
	{
		for (int i = start; i <=end; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
