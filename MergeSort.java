import java.util.*;
import java.io.*;

class MergeSort{
	static int count=0;
	
	void merge(int arr[], int start, int mid, int end){
		int i=0, j=0, k=0;
		count++;
		int n1 = mid - start +1;
		count++;
		int n2 = end - mid;
		count++;
		int L[] = new int[n1];
		count++;
		int R[] = new int[n2];
		count++;
		count++;
		for(i=0;i<n1;i++){
			count++;
			L[i] = arr[start+i];
			count++;
			
		}
		count++;
		for(j=0;j<n2;j++){
			count++;
			R[j] = arr[mid+1+j];
			count++;
		}
		count++;
		 k = start; 
		count++;
		i=0;
		count++;
		j=0;
		count++;
        	while (i < n1 && j < n2) { 
			count++;
            		if (L[i] <= R[j]) { 
			count++;
                	arr[k] = L[i]; 
			count++;
                	i++; 
			count++;
            		} 
            		else { 
				count++;
                		arr[k] = R[j]; 
				count++;
                		j++; 
            		} 
		count++;
            	k++; 
        	} 
  		count++;
        	while (i < n1) { 
			count++;
            		arr[k] = L[i]; 
			count++;
            		i++;
			count++; 
            		k++; 
			count++;
        	} 
  		count++;
        	while (j < n2) { 
			count++;
            		arr[k] = R[j]; 
			count++;
            		j++; 
			count++;
            		k++; 
			count++;
        	} 
	}

	void mergesort(int arr[], int start, int end){
		count++;
		if(start<end){
			count++;
			count++;
			int mid = (start+end)/2;
			count++;
			mergesort(arr,start,mid);
			count++;
			mergesort(arr,mid+1,end);
			count++;
			merge(arr,start,mid,end);
		}
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
		mergesort(arr,0,size_of_array-1);
		for(i = 0; i < size_of_array; ++i) 
            	System.out.print(arr[i] + " "); 
		System.out.println("No. of steps : "+ count);
	}

}

           