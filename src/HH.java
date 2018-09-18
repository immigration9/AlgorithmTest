import java.util.ArrayList;
import java.util.Scanner;

public class HH {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		int val = sc.nextInt();
		arr.add(val);
		while(sc.hasNextInt()) {
			val = sc.nextInt();
			arr.add(val);
		}
		System.out.print(arr.size());
		printArray(arr, 0, arr.size() - 1);
		
		mergeSort(arr, 0, arr.size() - 1);
		printArray(arr,0, arr.size() - 1);
	}
	
	public static void mergeSort(ArrayList<Integer> arr, int l, int r) {
		if (l < r) {
			int middle = l + (r - l) / 2;
			mergeSort(arr, l, middle);
			mergeSort(arr, (middle + 1), r);
			merge(arr, l, middle, r);
		}
	}
	
	public static void merge(ArrayList<Integer> arr, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		
		ArrayList<Integer> L = new ArrayList(n1);
		ArrayList<Integer> R = new ArrayList(n2);
		
		for (int i=0; i < n1; i++) {
			L.set(i, arr.get(l + i));
		}
		for (int j=0; j < n2; j++) {
			R.set(j, arr.get(m + 1 + j));
		}
		
		int i = 0, j = 0;
		int k = l;
		
		while (i < n1 && j < n2) {
			if (L.get(i) <= R.get(j)) {
				arr.set(k, L.get(i));
				i++;
			} else {
				arr.set(k, R.get(j));
				j++;
			}
			k++;
		}
		
		while (i < n1) {
			arr.set(k, L.get(i));
			i++;
			k++;
		}
		while (j < n2) {
			arr.set(k, R.get(j));
			j++;
			k++;
		}
	}
	
	public static void printArray(ArrayList<Integer> arr,int start,int end)
	{
		for (int i = start; i <= end; i++) {
			System.out.print(arr.get(i)+" ");
		}
		System.out.println();
	}
}
