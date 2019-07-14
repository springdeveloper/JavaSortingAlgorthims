package com.app.navneet;

public class BinearySearch {

	public static int getBinearySearch(int arr[], int beg, int end, int item) {
		int mid;
		if (end >= beg) {
			mid = (beg + end) / 2;
			if (arr[mid] == item) {
				return mid+1;
			} else if (arr[mid] < item) {
				return getBinearySearch(arr, mid + 1, end, item);
			} else {
				return getBinearySearch(arr, beg, mid - 1, item);
			}
		}

		return -1;
	}

	public static void main(String[] args) {
	    int arr[] = {16, 19, 20, 23, 45, 56, 78, 90, 96, 100};  
        System.out.println(arr[getBinearySearch(arr, 0, arr.length, 90)-1]);
        System.out.println(arr[7]);
	}

}
