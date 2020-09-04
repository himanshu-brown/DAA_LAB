import java.util.*;
import java.io.*;

class Counting{
	public static void countingsort(int arr[], int arr1[], int k){
		int i=0, j=0, count =0;
		count++;
		count++;
		int c[] = new int[k+1];
		count++;
		count++;
		for(i=0;i<=k;i++){
			c[i] = 0;
			count++;
			count++;
		}
		count++;
		for(j=0;j<arr.length;j++){
			c[arr[j]] = c[arr[j]] + 1;
			count++;
			count++;
		}
		count++;
		for(i=1;i<=k;i++){
			c[i] = c[i] + c[i-1];
			count++;
			count++;
		}
		count++;
		for(j=arr.length-1;j>=0;j--){
			arr1[c[arr[j]]] = arr[j];
			count++;
			c[arr[j]] = c[arr[j]] - 1;
			count++;
			count++;

		}
		System.out.println("No. of steps : "+ count);
	}
	public static void main(String args[]) throws Exception{
		Scanner scan = new Scanner(System.in);
		int arr[] = null;
		int arr1[] = null;
		int i=0, k=0;
		System.out.println("Enter the size of an array : ");
		int size_of_array = scan.nextInt();
		arr = new int[size_of_array];
		arr1 = new int[size_of_array+1];
		System.out.println("Enter the element of an array : ");
		for(i=0;i<size_of_array;i++){
			arr[i] = scan.nextInt();
			if(k<arr[i])
			k=arr[i];
		}
		countingsort(arr,arr1,k);
		System.out.println("Array after sorting : ");
		for(i=1;i<=size_of_array;i++){
			System.out.print(arr1[i]+" ");
		}
		

	}
}