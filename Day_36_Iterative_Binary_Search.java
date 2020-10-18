import java.util.*;
public class Day_36_Iterative_Binary_Search {
	
	static int count=0;
	
	static int iterative_binary_search(List<Integer> array,int start,int end, int search) {
		count++;
		count++;
		while(start <= end) {
			count++;
			int mid = (start+end)/2;
			count++;
			count++;
			if(array.get(mid) == search) {
				count++;
				return mid+1;
			}
			count++;
			if(array.get(mid) < search) {
				count++;
				start = mid + 1;
			}
			else{
				count++;
				end = mid - 1;
			}
		}
		count++;
		return -1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> array = new ArrayList<>();
		int i=0, size=0, search=0;
		System.out.print("Enter the size of an array : ");
		size = scan.nextInt();
		System.out.println("Enter the element of an array : ");
		for(i=0; i<size; i++) {
			array.add(scan.nextInt());
		}
		System.out.print("Enter the element you want to be search : ");
		search = scan.nextInt();
		Collections.sort(array);
		int position = iterative_binary_search(array,0,(array.size())-1,search);
		if(position == -1)
			System.out.println(search+" is not present in array");
		else
			System.out.println(search+" is present in array");
		System.out.print("No. of count : "+count);


	}

}
