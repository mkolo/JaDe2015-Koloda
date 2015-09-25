package lv.JaDe.m0;

import java.util.Arrays;

public class Search {
	
	/**
	 * Find the first occurrence of x in sorted array a.
	 * @param x value to find
	 * @param a array sorted in increasing order (a[0] <= a[1] <= ... <= a[n-1])
	 * @return lowest i such that a[i]==x, or -1 if x not found in a.
	 */
	public static int find(int x, int[] a) {
		int f;

		System.out.println("x:"+x);
		f = binarySearch(x,a);

		return f;
	} 
	

	public static int binarySearch(int x, int[] a) {

//		System.out.println("\n----------");
		int end = a.length;
		int mid = a.length / 2;
		if (x < a[mid]) {
			int[] pirms = Arrays.copyOfRange(a,0,mid);

//			for (int i = 0; i < pirms.length; i++) System.out.print(" "+pirms[i]+" ");

			return binarySearch(x, pirms);
		} else if (x > a[mid]) {
			int[] pec = Arrays.copyOfRange(a,mid,end-1);

//			for (int i = 0; i < pec.length; i++) System.out.print(" "+pec[i]+" ");

			return binarySearch(x, pec);
		} else {
			return a[mid]; // because x == a[mid], i.e. we found it!
		}
	}
}
