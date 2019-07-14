package com.app.navneet;

public class SelectionSort {
 
	
	public static void selectionSort(int [] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int min_arry_index=i;
			for(int j=i+1;j<n;j++)
				if(arr[j]<arr[min_arry_index]) 
					min_arry_index=j;	
				
			
			int temp=arr[min_arry_index];
			arr[min_arry_index]=arr[i];
			arr[i]=temp;
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
        int[] arr = { 4, 5, 3, 2, 4, 1 }; 
		selectionSort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
