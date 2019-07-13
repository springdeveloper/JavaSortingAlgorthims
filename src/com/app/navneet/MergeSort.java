package com.app.navneet;

public class MergeSort {

	public static void mergeSort(int[] arr, int n) {
		if (n < 2) {
			return;
		}

		int mid = n / 2;
		int left[] = new int[mid];
		int right[] = new int[n - mid];

		for (int i = 0; i < mid; i++) {
			left[i] = arr[i];
		}
		for (int i = mid; i < n; i++) {
			right[i - mid] = arr[i];
		}

		mergeSort(left, mid);
		mergeSort(right, n - mid);
		mergeArray(arr, left, right, mid, n - mid);
	}

	public static void mergeArray(int arr[], int left[], int[] right, int l, int r) {

		int i = 0, j = 0, k = 0;
		while (i < l && j < r) {
			if (left[i] <= right[j]) {
				arr[k++] = left[i++];
			} else {
				arr[k++] = right[j++];
			}
		}
		while (i < l) {
			arr[k++] = left[i++];
		}
		while (j < r) {
			arr[k++] = right[j++];
		}
	}

	public static void main(String[] args) {
		int arr[] = { 12, 4, 23, 7, 10, 65, 98 };
		mergeSort(arr, arr.length);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
