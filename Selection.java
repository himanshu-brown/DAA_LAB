
import java.util.*;
public class Selection {

	public static void sort(int array[]) {
		int i=0, j=0, size=array.length, temp=0, min=0, count=0;
		count++;
		count++;
		for(i=0; i<=size-1 ; i++) {
			count++;
			min = i;
			count++;
			count++;
			for(j=i+1; j<size; j++) {
				count++;
				if(array[min] > array[j]){
					count++;
					min = j;
				}
					count++;
					
			}
			
			count++;
			temp = array[min];
			count++;
			array[min] = array[i];
			count++;
			array[i] = temp;
			count++;
			
		}
		System.out.println("Array after sorting : ");
		for(i=0; i<size; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.print("No. of steps : "+count);
	}

	public static void main(String args[]) throws Exception {
		Scanner scan = new Scanner(System.in);
		int array[] = null; 
		int i=0;
		System.out.print("Enter the size of an array : ");
		int size_of_array = scan.nextInt();
		array = new int[size_of_array];
		System.out.print("Enter the element of an array : ");
		for(i=0; i<size_of_array; i++) {
			array[i] = scan.nextInt();
		}
		sort(array);

	}

}

