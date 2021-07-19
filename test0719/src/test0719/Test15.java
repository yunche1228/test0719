package test0719;

import java.util.Scanner;

public class Test15 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr1 = new int[2][4];
		int[][] arr2 = new int[2][4];
		int[][] result = new int[2][4];
		System.out.println("frist array");
		for(int i=0; i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("second array");
		for(int i=0; i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		sc.close();
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				result[i][j]=arr1[i][j]*arr2[i][j];
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}

}
