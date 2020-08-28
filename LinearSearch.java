import java.util.*;
import java.io.*;
class LinearSearch{
	static int count=0;
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int i=0, j=0, target=0, found=0;
		int arr[] = null;
		System.out.print("Enter the size of array : ");
		int size_of_array = scanner.nextInt();
		arr = new int[size_of_array];
		System.out.println("Enter the element of an array : ");
		for(i=0;i<size_of_array;i++){
			arr[i]=scanner.nextInt();
		}
		System.out.print("Enter the element want to be search : ");
		target=scanner.nextInt();
		found=linearsearch(arr,size_of_array,target);
		if(found==-1)
		System.out.println("Element not found");
		else
		System.out.println("Element found at "+ found +" position");
		System.out.print("No. of steps : " + count);
	}
	public static int linearsearch(int arr[], int size_of_array, int target){
		int i=0;
		count++;
		count++;
		for(i=0;i<size_of_array;i++){
			if(arr[i]==target){
				count++;
				count++;
				return i+1;
			}
		count++;
		}
		count++;
		return -1;
	}
}