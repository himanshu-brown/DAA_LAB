import java.util.*;
import java.io.*;
class Insertion{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int arr[] = null;
		int count = 0 , result =0 , i=0 , j=0;
		System.out.print("Enter the size of array : ");
		int size_of_array = scan.nextInt();
		arr = new int[size_of_array];
		System.out.println("Enter the array elements : ");
		for(i=0;i<size_of_array;i++){
			arr[i] = scan.nextInt();
		}
		System.out.println("Array before sorting : ");
		for(i=0;i<size_of_array;i++){
			System.out.print(arr[i]+" ");
		}
     
		for(i=1;i<size_of_array;i++){
			count++;
			int temp = arr[i];
			count++;
			j=i-1;
			count++;
			while(j>=0 && arr[j]>temp){
				count++;
				arr[j+1] = arr[j];
				count++;
				j--;
				count++;
			}
			count++;
			arr[j+1] = temp;
			count++;
		}
		
		System.out.print("Array after sorting : ");
		for(i=0;i<size_of_array;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("No. of steps for sorting"+" : "+count);
	}
}