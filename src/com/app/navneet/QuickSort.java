package com.app.navneet;

public class QuickSort {

	private static int partition(int[] arr, int low, int high) {
		int mid = arr[high];
		int i = (low - 1);
		for (int j = low; j <high; j++) {
			if (arr[j] <= mid) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

			}

		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	public static void sort(int arr[], int low, int high) {
		if (low <high) {

			int pi = partition(arr, low, high);
			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);

		}

	}

	public static void main(String[] args) {
     int arr[]= {34,64,6,89,55,432,12,41,67,1};
     int n=arr.length-1;
		sort(arr, 0,n);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
