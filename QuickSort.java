import java.util.*;
import java.io.*;
class QuickSort{
	static int count=0;
	public static void quicksort(int arr[], int p, int r){
		count++;
		count++;
		if(p<r){
			count++;
			int q=partition(arr,p,r);
			count++;
			quicksort(arr,p,q-1);
			count++;
			quicksort(arr,q+1,r);
		}
	}
		
	public static int partition(int arr[], int p, int r){
		count++;
		count++;
		int i=0, j=0, temp=0;
		count++;
		int x=arr[r];
		count++;
		i=p-1;
		count++;
		for(j=p;j<r;j++){
			count++;
			count++;
			if(arr[j]<=x){
				count++;
				i++;
				count++;
				temp=arr[i];
				count++;
				arr[i]=arr[j];
				count++;
				arr[j]=temp;
			}
		count++;
		}
		count++;
		temp=arr[i+1];
		count++;
		arr[i+1]=arr[r];
		count++;
		arr[r]=temp;
		count++;
		return i+1;		
	}

	public static void main(String args[]) throws Exception{
		Scanner scanner = new Scanner(System.in);
		int arr[] = null;
		int i = 0,j = 0;
		System.out.println("Enter the size of array : ");
		int size_of_array = scanner.nextInt();
		arr = new int[size_of_array];
		System.out.println("Enter the element of array : ");
		for(i=0;i<size_of_array;i++){
			arr[i] = scanner.nextInt();
		}
		quicksort(arr,0,size_of_array-1);
		for(i = 0; i < size_of_array; ++i) 
            	System.out.print(arr[i] + " "); 
		System.out.println("No. of steps : "+ count);
	}
}