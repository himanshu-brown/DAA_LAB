import java.util.*;
public class Day_22_Bubble_Sort {
	
	static int count = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int array[] = null;
		int i=0,j=0,temp=0;
		System.out.print("Enter the size of an array : ");
		int size = scan.nextInt();
		array = new int[size];
		System.out.println("Enter the element of an array : ");
		for(i=0; i<size; i++) 
			array[i] = scan.nextInt();
		
		for(i=1; i<size-1; i++) {
			count++;
			count++;
			for(j=0; j<size-i; j++) {
				count++;
				if(array[j]>array[j+1]) {
					count++;
					temp=array[j];
					count++;
					array[j]=array[j+1];
					count++;
					array[j+1]=temp;
					count++;
				}
				count++;
			}
			count++;
		}
		System.out.println("Array after sorted : ");
		for(i=0; i<size; i++)
			System.out.print(array[i]+" ");
		System.out.println();
		System.out.print("Count : "+count);
		

	}

}
