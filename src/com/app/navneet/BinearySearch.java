package com.app.navneet;

public class BinearySearch {

	public static int getBinearySearch(int arr[], int beg, int end, int item) {
		int mid;
		if (end >= beg) {
			mid = (beg + end) / 2;
			if (arr[mid] == item) {
				return mid + 1;
			} else if (arr[mid] < item) {
				return getBinearySearch(arr, mid + 1, end, item);
			} else {
				return getBinearySearch(arr, beg, mid - 1, item);
			}
		}

		return -1;
	}

	public static void mergeSort(int[] arr, int n) {
		if (n < 2) {
			return;
		}
		int mid = n / 2;
		int left[] = new int[mid];
		int right[] = new int[n - mid];
		System.arraycopy(arr, 0, left, 0, mid);
//		for (int i = 0; i < mid; i++) {
//			left[i] = arr[i];
//		}
		// System.arraycopy(arr, 0, right, mid, n-mid-1);

		for (int i = mid; i < n; i++) {
			right[i - mid] = arr[i];
		}

		mergeSort(left, mid);
		mergeSort(right, n - mid);
		mergeArr(arr, left, right, mid, n - mid);

	}

	private static void mergeArr(int[] arr, int[] left, int[] right, int l, int r) {
		int i = 0;
		int j = 0;
		int k = 0;
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

		while (j < l) {
			arr[k++] = right[j++];
		}

	}

	public static void main(String[] args) {
		int arr[] = { 23, 46, 47, 89, 900, 3, 20, 23, 45, 56, 78, 90, 96, 100 };
		mergeSort(arr, arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		int n = arr.length - 1;
		System.out.println("===================");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(getBinearySearch(arr, 0, n, 3));
		System.out.println(arr[7]);
	}

}
