package com.app.navneet;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 12, 4, 23, 7, 10, 65, 98 };
		bubbleSort(arr, arr.length);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void bubbleSort(int[] arr, int n) {

		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++)
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
					
		}
		
	}

}
